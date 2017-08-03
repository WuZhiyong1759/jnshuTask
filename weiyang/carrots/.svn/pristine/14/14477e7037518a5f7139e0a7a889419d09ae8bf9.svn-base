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

import com.ptteng.carrots.home.model.Occupation;
import com.ptteng.carrots.home.service.OccupationService;

/**
 * Occupation  crud
 * 
 * @author magenm
 * @Date 2014-4-16 13:43
 * 
 */
@Controller
public class OccupationController {
	private static final Log log = LogFactory.getLog(OccupationController.class);

	@Autowired
	private OccupationService occupationService;






    /**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */

	@RequestMapping(value = "/c/occupation", method = RequestMethod.GET)
	public String getoccupationList(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) throws Exception {

		
		
		log.info("/occupation  to /occupation/view/occupationList");

		return "/carrots-home-service/occupation/view/occupationList";
	}
    
    

    
	
	@RequestMapping(value = "/c/occupation/{id}", method = RequestMethod.GET)
	public String getOccupation(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("/occupation/" + id + "  to /occupation/view/occupationDeail");
		if(null != id){
			model.addAttribute("id", id);
		}else{
			model.addAttribute("id", 0);
		}

		return "/carrots-home-service/occupation/view/occupationDetail";
	}
	
	
	
	    
	

	@RequestMapping(value = "/a/occupation/{id}", method = RequestMethod.GET)
	public String getOccupationJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("get data : id= " + id);
		try {
			Occupation occupation = occupationService.getObjectById(id);
			log.info("get occupation data is " + occupation);

			model.addAttribute("code", 0);

			model.addAttribute("occupation", occupation);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("get occupation error,id is  " + id);
			model.addAttribute("code", -100000);
		}

		return "/carrots-home-service/occupation/json/occupationDetailJson";
	}

	@RequestMapping(value = "/a/occupation/{id}", method = RequestMethod.PUT)
	public String updateOccupationJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Occupation occupation) throws Exception {
		
		log.info("update occupation : occupation= " + occupation);
		
		try {
			
			occupationService.update(occupation);

			model.addAttribute("code", 0);

			model.addAttribute("occupation", occupation);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("update occupation error,id is  " + occupation.getId());
			model.addAttribute("code", -6003);

		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/occupation", method = RequestMethod.POST)
	public String addOccupationJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Occupation occupation) throws Exception {
		
		log.info("update occupation : occupation= " + occupation);
		
		try { 
			occupation.setId(null);

			occupationService.insert(occupation);

			model.addAttribute("code", 0);
		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("add occupation error ");
			model.addAttribute("code", -6002);
		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/occupation/{id}", method = RequestMethod.DELETE)
	public String deleteOccupationJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("delete occupation : id= " + id);
		try {
			occupationService.delete(id);

			log.info("add occupation success");
			model.addAttribute("code", 0);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("delete occupation error,id is  " + id);
			model.addAttribute("code", -6004);

		}

		return "/data/json";
	}
	
	
	@RequestMapping(value = "/a/multi/occupation", method = RequestMethod.GET)
	public String getMultiOccupationJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Long[] ids)
			throws Exception {
			
		List<Long> idList = new ArrayList();	
	   if (ids == null) {

		} else {
			idList = Arrays.asList(ids);
		}
		try {

			

			List<Occupation> occupationList = occupationService.getObjectsByIds(idList);
			log.info("get  occupation data is " + occupationList);

			model.addAttribute("code", 0);			
			model.addAttribute("total",occupationList.size());

			model.addAttribute("occupationList", occupationList);

		} catch (Throwable t) {
			log.error(t.getMessage());
			log.error("get occupation error,id is  " + idList);
			model.addAttribute("code", -100000);
		}

		return "/carrots-home-service/occupation/json/occupationListJson";
	}
	
	
	
	
	
}

