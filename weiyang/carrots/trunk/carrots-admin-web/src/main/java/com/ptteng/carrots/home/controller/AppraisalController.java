package com.ptteng.carrots.home.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.JsonObject;
import com.ptteng.carrots.home.model.Appraisal;
import com.ptteng.carrots.home.model.Skill;
import com.ptteng.carrots.home.model.Talent;
import com.ptteng.carrots.home.model.TalentSkillRelation;
import com.ptteng.carrots.home.service.AppraisalService;
import com.ptteng.carrots.home.service.OccupationService;
import com.ptteng.carrots.home.service.SkillService;
import com.ptteng.carrots.home.service.TalentService;
import com.ptteng.carrots.home.service.TalentSkillRelationService;
import com.qcloud.cosapi.http.ResponseBodyKey.Data;
import com.qding.common.util.DataUtils;

import atg.taglib.json.util.JSONObject;
import net.sf.json.JSONArray;
import util.DynamicUtil;

/**
 * Appraisal crud
 * 
 * @author magenm
 * @Date 2014-4-16 13:43
 * 
 */
@Controller
public class AppraisalController {
  
  private static final Log log = LogFactory.getLog(AppraisalController.class);
  
  @Autowired
  private AppraisalService appraisalService;
  
  @Autowired
  private SkillService skillService;
  
  @Autowired
  private com.qding.common.util.http.cookie.CookieUtil cookieUtil;
  
  @Autowired
  private OccupationService occupationService;
  
  @Autowired
  private TalentSkillRelationService talentSkillRelationService;
  
  @Autowired
  private TalentService talentService;
  
  /**
   * 查询测评报告详细信息（id:为人才id）。。
   * 
   * @param request
   * @param response
   * @param model
   * @param id
   * @return
   * @throws Exception
   */
  @RequestMapping(value = "/a/appraisal/{id}", method = RequestMethod.GET)
  public String getAppraisalJson(HttpServletRequest request, HttpServletResponse response,
                                 ModelMap model, @PathVariable Long id) {
    
    log.info("get appraisal : talent id = " + id);
    
    /* 入参校验 */
    try {
      if (DataUtils.isNullOrEmpty(id)) {
        log.info("get data is :" + id);
        model.addAttribute("code", -10502);
        return "/data/json";
      }
      
      /* 根据人才id获取测评报告 */
      List<Long> appraisalIds = appraisalService.getAppraisalIdsByTalentId(id, 0,
          Integer.MAX_VALUE);
      log.info("get appraisal ids = " + appraisalIds);
      Appraisal appraisal = appraisalService.getObjectById(appraisalIds.get(0));
      
     /*根据关系表中测评报告id查询技能树id*/
      Map<String, Object> param = DynamicUtil.getRelationSkillId(appraisalIds.get(0));
      log.info("get param data is" + param);
      List<Long> ids = talentSkillRelationService
          .getIdsByDynamicCondition(TalentSkillRelation.class, param, 0, Integer.MAX_VALUE);
      log.info("get TalentSkillRelation ids data is :" + ids);
      
      List<TalentSkillRelation> skillListIds = talentSkillRelationService.getObjectsByIds(ids);
      log.info("===============================================");
      log.info("get data is :" + skillListIds);
      /*使用skillId查询skill表*/
      List<Long> skillIds = new ArrayList<>();
      for (TalentSkillRelation talentSkillRelation : skillListIds) {
        log.info("talentSkillRelation.getSkillId is " + talentSkillRelation.getSkillId());
        skillIds.add(talentSkillRelation.getSkillId());
      }
      List<Skill> skillList = skillService.getObjectsByIds(skillIds);
      log.info("get skillIds data is :" + skillIds);
      
      model.addAttribute("skillList", skillList);
      model.addAttribute("code", 0);
      model.addAttribute("appraisal", appraisal);
      //
    }
    catch (Exception t) {
      t.printStackTrace();
      log.error(t.getMessage());
      log.error("get appraisal error,id is  " + id, t);
      model.addAttribute("code", -100000);
    }
    return "/carrots-home-service/appraisal/json/appraisalDetailJson";
  }
  
