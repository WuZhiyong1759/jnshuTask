package com.carrots.zangai.controller;

import com.ptteng.carrots.zangai.model.Producter;
import com.ptteng.carrots.zangai.service.ProducterService;
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
 * Producter  crud
 * 
 * @author magenm
 * @Date 2014-4-16 13:43
 * 
 */
@Controller
public class ProducterController {
	private static final Log log = LogFactory.getLog(ProducterController.class);

	@Autowired
	private ProducterService producterService;






    /**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */

	@RequestMapping(value = "/c/producter", method = RequestMethod.GET)
	public String getproducterList(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) throws Exception {

		
		
		log.info("/producter  to /producter/view/producterList");

		return "/carrots-zangai-home-service/producter/view/producterList";
	}
    
    

    
	
	@RequestMapping(value = "/c/producter/{id}", method = RequestMethod.GET)
	public String getProducter(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("/producter/" + id + "  to /producter/view/producterDeail");
		if(null != id){
			model.addAttribute("id", id);
		}else{
			model.addAttribute("id", 0);
		}

		return "/carrots-zangai-home-service/producter/view/producterDetail";
	}
	
	
	
	    
	

	@RequestMapping(value = "/a/producter/{id}", method = RequestMethod.GET)
	public String getProducterJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("get data : id= " + id);
		try {
			Producter producter = producterService.getObjectById(id);
			log.info("get producter data is " + producter);

			model.addAttribute("code", 0);

			model.addAttribute("producter", producter);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("get producter error,id is  " + id);
			model.addAttribute("code", -100000);
		}

		return "/carrots-zangai-home-service/producter/json/producterDetailJson";
	}

	@RequestMapping(value = "/a/producter/{id}", method = RequestMethod.PUT)
	public String updateProducterJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Producter producter) throws Exception {
		
		log.info("update producter : producter= " + producter);
		
		try {
			
			producterService.update(producter);

			model.addAttribute("code", 0);

			model.addAttribute("producter", producter);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("update producter error,id is  " + producter.getId());
			model.addAttribute("code", -6003);

		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/producter", method = RequestMethod.POST)
	public String addProducterJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Producter producter) throws Exception {
		
		log.info("update producter : producter= " + producter);
		
		try { 
			producter.setId(null);

			producterService.insert(producter);

			model.addAttribute("code", 0);
		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("add producter error ");
			model.addAttribute("code", -6002);
		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/producter/{id}", method = RequestMethod.DELETE)
	public String deleteProducterJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("delete producter : id= " + id);
		try {
			producterService.delete(id);

			log.info("add producter success");
			model.addAttribute("code", 0);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("delete producter error,id is  " + id);
			model.addAttribute("code", -6004);

		}

		return "/data/json";
	}
	
	
	@RequestMapping(value = "/a/multi/producter", method = RequestMethod.GET)
	public String getMultiProducterJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Long[] ids)
			throws Exception {
			
		List<Long> idList = new ArrayList();	
	   if (ids == null) {

		} else {
			idList = Arrays.asList(ids);
		}
		try {

			

			List<Producter> producterList = producterService.getObjectsByIds(idList);
			log.info("get  producter data is " + producterList);

			model.addAttribute("code", 0);			
			model.addAttribute("total",producterList.size());

			model.addAttribute("producterList", producterList);

		} catch (Throwable t) {
			log.error(t.getMessage());
			log.error("get producter error,id is  " + idList);
			model.addAttribute("code", -100000);
		}

		return "/carrots-zangai-home-service/producter/json/producterListJson";
	}
	
	
	
	
	
}

