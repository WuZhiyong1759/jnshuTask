package com.carrots.zangai.controller;

import com.ptteng.carrots.zangai.model.CompanyLabel;
import com.ptteng.carrots.zangai.service.CompanyLabelService;
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
 * CompanyLabel  crud
 * 
 * @author magenm
 * @Date 2014-4-16 13:43
 * 
 */
@Controller
public class CompanyLabelController {
	private static final Log log = LogFactory.getLog(CompanyLabelController.class);

	@Autowired
	private CompanyLabelService companyLabelService;






    /**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */

	@RequestMapping(value = "/c/companyLabel", method = RequestMethod.GET)
	public String getcompanyLabelList(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) throws Exception {

		
		
		log.info("/companyLabel  to /companyLabel/view/companyLabelList");

		return "/carrots-zangai-home-service/companyLabel/view/companyLabelList";
	}
    
    

    
	
	@RequestMapping(value = "/c/companyLabel/{id}", method = RequestMethod.GET)
	public String getCompanyLabel(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("/companyLabel/" + id + "  to /companyLabel/view/companyLabelDeail");
		if(null != id){
			model.addAttribute("id", id);
		}else{
			model.addAttribute("id", 0);
		}

		return "/carrots-zangai-home-service/companyLabel/view/companyLabelDetail";
	}
	
	
	
	    
	

	@RequestMapping(value = "/a/companyLabel/{id}", method = RequestMethod.GET)
	public String getCompanyLabelJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("get data : id= " + id);
		try {
			CompanyLabel companyLabel = companyLabelService.getObjectById(id);
			log.info("get companyLabel data is " + companyLabel);

			model.addAttribute("code", 0);

			model.addAttribute("companyLabel", companyLabel);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("get companyLabel error,id is  " + id);
			model.addAttribute("code", -100000);
		}

		return "/carrots-zangai-home-service/companyLabel/json/companyLabelDetailJson";
	}

	@RequestMapping(value = "/a/companyLabel/{id}", method = RequestMethod.PUT)
	public String updateCompanyLabelJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, CompanyLabel companyLabel) throws Exception {
		
		log.info("update companyLabel : companyLabel= " + companyLabel);
		
		try {
			
			companyLabelService.update(companyLabel);

			model.addAttribute("code", 0);

			model.addAttribute("companyLabel", companyLabel);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("update companyLabel error,id is  " + companyLabel.getId());
			model.addAttribute("code", -6003);

		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/companyLabel", method = RequestMethod.POST)
	public String addCompanyLabelJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, CompanyLabel companyLabel) throws Exception {
		
		log.info("update companyLabel : companyLabel= " + companyLabel);
		
		try { 
			companyLabel.setId(null);

			companyLabelService.insert(companyLabel);

			model.addAttribute("code", 0);
		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("add companyLabel error ");
			model.addAttribute("code", -6002);
		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/companyLabel/{id}", method = RequestMethod.DELETE)
	public String deleteCompanyLabelJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("delete companyLabel : id= " + id);
		try {
			companyLabelService.delete(id);

			log.info("add companyLabel success");
			model.addAttribute("code", 0);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("delete companyLabel error,id is  " + id);
			model.addAttribute("code", -6004);

		}

		return "/data/json";
	}
	
	
	@RequestMapping(value = "/a/multi/companyLabel", method = RequestMethod.GET)
	public String getMultiCompanyLabelJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Long[] ids)
			throws Exception {
			
		List<Long> idList = new ArrayList();	
	   if (ids == null) {

		} else {
			idList = Arrays.asList(ids);
		}
		try {

			

			List<CompanyLabel> companyLabelList = companyLabelService.getObjectsByIds(idList);
			log.info("get  companyLabel data is " + companyLabelList);

			model.addAttribute("code", 0);			
			model.addAttribute("total",companyLabelList.size());

			model.addAttribute("companyLabelList", companyLabelList);

		} catch (Throwable t) {
			log.error(t.getMessage());
			log.error("get companyLabel error,id is  " + idList);
			model.addAttribute("code", -100000);
		}

		return "/carrots-zangai-home-service/companyLabel/json/companyLabelListJson";
	}
	
	
	
	
	
}

