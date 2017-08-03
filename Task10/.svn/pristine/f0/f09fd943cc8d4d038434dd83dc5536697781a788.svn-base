package com.carrots.zangai.controller;

import com.ptteng.carrots.zangai.model.ProfessionLabel;
import com.ptteng.carrots.zangai.service.ProfessionLabelService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ProfessionLabel  crud
 * 
 * @author magenm
 * @Date 2014-4-16 13:43
 * 
 */
@Controller
public class ProfessionLabelController {
	private static final Log log = LogFactory.getLog(ProfessionLabelController.class);

	@Autowired
	private ProfessionLabelService professionLabelService;






    /**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */

	@RequestMapping(value = "/c/professionLabel", method = RequestMethod.GET)
	public String getprofessionLabelList(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) throws Exception {

		
		
		log.info("/professionLabel  to /professionLabel/view/professionLabelList");

		return "/carrots-zangai-home-service/professionLabel/view/professionLabelList";
	}
    
    

    
	
	@RequestMapping(value = "/c/professionLabel/{id}", method = RequestMethod.GET)
	public String getProfessionLabel(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("/professionLabel/" + id + "  to /professionLabel/view/professionLabelDeail");
		if(null != id){
			model.addAttribute("id", id);
		}else{
			model.addAttribute("id", 0);
		}

		return "/carrots-zangai-home-service/professionLabel/view/professionLabelDetail";
	}
	
	
	
	    
	

	@RequestMapping(value = "/a/professionLabel/{id}", method = RequestMethod.GET)
	public String getProfessionLabelJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("get data : id= " + id);
		try {
			ProfessionLabel professionLabel = professionLabelService.getObjectById(id);
			log.info("get professionLabel data is " + professionLabel);

			model.addAttribute("code", 0);

			model.addAttribute("professionLabel", professionLabel);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("get professionLabel error,id is  " + id);
			model.addAttribute("code", -100000);
		}

		return "/carrots-zangai-home-service/professionLabel/json/professionLabelDetailJson";
	}

	@RequestMapping(value = "/a/professionLabel/{id}", method = RequestMethod.PUT)
	public String updateProfessionLabelJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, ProfessionLabel professionLabel) throws Exception {
		
		log.info("update professionLabel : professionLabel= " + professionLabel);
		
		try {
			
			professionLabelService.update(professionLabel);

			model.addAttribute("code", 0);

			model.addAttribute("professionLabel", professionLabel);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("update professionLabel error,id is  " + professionLabel.getId());
			model.addAttribute("code", -6003);

		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/professionLabel", method = RequestMethod.POST)
	public String addProfessionLabelJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, ProfessionLabel professionLabel) throws Exception {
		
		log.info("update professionLabel : professionLabel= " + professionLabel);
		
		try { 
			professionLabel.setId(null);

			professionLabelService.insert(professionLabel);

			model.addAttribute("code", 0);
		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("add professionLabel error ");
			model.addAttribute("code", -6002);
		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/professionLabel/{id}", method = RequestMethod.DELETE)
	public String deleteProfessionLabelJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("delete professionLabel : id= " + id);
		try {
			professionLabelService.delete(id);

			log.info("add professionLabel success");
			model.addAttribute("code", 0);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("delete professionLabel error,id is  " + id);
			model.addAttribute("code", -6004);

		}

		return "/data/json";
	}
	
	
	@RequestMapping(value = "/a/multi/professionLabel", method = RequestMethod.GET)
	public String getMultiProfessionLabelJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Long[] ids)
			throws Exception {
			
		List<Long> idList = new ArrayList();	
	   if (ids == null) {

		} else {
			idList = Arrays.asList(ids);
		}
		try {

			

			List<ProfessionLabel> professionLabelList = professionLabelService.getObjectsByIds(idList);
			log.info("get  professionLabel data is " + professionLabelList);

			model.addAttribute("code", 0);			
			model.addAttribute("total",professionLabelList.size());

			model.addAttribute("professionLabelList", professionLabelList);

		} catch (Throwable t) {
			log.error(t.getMessage());
			log.error("get professionLabel error,id is  " + idList);
			model.addAttribute("code", -100000);
		}

		return "/carrots-zangai-home-service/professionLabel/json/professionLabelListJson";
	}
	
	
	
	
	
}

