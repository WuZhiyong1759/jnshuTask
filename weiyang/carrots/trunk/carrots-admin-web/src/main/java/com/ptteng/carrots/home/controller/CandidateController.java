package com.ptteng.carrots.home.controller;

import com.ptteng.carrots.home.model.Candidate;
import com.ptteng.carrots.home.service.CandidateService;
import com.qding.common.util.http.cookie.CookieUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import util.DynamicUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by oeasy9999 on 2017/3/11.
 */
@Controller
public class CandidateController {
	private static final Log log = LogFactory.getLog(CandidateController.class);

	@Autowired
	private CandidateService candidateService;

	@Autowired
	private CookieUtil cookieUtil;

	/**
	 * 查询候选人信详细信息
	 * 
	 * @param request
	 * @param response
	 * @param modle
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/a/candidate/{id}", method = RequestMethod.GET)
	public String getCandidateJson(HttpServletRequest request, HttpServletResponse response, ModelMap model,
			@PathVariable Long id) {
		log.info("================================");
		log.info("get candidate data : id = " + id);
		// 校验
		if (id == null) {
			log.info("candidate id is null");
			model.addAttribute("code", -10008);
			return "/common/fail";
		}

		try {
			Candidate candidate = candidateService.getObjectById(id);
			if (candidate == null) {
				model.addAttribute("code", -10009);
				log.info("candidate of id = " + id + "doesn't exist");
				return "/common/fail";
			}
			log.info("get candidate data is " + candidate);
			model.addAttribute("candidate", candidate);
			model.addAttribute("code", 0);
		} catch (Throwable t) {
			t.printStackTrace();
			log.error(t.getMessage());
			log.error("get candidate error, id is " + id, t);
			model.addAttribute("code", -1);
		}
		return "/carrots-home-service/candidate/json/candidateDetailJson";
	}

	/**
	 * 新增候选人
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @param candidate
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/a/u/candidate", method = RequestMethod.POST)
	public String addCandidateJson(HttpServletRequest request, HttpServletResponse response, ModelMap model,
			@RequestBody Candidate candidate) {
		log.info("================================");
		log.info("insert candidate: candidate = " + candidate);

		/* 入参校验 */
		if (null == candidate.getName()) {
			model.addAttribute("code", -10002);
			return "/common/fail";
		}
		if (null == candidate.getOccupationType()) {
			model.addAttribute("code", -10003);
			return "/common/fail";
		}
		if (null == candidate.getPhone()) {
			model.addAttribute("code", -10004);
			return "/common/fail";
		}