  /**
   * 编辑测评报告（id:人才id）
   * 
   * @param request
   * @param response
   * @param model
   * @param appraisal
   * @param id
   * @return
   * @throws Exception
   */
  @RequestMapping(value = "/a/u/appraisal/{id}", method = RequestMethod.PUT)
  public String updateAppraisalJson(HttpServletRequest request, HttpServletResponse response,
                                    ModelMap model, @RequestBody Appraisal appraisal,
                                    @PathVariable Long id)
      throws Exception {
    
    log.info("update appraisal : appraisal= " + appraisal);
    
    // 入参校验
    if (DataUtils.isNullOrEmpty(id)) {
      model.addAttribute("code", -10502);
      return "/data/json";
    }
    int code = verifyAppraisal(appraisal);
    if (code < 0) {
      model.addAttribute("code", code);
      return "/data/json";
    }
    
    if (DataUtils.isNullOrEmpty(appraisal.getTalentGrade())) {
      code = -11030;
      model.addAttribute("code", code);
      return "/data/json";
      
    }
    
    try {
      /* 拿到skill参数使用json */
      JSONArray json = JSONArray.fromObject(appraisal.getSkillJson());
      
      /* 动态查询talentSkillRelation */
      Map<String, Object> talentSkillRelationMap = new HashMap<String, Object>();
      talentSkillRelationMap = DynamicUtil.getTalentSkillRelationList();
      List<Long> talentSkillRelationIds = talentSkillRelationService.getIdsByDynamicCondition(
          TalentSkillRelation.class, talentSkillRelationMap, 0, Integer.MAX_VALUE);
      List<TalentSkillRelation> talentSkillRelationList = talentSkillRelationService
          .getObjectsByIds(talentSkillRelationIds);
      
      /* 查询skill */
      Map<String, Object> skillmap = new HashMap<String, Object>();
      skillmap = DynamicUtil.getSkillList();
      List<Long> ids = skillService.getIdsByDynamicCondition(Skill.class, skillmap, 0,
          Integer.MAX_VALUE);
      
      /* 循环遍历：外循环,关系表拿出来的记录 */
      List<TalentSkillRelation> talentSkillRelationList1 = new ArrayList<TalentSkillRelation>();
      for (int a = 0; a < talentSkillRelationList.size(); a++) {
        TalentSkillRelation talentSkillRelation = talentSkillRelationList.get(a);
        Long talentSkillRelationId = talentSkillRelationList.get(a).getId();
        /* 接收前端来的参数 */
        List<Skill> skillList = JSONArray.toList(json, Skill.class);
        
        for (int i = 0; i < skillList.size(); i++) {
          if (skillList.get(i).getId().equals(talentSkillRelation.getSkillId())) {
            talentSkillRelation.setDegree(skillList.get(i).getPriority());
            talentSkillRelationList1.add(talentSkillRelation);
          }
        }
        
      }
      Long uid = Long.valueOf(
          cookieUtil.getKeyIdentity(request, com.qding.common.util.http.cookie.CookieUtil.USER_ID));
      appraisal.setUpdateBy(uid);
      talentSkillRelationService.updateList(talentSkillRelationList1);
      appraisalService.update(appraisal);
      
      /* 添加人才表人才等级字段 */
      Talent talent = talentService.getObjectById(appraisal.getTalentId());
      if (DataUtils.isNullOrEmpty(talent)) {
        code = -11031;
        model.addAttribute("code", code);
        return "/data/json";
      }
      
      talent.setTalentLevel(appraisal.getTalentGrade());
      talent.setUpdateBy(uid);
      log.info("update talent level : talentLevel = " + talent.getTalentLevel());
      talentService.update(talent);
      
      model.addAttribute("code", 0);
      
      model.addAttribute("appraisal", appraisal);
      
    }
    catch (Throwable t) {
      t.printStackTrace();
      log.error(t.getMessage());
      log.error("update appraisal error,id is  " + appraisal.getId(),t);
      model.addAttribute("code", -6003);
      
    }
    
    return "/data/json";
  }
  
  /**
   * 新增测评报告（id：为人才id）
   * 
   * @param request
   * @param response
   * @param model
   * @param appraisal
   * @return
   */
  @RequestMapping(value = "/a/u/appraisal", method = RequestMethod.POST)
  public String addAppraisalJson(HttpServletRequest request, HttpServletResponse response,
                                 ModelMap model, @RequestBody Appraisal appraisal)
      throws Exception {
    
    log.info("update appraisal : appraisal= " + appraisal);
    /* 入参校验 */
    int code = verifyAppraisal(appraisal);
    if (code < 0) {
      model.addAttribute("code", code);
      return "/data/json";
    }
    if (DataUtils.isNullOrEmpty(appraisal.getTalentGrade())) {
      code = -11030;
      model.addAttribute("code", code);
      return "/data/json";
    }
    
    try {
      appraisal.setId(null);
      /* 从cookie中获取USERID */
      Long uid = Long.valueOf(
          cookieUtil.getKeyIdentity(request, com.qding.common.util.http.cookie.CookieUtil.USER_ID));
      appraisal.setCreateBy(uid);
      appraisal.setUpdateBy(uid);
      
      Long talentId = appraisalService.insert(appraisal);
      /* 将java对象转换成json */
      JSONArray jsonSkill = JSONArray.fromObject(appraisal.getSkillJson());
      List<TalentSkillRelation> newRelationList = new ArrayList<TalentSkillRelation>();
      TalentSkillRelation talentSkillRelaton = new TalentSkillRelation();
      for (int i = 0; i < jsonSkill.size(); i++) {
        net.sf.json.JSONObject json = jsonSkill.getJSONObject(i);
        talentSkillRelaton.setSkillId(Long.parseLong(json.get("id") + ""));
        talentSkillRelaton.setDegree(Integer.parseInt(json.get("priority") + ""));
        talentSkillRelaton.setAppraisalId(talentId);
        newRelationList.add(talentSkillRelaton);
      }
      
      talentSkillRelationService.insertList(newRelationList);
      log.info("insert appraial : appraisal =" + appraisal);
      
      /* 添加人才表人才等级字段 */
      Talent talent = talentService.getObjectById(appraisal.getTalentId());
      if (DataUtils.isNullOrEmpty(talent)) {
        code = -11031;
        model.addAttribute("code", code);
        return "/data/json";
      }
      talent.setTalentLevel(appraisal.getTalentGrade());
      talent.setAppraisal("0");
      talent.setUpdateBy(uid);
      log.info("update talent level : talentLevel = " + talent.getTalentLevel());
      talentService.update(talent);
      model.addAttribute("code", 0);
    }
    catch (Throwable t) {
      t.printStackTrace();
      log.error(t.getMessage());
      log.error("add appraisal error " + t.getMessage(), t);
      model.addAttribute("code", -6002);
    }
    return "/data/json";
  }
  
