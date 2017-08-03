package com.ptteng.carrots.home.controller;

import com.ptteng.carrots.home.model.Appraisal;
import com.ptteng.carrots.home.model.Skill;
import com.ptteng.carrots.home.model.TalentSkillRelation;
import com.ptteng.carrots.home.service.AppraisalService;
import com.ptteng.carrots.home.service.SkillService;
import com.ptteng.carrots.home.service.TalentSkillRelationService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import util.DynamicUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by oeasy9999 on 2017/3/30.
 */
@Controller
public class AppraisalController {
    private static final Log log = LogFactory.getLog(AppraisalController.class);
    @Autowired
    private AppraisalService appraisalService;
    @Autowired
    private SkillService skillService;
    @Autowired
    private TalentSkillRelationService talentSkillRelationService;

//    @RequestMapping(value = "/a/appraisal/{id}", method = RequestMethod.GET)
//    public String getAppraisalJson(HttpServletRequest request, HttpServletResponse response, ModelMap model,
//                                   @PathVariable Long id) throws Exception {
//        log.info("get data : id = " + id);
//        try {
//            Appraisal appraisal = appraisalService.getObjectById(id);
//            log.info("get appraisal data is " + appraisal);
//
//            Map<String, Object> skillMap = new HashMap<String, Object>();
//            skillMap = DynamicUtil.getSkillList();
//            List<Long> ids = skillService.getIdsByDynamicCondition(Skill.class, skillMap, 0, Integer.MAX_VALUE);
//
//            List<Skill> skillList = skillService.getObjectsByIds(ids);
//
//            //循环遍历skill
//            List<Skill> skills = new ArrayList<Skill>();
//            for (Skill skill : skillList) {
//                Long skillId = skill.getId();
//                Long appraisalId = appraisal.getId();
//                Map<String, Object> relationDegree = new HashMap<String, Object>();
//                relationDegree = DynamicUtil.getSkillDegreeNum(skillId, appraisalId);
//
//                List<Long> skillDegree = talentSkillRelationService.getIdsByDynamicCondition(TalentSkillRelation.class, relationDegree, 0, Integer.MAX_VALUE);
//
//                List<TalentSkillRelation> talentSkillRelationList = talentSkillRelationService.getObjectsByIds(skillDegree);
//
//                if (talentSkillRelationList.size() > 0) {
//                    TalentSkillRelation talentSkillRelation = new TalentSkillRelation();
//                    talentSkillRelation = talentSkillRelationList.get(0);
//                    int degree = talentSkillRelation.getDegree();
//                    skill.setPriority(degree);
//                    skills.add(skill);
//                }
//            }
//            model.addAttribute("skillList", skills);
//            model.addAttribute("code", 0);
//            model.addAttribute("appraisal", appraisal);
//        } catch (Throwable t) {
//            t.printStackTrace();
//            log.error(t.getMessage());
//            log.error("get appraisal error, id = " + id);
//            model.addAttribute("code", -100000);
//        }
//        return "/carrots-home-service/appraisal/json/appraisalDetailJson";
//    }
    
    @RequestMapping(value = "/a/appraisal/{id}", method = RequestMethod.GET) 
	public String getAppraisalJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)//@PathVariable传过来的值到方法的参数上
			throws Exception {
		//日志记录获取的id
		log.info("get data : talent id= " + id); 
		
		
		try {
			List<Long> appraisalIds = appraisalService.getAppraisalIdsByTalentId(id, 0, Integer.MAX_VALUE);
			
			//1.获取这个appraisal对象
			Appraisal appraisal = appraisalService.getObjectById(appraisalIds.get(0));
			log.info("get appraisal data is " + appraisal);

		
			//2.new出来一个map来存放查询的参数
			Map<String,Object> skillMap=new HashMap<String,Object>();
			skillMap=DynamicUtil.getSkillList();
			List<Long> ids=skillService.getIdsByDynamicCondition(Skill.class, skillMap, 0, Integer.MAX_VALUE);
			
			List<Skill> skillList = skillService.getObjectsByIds(ids);
			
			//循环遍历skill
			List<Skill> skill1=new ArrayList<Skill>();
			for(int i = 0; i < skillList.size(); i++) {
				Skill skill=skillList.get(i);
				Long skillId = skillList.get(i).getId();
				Long appraisalId = appraisal.getId();
				Map<String,Object> relationDegree = new HashMap<String,Object>();
				relationDegree = DynamicUtil.getSkillDegreeNum(skillId, appraisalId);
				
				List<Long> SkillDegree = talentSkillRelationService.getIdsByDynamicCondition(TalentSkillRelation.class, relationDegree, 0, Integer.MAX_VALUE);
				
				List<TalentSkillRelation> talentSkillRelationList =talentSkillRelationService.getObjectsByIds(SkillDegree);
				
				if(talentSkillRelationList.size()>0)
				{
					TalentSkillRelation talentSkillRelation =new TalentSkillRelation();
					talentSkillRelation=talentSkillRelationList.get(0);
					int degree = talentSkillRelation.getDegree();
					skill.setPriority(degree);
					skill1.add(skill);
				}
			
			}
			model.addAttribute("skillList", skill1);
			model.addAttribute("code", 0);
			model.addAttribute("appraisal", appraisal);
			
			

		} catch (Exception t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("get appraisal error,id is  " + id);
			model.addAttribute("code", -100000);
		}
		//返回json拼接串
		return "/carrots-home-service/appraisal/json/appraisalDetailJson";
	}
    
}
