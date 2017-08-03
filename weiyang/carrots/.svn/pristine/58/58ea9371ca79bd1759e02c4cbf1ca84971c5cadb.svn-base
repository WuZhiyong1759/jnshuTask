package com.ptteng.carrots.home.controller;

import com.ptteng.carrots.home.model.Appraisal;
import com.ptteng.carrots.home.model.Talent;
import com.ptteng.carrots.home.service.AppraisalService;
import com.ptteng.carrots.home.service.TalentService;
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

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by oeasy9999 on 2017/3/27.
 */
@Controller
public class TalentController {
    private static final Log log = LogFactory.getLog(TalentController.class);
    @Autowired
    private TalentService talentService;
    @Autowired
    private AppraisalService appraisalService;

    @RequestMapping(value = "/a/talent/search", method = RequestMethod.GET)
    public String getMultiTalentJson(HttpServletRequest request, HttpServletResponse response, ModelMap model,
                                     Integer page, Integer size, String talentLevel) throws Exception {
        log.info("get talent list");
        if (page == null || page <= 0) {
            page = 1;
        }
        if (size == null || size <= 0) {
            size = 5;
        }
        int start = (page - 1) * size;
        if (start == 0) {
            start = 0;
        }
        try {
            //得到列表的ids
            Map<String, Object> param = DynamicUtil.getTalentList(talentLevel);
            log.info("get param : param = " + param);
            List<Long> ids = talentService.getIdsByDynamicCondition(Talent.class, param, start, size);
            List<Long> count = talentService.getIdsByDynamicCondition(Talent.class, param, 0, Integer.MAX_VALUE);
            log.info("get ids data is " + ids);
            List<Talent> talentList = talentService.getObjectsByIds(ids);

//            int[] resultScore = null;
//            int totalScore = 0;
//            Long resultExceed = 0L;
            for (Talent talent : talentList) {
                Long talentId = talent.getId();
                log.info("get appraisal : talent id = " + talentId);
                List<Long> appraisalIds = appraisalService.getAppraisalIdsByTalentId(talentId, 0, Integer.MAX_VALUE);
                log.info("get appraisal ids = " + appraisalIds);
                if (appraisalIds.size() > 1) {
					break;
				}
                Appraisal appraisal = appraisalService.getObjectById(appraisalIds.get(0));
                log.info("get appraisal data, appraisal = " + appraisal);
//                String[] knowledges = appraisal.getKnowledge().split(",");
//                String[] professionQualitys = appraisal.getProfessionQuality().split(",");
//                String[] projects = appraisal.getProject().split(",");
                int knowledgeScore = getTotalScore(appraisal.getKnowledge());
                int professionQualityScore = getTotalScore(appraisal.getProfessionQuality());
                int projectScore = getTotalScore(appraisal.getProject());
                int[] resultScore = new int[]{professionQualityScore / 4, knowledgeScore / 4, projectScore / 4};
                int totalScore = knowledgeScore + professionQualityScore + projectScore;
                log.info("knowledgesScore = " + knowledgeScore + "----> professionQualityScore = " + professionQualityScore + "----> projectScore = " + projectScore);
                Long knowledgeExceed = appraisal.getKnowledgeExceed();
                Long professionExceed = appraisal.getProfessionExceed();
                Long projectExceed = appraisal.getProjectExceed();
                Long resultExceed = (knowledgeExceed + professionExceed + projectExceed) / 3;

                talent.setResultScore(Arrays.toString(resultScore));
                talent.setTotalScore(totalScore);
                talent.setResultExceed(resultExceed);
            }


            model.addAttribute("code", 0);
            model.addAttribute("page", page);
            model.addAttribute("size", size);
            model.addAttribute("total", count.size());
            model.addAttribute("talentList", talentList);
        } catch (Throwable t) {
            log.error(t.getMessage());
            log.error("get talent list error");
            model.addAttribute("code", -1);
        }
        return "/carrots-home-service/talent/json/talentListJson";
    }
    
    @RequestMapping(value = "/a/talent/{id}", method = RequestMethod.GET)
    public String getTalentJson(HttpServletRequest request, HttpServletResponse response, ModelMap model, @PathVariable Long id) throws Exception {
    	log.info("get talent data : id = " + id);
		try {
			Talent talent = talentService.getObjectById(id);
			log.info("get talent data : talent = " + talent);
			model.addAttribute("talent", talent);
			model.addAttribute("code", 0);
		} catch (Throwable t) {
			t.printStackTrace();
			log.error(t.getMessage());
			log.error("get talent error, id = " + id);
			model.addAttribute("code", -1);
		}
		return "/carrots-home-service/talent/json/talentDetailJson";
    }
    
    public int getTotalScore(String str) {
		int result = 0;
		String[] strings = str.substring(1, str.length() - 1).split(",");
		for (String s : strings) {
			result += Integer.valueOf(s);
		}
    	return result;
	}

//    public int getTotalScore(String[] args) {
//        int result = 0;
//        for (String s : args) {
//            result += Integer.valueOf(s);
//        }
//        return result;
//    }

}
