package com.ptteng.carrots.home.controller;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ptteng.carrots.home.model.TalentSkillRelation;
import com.ptteng.carrots.home.service.TalentSkillRelationService;

/**
 * TalentSkillRelation  crud
 * 
 * @author magenm
 * @Date 2014-4-16 13:43
 * 
 */
@Controller
public class TalentSkillRelationController {
	private static final Log log = LogFactory.getLog(TalentSkillRelationController.class);

	@Autowired
	private TalentSkillRelationService talentSkillRelationService;






    /**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */

	@RequestMapping(value = "/c/talentSkillRelation", method = RequestMethod.GET)
	public String gettalentSkillRelationList(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) throws Exception {

		
		
		log.info("/talentSkillRelation  to /talentSkillRelation/view/talentSkillRelationList");

		return "/carrots-home-service/talentSkillRelation/view/talentSkillRelationList";
	}
    
    

    
	
	@RequestMapping(value = "/c/talentSkillRelation/{id}", method = RequestMethod.GET)
	public String getTalentSkillRelation(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("/talentSkillRelation/" + id + "  to /talentSkillRelation/view/talentSkillRelationDeail");
		if(null != id){
			model.addAttribute("id", id);
		}else{
			model.addAttribute("id", 0);
		}

		return "/carrots-home-service/talentSkillRelation/view/talentSkillRelationDetail";
	}
	
	
	
	    
	

	@RequestMapping(value = "/a/talentSkillRelation/{id}", method = RequestMethod.GET)
	public String getTalentSkillRelationJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("get data : id= " + id);
		try {
			TalentSkillRelation talentSkillRelation = talentSkillRelationService.getObjectById(id);
			log.info("get talentSkillRelation data is " + talentSkillRelation);

			model.addAttribute("code", 0);

			model.addAttribute("talentSkillRelation", talentSkillRelation);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("get talentSkillRelation error,id is  " + id);
			model.addAttribute("code", -100000);
		}

		return "/carrots-home-service/talentSkillRelation/json/talentSkillRelationDetailJson";
	}

	@RequestMapping(value = "/a/talentSkillRelation/{id}", method = RequestMethod.PUT)
	public String updateTalentSkillRelationJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, TalentSkillRelation talentSkillRelation) throws Exception {
		
		log.info("update talentSkillRelation : talentSkillRelation= " + talentSkillRelation);
		
		try {
			
			talentSkillRelationService.update(talentSkillRelation);

			model.addAttribute("code", 0);

			model.addAttribute("talentSkillRelation", talentSkillRelation);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("update talentSkillRelation error,id is  " + talentSkillRelation.getId());
			model.addAttribute("code", -6003);

		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/talentSkillRelation", method = RequestMethod.POST)
	public String addTalentSkillRelationJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, TalentSkillRelation talentSkillRelation) throws Exception {
		
		log.info("update talentSkillRelation : talentSkillRelation= " + talentSkillRelation);
		
		try { 
			talentSkillRelation.setId(null);

			talentSkillRelationService.insert(talentSkillRelation);

			model.addAttribute("code", 0);
		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("add talentSkillRelation error ");
			model.addAttribute("code", -6002);
		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/talentSkillRelation/{id}", method = RequestMethod.DELETE)
	public String deleteTalentSkillRelationJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("delete talentSkillRelation : id= " + id);
		try {
			talentSkillRelationService.delete(id);

			log.info("add talentSkillRelation success");
			model.addAttribute("code", 0);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("delete talentSkillRelation error,id is  " + id);
			model.addAttribute("code", -6004);

		}

		return "/data/json";
	}
	
	
	@RequestMapping(value = "/a/multi/talentSkillRelation", method = RequestMethod.GET)
	public String getMultiTalentSkillRelationJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Long[] ids)
			throws Exception {
			
		List<Long> idList = new ArrayList();	
	   if (ids == null) {

		} else {
			idList = Arrays.asList(ids);
		}
		try {

			

			List<TalentSkillRelation> talentSkillRelationList = talentSkillRelationService.getObjectsByIds(idList);
			log.info("get  talentSkillRelation data is " + talentSkillRelationList);

			model.addAttribute("code", 0);			
			model.addAttribute("total",talentSkillRelationList.size());

			model.addAttribute("talentSkillRelationList", talentSkillRelationList);

		} catch (Throwable t) {
			log.error(t.getMessage());
			log.error("get talentSkillRelation error,id is  " + idList);
			model.addAttribute("code", -100000);
		}

		return "/carrots-home-service/talentSkillRelation/json/talentSkillRelationListJson";
	}
	
	
	
	
	
}

