package com.ptteng.carrots.home.controller;

import java.util.List;
import java.util.Map;
import java.util.function.LongToDoubleFunction;

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

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.carrots.home.model.Appraisal;
import com.ptteng.carrots.home.model.Talent;
import com.ptteng.carrots.home.service.AppraisalService;
import com.ptteng.carrots.home.service.TalentService;
import com.qding.common.util.http.cookie.CookieUtil;

import util.DynamicUtil;

/**
 * Talent crud
 * 
 * @author magenm
 * @Date 2014-4-16 13:43
 * 
 */
@Controller
public class TalentController {
	private static final Log log = LogFactory.getLog(TalentController.class);

	@Autowired
	private TalentService talentService;
	@Autowired
	private AppraisalService appraisalService;

	@Autowired
	private CookieUtil cookieUtil;

	/**
	 * 获取人才列表（报告模糊查询）
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @param page
	 * @param size
	 * @param name
	 * @param occupationType
	 * @param degree
	 * @param workExperience
	 * @param workSalary
	 * @param workStatus
	 * @param talentLevel
	 * @param recommendNum
	 * @param isRecommend
	 * @param candidateId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/a/talent/search", method = RequestMethod.GET)
	public String getTalentList(HttpServletRequest request, HttpServletResponse response, ModelMap model, Integer page,
			Integer size, String name, String occupationType, String degree, String workExperience, String workSalary,
			String workStatus, String talentLevel, String recommendNum, String isRecommend, Long candidateId)
			throws Exception {
		log.info("================================");
		log.info("page = " + page + ", size = " + size + ", name = " + name + ", occupationType = " + occupationType
				+ ", degree = " + degree + ", workExperience = " + workExperience + ", workSalary = " + workSalary
				+ ", workStatus = " + workStatus + ", talentLevel = " + talentLevel + ", recommendNum = " + recommendNum
				+ ", isRecommend " + isRecommend + ", candidateId = " + candidateId);
		if (page == null || page <= 0) {
			page = 1;
		}
		if (size == null || size <= 0) {
			size = 10;
		}

		int start = (page - 1) * size;
		if (start < 0) {
			start = 0;
		}

		try {

			/* 得到列表的ids,名字是模糊搜索 */
			Map<String, Object> param = DynamicUtil.getTalentList(name, occupationType, degree, workExperience,
					workSalary, workStatus, talentLevel, recommendNum, isRecommend, candidateId, false);
			log.info(" get ids param = " + param);
			List<Long> ids = talentService.getIdsByDynamicCondition(Talent.class, param, start, size);
			log.info(param.get("name") + " get ids = " + ids);
			List<Talent> talentList = talentService.getObjectsByIds(ids);
			log.info(" talentList = " + talentList);

			/* count统计个数 */
			Map<String, Object> countParam = DynamicUtil.getTalentList(name, occupationType, degree, workExperience,
					workSalary, workStatus, talentLevel, recommendNum, isRecommend, candidateId, true);
			log.info(" get count param = " + countParam);
			Long totalSize = talentService.getIdsByDynamicCondition(Talent.class, countParam, 0, Integer.MAX_VALUE)
					.get(0);
			log.info(" get total = " + totalSize);

