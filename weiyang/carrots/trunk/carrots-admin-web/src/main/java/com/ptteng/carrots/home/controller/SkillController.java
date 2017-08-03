package com.ptteng.carrots.home.controller;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.FilterRegistration.Dynamic;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.util.SystemOutLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ptteng.carrots.home.model.Occupation;
import com.ptteng.carrots.home.model.Skill;
import com.ptteng.carrots.home.model.TalentSkillRelation;
import com.ptteng.carrots.home.service.AppraisalService;
import com.ptteng.carrots.home.service.OccupationService;
import com.ptteng.carrots.home.service.SkillService;
import com.ptteng.carrots.home.service.TalentSkillRelationService;
import com.qcloud.cosapi.http.ResponseBodyKey.Data;
import com.qding.common.util.DataUtils;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import util.DynamicUtil;





/**
 * Skill  crud
 * 
 * @author magenm
 * @Date 2014-4-16 13:43
 * 
 */
@Controller
public class SkillController {
	private static final Log log = LogFactory.getLog(SkillController.class);

	@Autowired
	private SkillService skillService;

	@Autowired
	private OccupationService occupationService;
	
	@Autowired
	private AppraisalService appraisalService;

	@Autowired
	private TalentSkillRelationService talentSkillRelation;



    /**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */

	/*@RequestMapping(value = "/c/skill", method = RequestMethod.GET)
	public String getskillList(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) throws Exception {

		
		
		log.info("/skill  to /skill/view/skillList");

		return "/carrots-home-service/skill/view/skillList";
	}
    
    

    
	
	@RequestMapping(value = "/c/skill/{id}", method = RequestMethod.GET)
	public String getSkill(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("/skill/" + id + "  to /skill/view/skillDeail");
		if(null != id){
			model.addAttribute("id", id);
		}else{
			model.addAttribute("id", 0);
		}

		return "/carrots-home-service/skill/view/skillDetail";
	}*/
	
	
	
	    
	
	//获取职业下的技能
	@RequestMapping(value = "/a/occupation/{oid}/skill", method = RequestMethod.GET)
	public String getSkillJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long oid
			)  throws Exception {

		log.info("get data : id= " + oid);
		//校验
		if (DataUtils.isNullOrEmpty(oid)) {
			model.addAttribute("code", -11026);
			return "/common/fail";
		}		
	/*	if (DataUtils.isNullOrEmpty(occupation)) {
			model.addAttribute("code", -11027);
			return "/common/fail";
		} */
		
		log.info("get Occupation, oid is" + oid);
		try {
		//	Long skillOId = skill.getOccupationId();
			
			//1.获取skill表中的occupation_id所对应的id
			Map<String,Object> map = new HashMap<String,Object>();  //Map<String,Object> map = DynamicUtil.getOccupationList(oid);
			map = DynamicUtil.getOccupationList(oid);
			List<Long> sidList = skillService.getIdsByDynamicCondition(Skill.class, map, 0, Integer.MAX_VALUE);
			
			
			//獲取occupationId對應的對象
			List<Skill> skillList = skillService.getObjectsByIds(sidList);
			
			if(DataUtils.isNullOrEmpty(skillList)) {
				log.info("skillList is null");
				model.addAttribute("code",-11030);//修改
				return "/common/success";
			}

			model.addAttribute("code", 0);

			model.addAttribute("skillList", skillList);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("get skill error,id is  " + oid);
			model.addAttribute("code", -100000);
		}

		return "/carrots-home-service/skill/json/skillListJson";
	}

	//更新技能等级
	@RequestMapping(value = "/a/u/skill/{id}", method = RequestMethod.PUT)
	public String updateSkillJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Skill skill,@PathVariable Long id) throws Exception {
		
		log.info("update skill : skill= " + skill);
		//校验
		if (DataUtils.isNullOrEmpty(id)) {
			model.addAttribute("code", -11026);
			return "/common/fail";
		}
		
		Skill skillOid = skillService.getObjectById(id);
		
		if (DataUtils.isNullOrEmpty(skill)) {
			model.addAttribute("code", -11029);
			return "/common/fail";
		}
		//接收前台传过来的skilljson
		JSONArray jsonSkill = JSONArray.fromObject(skillOid);
		List<TalentSkillRelation> talentSkillRelationList = new ArrayList<TalentSkillRelation>();
		for (int i = 0; i < jsonSkill.size(); i++) {
			TalentSkillRelation talentSkillRelation = new TalentSkillRelation();
			JSONObject skillList = jsonSkill.getJSONObject(i);
			
			//获取skillId和priority
			skillList.get("skillId");
			skillList.get("priority");
			
			talentSkillRelation.setSkillId(skillList.getLong("skillId"));
			
			
		}

		
		try {
			//跟新技能树
			if (!StringUtils.isBlank(skill.getName())) {
				skill.setName(skill.getName());
			}
			if (!StringUtils.isBlank(skill.getContent())) {
				skill.setContent(skill.getContent());
			}
			if (skill.getPriority() != null && skill.getPriority() > 0) {
				skill.setPriority(skill.getPriority());
			}
			if (skill.getSort() != null && skill.getSort() > 0) {
				skill.setSort(skill.getSort());
			}
			
			skillService.update(skill);

			model.addAttribute("code", 0);

			model.addAttribute("skill", skill);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("update skill error,id is  " + skill.getId());
			model.addAttribute("code", -6003);

		}

		return "/data/json";
	}

//	@RequestMapping(value = "/a/skill", method = RequestMethod.POST)
//	public String addSkillJson(HttpServletRequest request,
//			HttpServletResponse response, ModelMap model, Skill skill) throws Exception {
//		
//		log.info("update skill : skill= " + skill);
//		
//		try { 
//			skill.setId(null);
//
//			skillService.insert(skill);
//
//			model.addAttribute("code", 0);
//		} catch (Throwable t) {
//		    t.printStackTrace();
//			log.error(t.getMessage());
//			log.error("add skill error ");
//			model.addAttribute("code", -6002);
//		}
//
//		return "/data/json";
//	}

	@RequestMapping(value = "/a/skill/{id}", method = RequestMethod.DELETE)
	public String deleteSkillJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("delete skill : id= " + id);
		try {
			skillService.delete(id);

			log.info("add skill success");
			model.addAttribute("code", 0);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("delete skill error,id is  " + id);
			model.addAttribute("code", -6004);

		}

		return "/data/json";
	}
	
	
	@RequestMapping(value = "/a/multi/skill", method = RequestMethod.GET)
	public String getMultiSkillJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Long[] ids)
			throws Exception {
			
		List<Long> idList = new ArrayList();	
	   if (ids == null) {

		} else {
			idList = Arrays.asList(ids);
		}
		try {

			

			List<Skill> skillList = skillService.getObjectsByIds(idList);
			log.info("get  skill data is " + skillList);

			model.addAttribute("code", 0);			
			model.addAttribute("total",skillList.size());

			model.addAttribute("skillList", skillList);

		} catch (Throwable t) {
			log.error(t.getMessage());
			log.error("get skill error,id is  " + idList);
			model.addAttribute("code", -100000);
		}

		return "/carrots-home-service/skill/json/skillListJson";
	}
	
	
	
	
	
}