  /*
   * 测评报告非空字段校验
   */
  private int verifyAppraisal(Appraisal appraisal) {
    // 校验
    int code = 0;
    // 名称
    if (DataUtils.isNullOrEmpty(appraisal.getName())) {
      code = -11000;
    }
    // 职位
    if (DataUtils.isNullOrEmpty(appraisal.getProfession())) {
      code = -11001;
    }
    // 工作经验
    if (DataUtils.isNullOrEmpty(appraisal.getExperience())) {
      code = -11002;
    }
    // 省
    if (DataUtils.isNullOrEmpty(appraisal.getProvince())) {
      code = -11003;
    }
    // 市
    if (DataUtils.isNullOrEmpty(appraisal.getCity())) {
      code = -11004;
    }
    // 县
    if (DataUtils.isNullOrEmpty(appraisal.getCounty())) {
      code = -11005;
    }
    // 知识结构
    if (DataUtils.isNullOrEmpty(appraisal.getKnowledge())) {
      code = -11006;
    }
    // 知识结构超过同等经验的人
    if (DataUtils.isNullOrEmpty(appraisal.getKnowledgeExceed())) {
      code = -11007;
    }
    // 项目评语
    if (DataUtils.isNullOrEmpty(appraisal.getProjectRemark())) {
      code = -11008;
    }
    // 职业素养
    if (DataUtils.isNullOrEmpty(appraisal.getProfessionQuality())) {
      code = -11009;
    }
    // 职业素养超过同等经验的人
    if (DataUtils.isNullOrEmpty(appraisal.getProfessionExceed())) {
      code = -11010;
    }
    // 素养评语
    if (DataUtils.isNullOrEmpty(appraisal.getQualityRemark())) {
      code = -11011;
    }
    // 项目经验
    if (DataUtils.isNullOrEmpty(appraisal.getProject())) {
      code = -11012;
    }
    // 项目经验超过同等经验的人
    if (DataUtils.isNullOrEmpty(appraisal.getProjectExceed())) {
      code = -11013;
    }
    // 项目评语
    if (DataUtils.isNullOrEmpty(appraisal.getProjectRemark())) {
      code = -11014;
    }
    // 工作能力程度
    if (DataUtils.isNullOrEmpty(appraisal.getWorkAbility())) {
      code = -11015;
    }
    // 岗位匹配
    if (DataUtils.isNullOrEmpty(appraisal.getPost())) {
      code = -11016;
    }
    // 人才等级划分
    if (DataUtils.isNullOrEmpty(appraisal.getTalentGrade())) {
      code = -11017;
    }
    // 最小薪资
    if (DataUtils.isNullOrEmpty(appraisal.getMinPay())) {
      code = -11018;
    }
    // 最大薪资
    if (DataUtils.isNullOrEmpty(appraisal.getMaxPay())) {
      code = -11019;
    }
    return code;
  }
  
  /*
   * @RequestMapping(value = "/a/appraisal/{id}", method = RequestMethod.DELETE)
   * public String deleteAppraisalJson(HttpServletRequest request, HttpServletResponse response,
   * ModelMap model, @PathVariable Long id)
   * throws Exception {
   * 
   * Appraisal appraisal = null;
   * 
   * log.info("delete appraisal : id= " + id);
   * try {
   * 
   * // appraisal = appraisalService.getObjectById(id);
   * log.info("get appraisal data :" + id);
   * 
   * log.info("appraisal id id:" + id);
   * appraisalService.delete(id);
   * 
   * log.info("add appraisal success");
   * model.addAttribute("code", 0);
   * 
   * }
   * catch (Throwable t) {
   * t.printStackTrace();
   * log.error(t.getMessage());
   * log.error("delete appraisal error,id is  " + id);
   * model.addAttribute("code", -6004);
   * 
   * }
   * return "/data/json";
   * 
   * }
   */
  
}