			model.addAttribute("code", 0);
			model.addAttribute("page", page);
			model.addAttribute("size", size);
			model.addAttribute("total", totalSize);
			model.addAttribute("talentList", talentList);
		} catch (Throwable t) {
			log.error(t.getMessage());
			log.error("get TalentList Error");
			model.addAttribute("code", -1);
		}

		return "/carrots-home-service/talent/json/talentListJson";
	}

	/**
	 * 查询人才详情
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/a/talent/{id}", method = RequestMethod.GET)
	public String getTalentJson(HttpServletRequest request, HttpServletResponse response, ModelMap model,
			@PathVariable Long id) throws Exception {
		log.info("================================");
		log.info("get talent data : id = " + id);
		// 校验
		if (id == null) {
			log.info("id is null");
			model.addAttribute("code", -12019);
			return "/common/fail";
		}
		
		try {
			Talent talent = talentService.getObjectById(id);
			if (talent == null) {
				model.addAttribute("code", -12018);
				log.info("talent of id " + id + "doesn't exist");
				return "/common/fail";
			}
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

	/**
	 * 新增人才
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @param talent
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/a/u/talent", method = RequestMethod.POST)
	public String addTalentJson(HttpServletRequest request, HttpServletResponse response, ModelMap model,
			@RequestBody Talent talent) throws Exception {
		log.info("================================");
		log.info("insert talent: talent = " + talent);

		if (null == talent.getName()) {
			model.addAttribute("code", -12000);
			return "common/fail";
		}

		if (null == talent.getPhone()) {
			model.addAttribute("code", -12002);
			return "common/fail";
		}

		if (null == talent.getOccupationType()) {
			model.addAttribute("code", -12006);
			return "common/fail";
		}

		// 推荐默认为需要推荐
		if (null == talent.getIsRecommend()) {
			talent.setIsRecommend(Talent.RECOMMEND);
		}
		// 状态默认为下架
		if (null == talent.getIsShelve() || !talent.getIsShelve().equals(Talent.SHELEVE_DOWN)) {
			talent.setIsShelve(Talent.SHELEVE_DOWN);
		}
		// 推荐职位数默认为0
		if (null == talent.getRecommendNum()) {
			talent.setRecommendNum(Talent.DEFAULT_RECOMMEND_NUM);
		}
		// 测评报告默认为无
		if (null == talent.getAppraisal()) {
			talent.setAppraisal(Talent.NOT_HAVE_APPRAISAL);
		}

		try {
			Long uid = Long.valueOf(cookieUtil.getKeyIdentity(request, CookieUtil.USER_ID));
			talent.setCreateBy(uid);
			talent.setUpdateBy(uid);
			log.info("insert talent: talent = " + talent);
			Long id = talentService.insert(talent);
			if (id == null) {
				log.info("insert talent failed");
				model.addAttribute("code", -12024);
				return "/common/fail";
			}
			log.info("id :" + id);
			model.addAttribute("code", 0);
			model.addAttribute("id", id);
		} catch (Throwable t) {
			t.printStackTrace();
			log.error(t.getMessage());
			log.error("add talent error ");
			model.addAttribute("code", -1);
		}
		return "/common/insert";
	}

	/**
	 * 删除人才记录
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/a/u/talent/{id}", method = RequestMethod.DELETE)
	public String deleteTalentJson(HttpServletRequest request, HttpServletResponse response, ModelMap model,
			@PathVariable Long id) throws Exception {
		log.info("================================");
		log.info("delete talent : id = " + id);
		// 校验
		if (id == null) {
			log.info("id is null");
			model.addAttribute("code", -12019);
			return "/common/fail";
		}
		
		Talent talent = null;
		try {
			talent = talentService.getObjectById(id);
			if (talent == null) {
				log.info("talent of id " + id + "doesn't exist");
				model.addAttribute("code", -12018);
				return "/common/fail";
			}
		} catch (Throwable t) {
			t.printStackTrace();
			log.error(t.getMessage());
			log.error("get talent error, id = " + id);
			model.addAttribute("code", -1);
		}

		log.info("get talent data, talent.isShelve = " + talent.getIsShelve());

		try {
			// 人才上架状态，先进行下架操作
			if (Talent.SHELEVE_UP.equals(talent.getIsShelve())) {
				model.addAttribute("code", -12014);
				return "/common/fail";
			}

			// 删除人才信息
			boolean deleteTalent = talentService.delete(id);
			if (!deleteTalent) {
				log.info("delete talent error, talent id = " + id);
				model.addAttribute("code", -12021);
				return "/common/fail";
			}

			log.info("delete talent success");

			// 删除人才对应测评报告
			List<Long> appraisalIds = appraisalService.getAppraisalIdsByTalentId(id, 0, Integer.MAX_VALUE);
			if (appraisalIds.size() > 0) {
				for (Long appraisalId : appraisalIds) {
					boolean deleteAppraisal = appraisalService.delete(appraisalId);
					if (!deleteAppraisal) {
						log.info("delete appraisal error, appraisal id = " + appraisalId);
						model.addAttribute("code", -12022);
						return "/common/fail";
					}
				}
			}
			model.addAttribute("code", 0);
		} catch (Throwable t) {
			t.printStackTrace();
			log.error(t.getMessage());
			log.error("delete talent error ", t);
			model.addAttribute("code", -1);
		}
		return "/data/json";
	}

	/**
	 * 修改人才信息
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @param id
	 * @param talent
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/a/u/talent/{id}", method = RequestMethod.PUT)
	public String updateTalentJson(HttpServletRequest request, HttpServletResponse response, ModelMap model,
			@PathVariable Long id, @RequestBody Talent talent) throws Exception {
		log.info("================================");
		log.info("update talent: id = " + id + ", talent = " + talent);
		// 校验
		if (null == talent.getName()) {
			model.addAttribute("code", -12000);
			return "common/fail";
		}
		if (null == talent.getEmail()) {
			model.addAttribute("code", -12001);
			return "common/fail";
		}
		if (null == talent.getPhone()) {
			model.addAttribute("code", -12002);
			return "common/fail";
		}
		if (null == talent.getDegree()) {
			model.addAttribute("code", -12003);
			return "common/fail";
		}
		if (null == talent.getMajor()) {
			model.addAttribute("code", -12004);
			return "common/fail";
		}
		if (null == talent.getWorkExperience()) {
			model.addAttribute("code", -12005);
			return "common/fail";
		}
		if (null == talent.getOccupationType()) {
			model.addAttribute("code", -12006);
			return "common/fail";
		}
		if (null == talent.getWorkIndustry()) {
			model.addAttribute("code", -12007);
			return "common/fail";
		}
		if (null == talent.getWorkStatus()) {
			model.addAttribute("code", -12008);
			return "common/fail";
		}
		if (null == talent.getWorkSalary()) {
			model.addAttribute("code", -12009);
			return "common/fail";
		}
		if (null == talent.getCounty()) {
			model.addAttribute("code", -12010);
			return "common/fail";
		}
		
		// 获取原人才信息
		try {
			Talent talentOld = talentService.getObjectById(id);
			if (talentOld == null) {
				log.info(" get oldTalent error, id = " + id);
				model.addAttribute("code", -12020);
				return "/common/fail";
			}
			talent.setCandidateId(talentOld.getCandidateId());
			talent.setAppraisal(talentOld.getAppraisal());
			talent.setTalentLevel(talentOld.getTalentLevel());
			talent.setRecommendNum(talentOld.getRecommendNum());
			talent.setIsShelve(talentOld.getIsShelve());
			talent.setCreateBy(talentOld.getCreateBy());
			talent.setCreateAt(talentOld.getCreateAt());

		} catch (Throwable t) {
			t.printStackTrace();
			log.error(t.getMessage());
			log.error("get talentOld error, id is " + id, t);
			model.addAttribute("code", -1);
			return "/common/fail";
		}

		try {
			log.info("update talent : talent = " + talent);
			Long uid = Long.valueOf(cookieUtil.getKeyIdentity(request, CookieUtil.USER_ID));
			talent.setUpdateBy(uid);
			talent.setId(id);
			boolean updateTalent = talentService.update(talent);
			if (!updateTalent) {
				log.info("update talent error, talent id = " + id);
				model.addAttribute("code", -12023);
				return "/common/fail";
			}
			model.addAttribute("code", 0);
		} catch (Throwable t) {
			t.printStackTrace();
			log.error(t.getMessage());
			log.error("update talent error, id = " + id, t);
			model.addAttribute("code", -1);
		}
		return "/data/json";
	}

	/**
	 * 人才电话校验
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @param id
	 * @param phone
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/a/talent/phone", method = RequestMethod.GET)
	public String checkPhone(HttpServletRequest request, HttpServletResponse response, ModelMap model, Long id,
			String phone) throws Exception {
		log.info("================================");
		log.info("check phone : phone = " + phone + ", id = " + id);
		// 校验
		if (null == phone) {
			model.addAttribute("code", -12002);
			return "/common/fail";
		}
		
		try {
			List<Long> talentIds = talentService.getTalentIdsByPhone(phone, 0, Integer.MAX_VALUE);
			int count = talentIds.size();

			// 查询到多个id，验证不通过
			if (count > 1) {
				log.info("get count > 1 : count = " + count);
				model.addAttribute("code", -12011);
				return "/common/fail";
			}
			if (count == 1) {
				log.info("get count = 1");
				// 新增时查到id，验证不通过
				if (id == null) {
					log.info("id = null");
					model.addAttribute("code", -12011);
					return "/common/fail";
				}
				// 编辑时查到id，且与传入的id一致，验证通过
				if (id.equals(talentIds.get(0))) {
					model.addAttribute("code", 0);
					return "/data/json";
				}
				// 编辑时查到id，但与传入的id不一致，验证不通过
				model.addAttribute("code", -12011);
				return "/common/fail";
			}
			// 查询不到id，验证通过
			log.info("get no any count : count = 0");
			model.addAttribute("code", 0);
		} catch (Throwable t) {
			t.printStackTrace();
			log.error(t.getMessage());
			log.error("check phone error", t);
			model.addAttribute("code", -1);
		}
		return "/data/json";
	}

	/**
	 * 人才上下架状态更改接口
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @param id
	 * @param isShelve
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/a/u/talent/status", method = RequestMethod.PUT)
	public String updateTalentStatusJson(HttpServletRequest request, HttpServletResponse response, ModelMap model,
			Long id, String isShelve) throws Exception {
		log.info("================================");
		log.info("update talent status : id = " + id + ", isShelve = " + isShelve);
		// 校验
		if (id == null) {
			log.info("id is null");
			model.addAttribute("code", -12019);
			return "/common/fail";
		}
		if (isShelve == null) {
			model.addAttribute("code", -12012);
			return "/common/fail";
		}
		
		try {
			Talent talent = talentService.getObjectById(id);
			if (talent == null) {
				log.info("talent of id " + id + "doesn't exist");
				model.addAttribute("code", -12018);
				return "/common/fail";
			}
			log.info("get talent data, talent = " + talent);

			String talentLevel = talent.getTalentLevel();
			// 人才等级为空，不能执行上下架操作
			if (talentLevel == null) {
				model.addAttribute("code", -12015);
				return "/common/fail";
			}

			// 上架人才超过5人，不能执行上架操作
			if (Talent.SHELEVE_UP.equals(isShelve)) {
				Integer shelveUpNum = talentService.countTalentIdsByTalentLevelAndIsShelve(talentLevel, isShelve);
				log.info("shelveUpNum = " + shelveUpNum);
				if (shelveUpNum >= 5) {
					model.addAttribute("code", -12013);
					return "/common/fail";
				}
			}

			talent.setIsShelve(isShelve);

			Long uid = Long.valueOf(cookieUtil.getKeyIdentity(request, CookieUtil.USER_ID));
			talent.setUpdateBy(uid);

			boolean updateTalent = talentService.update(talent);
			if (!updateTalent) {
				log.info("update talent error, talent id = " + id);
				model.addAttribute("code", -12023);
				return "/common/fail";
			}

			model.addAttribute("code", 0);

		} catch (Throwable t) {
			t.printStackTrace();
			log.error(t.getMessage());
			log.error("update talent error, id = " + id, t);
			model.addAttribute("code", -1);
		}

		return "/data/json";
	}

}
