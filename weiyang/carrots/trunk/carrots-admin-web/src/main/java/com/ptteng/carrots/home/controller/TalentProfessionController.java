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

import com.ptteng.carrots.home.model.TalentProfession;
import com.ptteng.carrots.home.service.TalentProfessionService;

/**
 * TalentProfession crud
 * 
 * @author magenm
 * @Date 2014-4-16 13:43
 * 
 */
@Controller
public class TalentProfessionController {
  
  private static final Log log = LogFactory.getLog(TalentProfessionController.class);
  
  @Autowired
  private TalentProfessionService talentProfessionService;
  
  /**
   * 
   * @param
   * @return
   * @throws ServiceException
   * @throws ServiceDaoException
   */
  
  @RequestMapping(value = "/c/talentProfession", method = RequestMethod.GET)
  public String gettalentProfessionList(HttpServletRequest request, HttpServletResponse response,
                                        ModelMap model)
      throws Exception {
    
    log.info("/talentProfession  to /talentProfession/view/talentProfessionList");
    
    return "/carrots-home-service/talentProfession/view/talentProfessionList";
  }
  
  @RequestMapping(value = "/c/talentProfession/{id}", method = RequestMethod.GET)
  public String getTalentProfession(HttpServletRequest request, HttpServletResponse response,
                                    ModelMap model, @PathVariable Long id)
      throws Exception {
    
    log.info("/talentProfession/" + id + "  to /talentProfession/view/talentProfessionDeail");
    if (null != id) {
      model.addAttribute("id", id);
    }
    else {
      model.addAttribute("id", 0);
    }
    
    return "/carrots-home-service/talentProfession/view/talentProfessionDetail";
  }
  
  /**
   * 查询人才职位
   * 
   * @param request
   * @param response
   * @param model
   * @param id
   * @return
   * @throws Exception
   */
  @RequestMapping(value = "/a/talentProfession/{id}", method = RequestMethod.GET)
  public String getTalentProfessionJson(HttpServletRequest request, HttpServletResponse response,
                                        ModelMap model, @PathVariable Long id) {
    
    log.info("get data : id= " + id);
    try {
      TalentProfession talentProfession = talentProfessionService.getObjectById(id);
      log.info("get talentProfession data is " + talentProfession);
      
      model.addAttribute("code", 0);
      
      model.addAttribute("talentProfession", talentProfession);
      
    }
    catch (Throwable t) {
      t.printStackTrace();
      log.error(t.getMessage());
      log.error("get talentProfession error,id is  " + id);
      model.addAttribute("code", -100000);
    }
    
    return "/carrots-home-service/talentProfession/json/talentProfessionDetailJson";
  }
  
  /**
   * 更新人才职位
   * 
   * @param request
   * @param response
   * @param model
   * @param talentProfession
   * @return
   * @throws Exception
   */
  @RequestMapping(value = "/a/talentProfession/{id}", method = RequestMethod.PUT)
  public String updateTalentProfessionJson(HttpServletRequest request, HttpServletResponse response,
                                           ModelMap model, TalentProfession talentProfession) {
    
    log.info("update talentProfession : talentProfession= " + talentProfession);
    
    try {
      
      talentProfessionService.update(talentProfession);
      
      model.addAttribute("code", 0);
      
      model.addAttribute("talentProfession", talentProfession);
      
    }
    catch (Throwable t) {
      t.printStackTrace();
      log.error(t.getMessage());
      log.error("update talentProfession error,id is  " + talentProfession.getId());
      model.addAttribute("code", -6003);
      
    }
    
    return "/data/json";
  }
  
  /**
   * 新增人才职位
   * 
   * @param request
   * @param response
   * @param model
   * @param talentProfession
   * @return
   * @throws Exception
   */
  @RequestMapping(value = "/a/talentProfession", method = RequestMethod.POST)
  public String addTalentProfessionJson(HttpServletRequest request, HttpServletResponse response,
                                        ModelMap model, TalentProfession talentProfession) {
    
    log.info("update talentProfession : talentProfession= " + talentProfession);
    
    try {
      talentProfession.setId(null);
      
      talentProfessionService.insert(talentProfession);
      
      model.addAttribute("code", 0);
    }
    catch (Throwable t) {
      t.printStackTrace();
      log.error(t.getMessage());
      log.error("add talentProfession error ");
      model.addAttribute("code", -6002);
    }
    
    return "/data/json";
  }
  
  /**
   * 删除人才职位
   * 
   * @param request
   * @param response
   * @param model
   * @param id
   * @return
   * @throws Exception
   */
  @RequestMapping(value = "/a/talentProfession/{id}", method = RequestMethod.DELETE)
  public String deleteTalentProfessionJson(HttpServletRequest request, HttpServletResponse response,
                                           ModelMap model, @PathVariable Long id) {
    
    log.info("delete talentProfession : id= " + id);
    try {
      talentProfessionService.delete(id);
      
      log.info("add talentProfession success");
      model.addAttribute("code", 0);
      
    }
    catch (Throwable t) {
      t.printStackTrace();
      log.error(t.getMessage());
      log.error("delete talentProfession error,id is  " + id);
      model.addAttribute("code", -6004);
      
    }
    
    return "/data/json";
  }
  
  @RequestMapping(value = "/a/multi/talentProfession", method = RequestMethod.GET)
  public String getMultiTalentProfessionJson(HttpServletRequest request,
                                             HttpServletResponse response, ModelMap model,
                                             Long[] ids)
      throws Exception {
    
    List<Long> idList = new ArrayList();
    if (ids == null) {
      
    }
    else {
      idList = Arrays.asList(ids);
    }
    try {
      
      List<TalentProfession> talentProfessionList = talentProfessionService.getObjectsByIds(idList);
      log.info("get  talentProfession data is " + talentProfessionList);
      
      model.addAttribute("code", 0);
      model.addAttribute("total", talentProfessionList.size());
      
      model.addAttribute("talentProfessionList", talentProfessionList);
      
    }
    catch (Throwable t) {
      log.error(t.getMessage());
      log.error("get talentProfession error,id is  " + idList);
      model.addAttribute("code", -100000);
    }
    
    return "/carrots-home-service/talentProfession/json/talentProfessionListJson";
  }
  
}