		try {

			Long uid = Long.valueOf(cookieUtil.getKeyIdentity(request, CookieUtil.USER_ID));
			candidate.setCreateBy(uid);
			candidate.setUpdateBy(uid);
			log.info("insert candidate: candidate = " + candidate);
			Long id = candidateService.insert(candidate);
			if (id == null) {
				log.info("insert candidate failed");
				model.addAttribute("code", -10010);
				return "/common/fail";
			}
			log.info("id :" + id);
			model.addAttribute("code", 0);
			model.addAttribute("id", id);
		} catch (Throwable t) {
			t.printStackTrace();
			log.error(t.getMessage());
			log.error("add candidate error" + t);
			model.addAttribute("code", -1);
		}
		return "/common/insert";
	}

	/**
	 * 候选人搜索
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @param name
	 * @param phone
	 * @param status
	 * @param occupationType
	 * @param reserveFrom
	 * @param reserveTo
	 * @param page
	 * @param size
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/a/candidate/search", method = RequestMethod.GET)
	public String getMultiCandidateJson(HttpServletRequest request, HttpServletResponse response, ModelMap model,
			String name, String phone, String status, String occupationType, Long reserveFrom, Long reserveTo,
			Integer page, Integer size) {
		log.info("================================");
		log.info("name = " + name + ", phone = " + phone + ", status = " + status + ", occupationType = " + occupationType
				+ ", reserveFrom = " + reserveFrom + ", reserveTo = " + reserveTo + ", page = " + page + ", size = " + size);
		/* page默认1， size默认10 */
		if (page == null || page <= 0) {
			page = 1;
		}
		if (size == null || size <= 0) {
			size = 10;
		}
		/* 查询从start开始 */
		int start = (page - 1) * size;
		if (start < 0) {
			start = 0;
		}
		
		try {
			Map<String, Object> param = DynamicUtil.getCandidateList(name, phone, status, occupationType, reserveFrom,
					reserveTo, false);
			log.info("get param data is " + param);
			/* 通过动态sql查询获取候选人id列表 */
			List<Long> ids = candidateService.getIdsByDynamicCondition(Candidate.class, param, start, size);
			log.info(param.get("name") + " get ids = " + ids);
			
			List<Candidate> candidateList = candidateService.getObjectsByIds(ids);
			log.info("candidateList = " + candidateList);
			
			/* count统计个数 */
			Map<String, Object> countParam = DynamicUtil.getCandidateList(name, phone, status, occupationType, reserveFrom, reserveTo, true);
			log.info(" get count param = " + countParam);
			Long totalSize = candidateService.getIdsByDynamicCondition(Candidate.class, countParam, 0, Integer.MAX_VALUE).get(0);
			log.info(" get total = " + totalSize);

			
			model.addAttribute("code", 0);
			model.addAttribute("page", page);
			model.addAttribute("size", size);
			model.addAttribute("total", totalSize);
			model.addAttribute("candidateList", candidateList);

		} catch (Throwable t) {
			log.error(t.getMessage());
			log.error("get candidateList error", t);
			model.addAttribute("code", -1);
		}
		return "/carrots-home-service/candidate/json/candidateListJson";
	}

	/**
	 * 更新候选人
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @param id
	 * @param candidate
	 * @return
	 */
	@RequestMapping(value = "/a/u/candidate/{id}", method = RequestMethod.PUT)
	public String updateCandidateJson(HttpServletRequest request, HttpServletResponse response, ModelMap model,
			@PathVariable Long id, @RequestBody Candidate candidate) {
		log.info("================================");
		log.info("id = " + id + ", candidate = " + candidate);
		// 校验
		if (id == null) {
			log.info("candidate id is null");
			model.addAttribute("code", -10008);
			return "/common/fail";
		}
		if (null == candidate.getName()) {
			model.addAttribute("code", -10002);
			return "/common/fail";
		}
		if (null == candidate.getOccupationType()) {
			model.addAttribute("code", -10003);
			return "/common/fail";
		}
		if (null == candidate.getPhone()) {
			model.addAttribute("code", -10004);
			return "/common/fail";
		}
		
		/* 获取候选人的creatBy，createAt */
		try {
			Candidate candidateOld = candidateService.getObjectById(id);
			if (candidateOld == null) {
				log.info(" get candidateOld error, id = " + id);
				model.addAttribute("code", -10011);
				return "/common/fail";
			}
			candidate.setCreateBy(candidateOld.getCreateBy());
			candidate.setCreateAt(candidateOld.getCreateAt());
			if (null == candidate.getReserveTime()) {
				candidate.setReserveTime(candidateOld.getReserveTime());
			}
		} catch (Throwable t) {
			t.printStackTrace();
			log.error(t.getMessage());
			log.error("get candidateOld error, id is " + id, t);
			model.addAttribute("code", -1);
			return "/common/fail";
		}

		try {
			log.info("update candidate: candidate= " + candidate);
			Long uid = Long.valueOf(cookieUtil.getKeyIdentity(request, CookieUtil.USER_ID));
			candidate.setUpdateBy(uid);
			candidate.setId(id);
			boolean updateCandidate = candidateService.update(candidate);
			if (!updateCandidate) {
				log.info("update candidate error, candidate id = " + id);
				model.addAttribute("code", -10012);
				return "/common/fail";
			}
			model.addAttribute("code", 0);
		} catch (Throwable t) {
			t.printStackTrace();
			log.error(t.getMessage());
			log.error("update candidate error, id is " + id, t);
			model.addAttribute("code", -1);
		}
		return "/data/json";
	}

	/**
	 * 获取候选人电话
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @param id
	 * @param phone
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/a/candidate/phone", method = RequestMethod.GET)
	public String checkPhone(HttpServletRequest request, HttpServletResponse response, ModelMap model, Long id,
			String phone) {
		log.info("================================");
		// 校验
		if (null == phone) {
			model.addAttribute("code", -10004);
			return "/common/fail";
		}
		log.info("check phone : phone = " + phone + ", id = " + id);
		
		try {
			List<Long> candidateIds = candidateService.getCandidateIdsByPhone(phone, 0, Integer.MAX_VALUE);
			Integer count = candidateIds.size();

			// 查询到多个id，验证不通过
			if (count > 1) {
				log.info("get count > 1 : count = " + count);
				model.addAttribute("code", -10005);
				return "/common/fail";
			}
			if (count == 1) {
				log.info("get count = 1");
				// 新增时查到id，验证不通过
				if (id == null) {
					log.info("id = null");
					model.addAttribute("code", -10005);
					return "/common/fail";
				}
				// 编辑时查到id，且与传入的id一致，验证通过
				if (id.equals(candidateIds.get(0))) {
					model.addAttribute("code", 0);
					return "/data/json";
				}
				// 编辑时查到id，但与传入的id不一致，验证不通过
				model.addAttribute("code", -10005);
				return "/common/fail";
			}
			// 查询不到id，验证通过
			log.info("get no any count : count = 0");
			model.addAttribute("code", 0);
		} catch (Throwable t) {
			t.printStackTrace();
			log.error(t.getMessage());
			log.error("check phone error, id is " + id);
			model.addAttribute("code", -1);
		}
		return "/data/json";
	}

	/**
	 * 修改候选人状态
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @param id
	 * @param status
	 * @param reserveTime
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/a/u/candidate/status", method = RequestMethod.PUT)
	public String updateCandidateStatusJson(HttpServletRequest request, HttpServletResponse response, ModelMap model,
			Long id, String status, Long reserveTime) {
		log.info("================================");
		log.info("update candidate status, id =" + id + ", status = " + status + ", reserveTime = " + reserveTime);
		// 校验
		if (id == null) {
			log.info("id is null");
			model.addAttribute("code", -10008);
			return "/common/fail";
		}
		if (status == null) {
			model.addAttribute("code", -10006);
			return "/data/json";
		}
		try {
			Candidate candidate = candidateService.getObjectById(id);
			if (candidate == null) {
				log.info("candidate of id " + id + "doesn't exist");
				model.addAttribute("code", -10009);
				return "/common/fail";
			}
			log.info("get candidate data : candidate = " + candidate);

			// status为1时表示预约成功，需要传入面试时间
			if (Candidate.ORDER_SUCCESS.equals(status)) {

				if (reserveTime == null) {
					model.addAttribute("code", -10007);
					return "/data/json";
				}
				candidate.setReserveTime(reserveTime);
			}
			candidate.setStatus(status);
			Long uid = Long.valueOf(cookieUtil.getKeyIdentity(request, CookieUtil.USER_ID));
			candidate.setUpdateBy(uid);
			boolean updateCandidate = candidateService.update(candidate);
			if (!updateCandidate) {
				log.info("update candidate error, candidate id = " + id);
				model.addAttribute("code", -10012);
				return "/common/fail";
			}
			model.addAttribute("code", 0);
		} catch (Throwable t) {
			t.printStackTrace();
			log.error(t.getMessage());
			log.error("update candidate status error, id is " + id, t);
			model.addAttribute("code", -1);
		}

		return "/data/json";
	}
}
