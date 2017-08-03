package com.ptteng.carrots.home.controller;

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

import com.ptteng.carrots.home.model.Recommend;
import com.ptteng.carrots.home.model.Talent;
import com.ptteng.carrots.home.service.RecommendService;
import com.ptteng.carrots.home.service.TalentService;
import com.qding.common.util.http.cookie.CookieUtil;

import util.DynamicUtil;

/**
 * Created by oeasy9999 on 2017/3/17.
 */
@Controller
public class RecommendController {

	private static final Log log = LogFactory.getLog(RecommendController.class);

	@Autowired
	private RecommendService recommendService;

	@Autowired
	private TalentService talentService;

	@Autowired
	private CookieUtil cookieUtil;

	/**
	 * 查询推荐详情
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/a/recommend/{id}", method = RequestMethod.GET)
	public String getRecommendJson(HttpServletRequest request, HttpServletResponse response, ModelMap model,
			@PathVariable Long id) {
		log.info("================================");
		log.info("get recommend data : id = " + id);
		// 校验
		if (id == null) {
			log.info("recommend id is null");
			model.addAttribute("code", -10503);
			return "/common/fail";
		}
		try {
			Recommend recommend = recommendService.getObjectById(id);
			if (recommend == null) {
				log.info("recommend of id = " + id + "doesn't exist");
				model.addAttribute("code", -10504);
				return "/common/fail";
			}
			log.info("get recommend data is " + recommend);
			model.addAttribute("recommend", recommend);
			model.addAttribute("code", 0);
		} catch (Throwable t) {
			t.printStackTrace();
			log.error(t.getMessage());
			log.error("get recommend error, id is " + id, t);
			model.addAttribute("code", -1);
		}
		return "/carrots-home-service/recommend/json/recommendDetailJson";
	}

	/**
	 * 新增推荐
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @param recommend
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/a/u/recommend", method = RequestMethod.POST)
	public String addRecommendJson(HttpServletRequest request, HttpServletResponse response, ModelMap model,
			@RequestBody Recommend recommend) {
		log.info("================================");
		log.info("insert recommend: recommend = " + recommend);
		// 入参校验
		if (null == recommend.getCompanyId()) {
			model.addAttribute("code", -10500);
			return "/common/fail";
		}
		if (null == recommend.getProfessionId()) {
			model.addAttribute("code", -10501);
			return "/common/fail";
		}
		if (null == recommend.getTalentId()) {
			model.addAttribute("code", -10502);
			return "/common/fail";
		}

		try {
			// 插入推荐记录
			Long uid = Long.valueOf(cookieUtil.getKeyIdentity(request, CookieUtil.USER_ID));
			recommend.setCreateBy(uid);
			recommend.setUpdateBy(uid);
			log.info("insert recommend: recommend = " + recommend);
			Long id = recommendService.insert(recommend);
			if (id == null) {
				log.info("insert recommend failed");
				model.addAttribute("code", -10505);
				return "/common/fail";
			}
			log.info("id :" + id);

			// 修改人才推荐职位数
			Talent talent = talentService.getObjectById(recommend.getTalentId());
			if (talent == null) {
				log.info("talent of id = " + recommend.getTalentId() + "doesn't exist");
				model.addAttribute("code", -10512);
				return "/common/fail";
			}
			Long recommendNum = talent.getRecommendNum();
			log.info("talent recommendNum : recommendNum = " + recommendNum);
			talent.setRecommendNum(recommendNum + 1);
			talent.setUpdateBy(uid);
			boolean updateTalent = talentService.update(talent);
			if (!updateTalent) {
				log.info("update talent recommend number error, talent id = " + recommend.getTalentId());
				model.addAttribute("code", -10506);
				return "/common/fail";
			}

			model.addAttribute("code", 0);
			model.addAttribute("id", id);
		} catch (Throwable t) {
			t.printStackTrace();
			log.error(t.getMessage());
			log.error("add recommend error", t);
			model.addAttribute("code", -1);
		}
		return "/common/insert";
	}

	/**
	 * 查询推荐
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @param name
	 * @param occupationType
	 * @param company
	 * @param recommendFrom
	 * @param recommendTo
	 * @param reserveFrom
	 * @param reserveTo
	 * @param salaryFrom
	 * @param salaryTo
	 * @param chargeFrom
	 * @param chargeTo
	 * @param page
	 * @param size
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/a/recommend/search", method = RequestMethod.GET)
	public String getMultiRecommendJson(HttpServletRequest request, HttpServletResponse response, ModelMap model,
			String name, String occupationType, String company, Long recommendFrom, Long recommendTo, Long reserveFrom,
			Long reserveTo, Long salaryFrom, Long salaryTo, Long chargeFrom, Long chargeTo, Integer page,
			Integer size) {
		log.info("================================");
		log.info("name = " + name + ", occupationType = " + occupationType + ", company = " + company
				+ ", recommendFrom = " + recommendFrom + ", recommondTo = " + recommendTo + ", reserveFrom = "
				+ reserveFrom + ", reserveTo = " + reserveTo + ", salaryFrom = " + salaryFrom + ", salaryTo = "
				+ salaryTo + ", chargeFrom = " + chargeFrom + ", chargeTo = " + chargeTo + ", page = " + page
				+ ", size = " + size);
		/* page默认为1， size默认10 */
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
			/* 组装动态sql */
			Map<String, Object> param = DynamicUtil.getRecommendList(name, occupationType, company, recommendFrom,
					recommendTo, reserveFrom, reserveTo, salaryFrom, salaryTo, chargeFrom, chargeTo, false);
			log.info("get param data is " + param);
			/* 通过动态sql查询获取推荐id列表 */
			List<Long> ids = recommendService.getIdsByDynamicCondition(Recommend.class, param, start, size);
			log.info(param.get("name") + " get ids = " + ids);

			List<Recommend> recommendList = recommendService.getObjectsByIds(ids);
			log.info("get recommendList = " + recommendList);

			Map<String, Object> countParam = DynamicUtil.getRecommendList(name, occupationType, company, recommendFrom,
					recommendTo, reserveFrom, reserveTo, salaryFrom, salaryTo, chargeFrom, chargeTo, true);
			log.info(" get count param = " + countParam);
			Long totalSize = recommendService
					.getIdsByDynamicCondition(Recommend.class, countParam, 0, Integer.MAX_VALUE).get(0);
			log.info(" get total = " + totalSize);

			model.addAttribute("code", 0);
			model.addAttribute("page", page);
			model.addAttribute("size", size);
			model.addAttribute("total", totalSize);
			model.addAttribute("recommendList", recommendList);
		} catch (Throwable t) {
			log.error(t.getMessage());
			log.error("get recommend error ", t);
			model.addAttribute("code", -1);
		}
		return "/carrots-home-service/recommend/json/recommendListJson";
	}

	/**
	 * 根据人才id查询推荐
	 * 
	 * @param response
	 * @param request
	 * @param model
	 * @param talentId
	 * @param page
	 * @param size
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/a/recommend/list/{talentId}", method = RequestMethod.GET)
	public String getRecommendJsonWithTalentId(HttpServletResponse response, HttpServletRequest request, ModelMap model,
			@PathVariable Long talentId, Integer page, Integer size) throws Exception {
		log.info("================================");
		log.info("get talentId recommend list, talentId = " + talentId + ", page = " + page + ", size = " + size);
		// 入参校验
		if (null == talentId) {
			log.info("get recommend by talentId, talentId is null");
			model.addAttribute("code", -10507);
			return "/common/fail";
		}

		/* page默认为1， size默认10 */
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

		/* 推荐id列表 */
//		List<Long> ids = null;
//		List<Long> count = null;
		try {
//			Map<String, Object> param = DynamicUtil.getRecommendList(talentId);
//			log.info("get param data is " + param);
//			/* 通过动态sql查询获取推荐id列表 */
//			ids = recommendService.getIdsByDynamicCondition(Recommend.class, param, start, size);
//
//			count = recommendService.getIdsByDynamicCondition(Recommend.class, param, start, size);
//
//			List<Recommend> recommendList = recommendService.getObjectsByIds(ids);
//
//			log.info("get recommend data is " + recommendList);
			
			List<Long> ids = recommendService.getRecommendIdsByTalentId(talentId, 0, Integer.MAX_VALUE);
			log.info(" get ids = " + ids);
			if (ids == null) {
				model.addAttribute("code", -10508);
				return "/common/fail";
			}
			List<Recommend> recommendList = recommendService.getObjectsByIds(ids);
			log.info("get recommendList = " + recommendList);
			
			Integer totalSize = recommendService.countRecommendIdsByTalentId(talentId);
			log.info(" get total = " + totalSize);

			model.addAttribute("code", 0);
			model.addAttribute("page", page);
			model.addAttribute("size", size);
			model.addAttribute("total", totalSize);
			model.addAttribute("recommendList", recommendList);
		} catch (Throwable t) {
			log.error(t.getMessage());
			log.error("get recommend error ", t);
			model.addAttribute("code", -1);
		}
		return "/carrots-home-service/recommend/json/recommendListJson";
	}

	/**
	 * 更新推荐
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @param id
	 * @param recommend
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/a/u/recommend/{id}", method = RequestMethod.PUT)
	public String updateRecommendJson(HttpServletRequest request, HttpServletResponse response, ModelMap model,
			@PathVariable Long id, @RequestBody Recommend recommend) throws Exception {
		log.info("================================");
		log.info("id = " + id + ", recommend = " + recommend);
		// 校验
		if (id == null) {
			log.info("recommend id is null");
			model.addAttribute("code", -10503);
			return "/common/fail";
		}
		
		try {
			Recommend recommendOld = recommendService.getObjectById(id);
			if (recommendOld == null) {
				log.info(" get recommendOld error, id = " + id);
				model.addAttribute("code", -10509);
				return "/common/fail";
			}
			recommend.setCompanyId(recommendOld.getCompanyId());
			recommend.setProfessionId(recommendOld.getProfessionId());
			recommend.setTalentId(recommendOld.getTalentId());
			recommend.setCreateBy(recommendOld.getCreateBy());
			recommend.setCreateAt(recommendOld.getUpdateAt());
		} catch (Throwable t) {
			t.printStackTrace();
			log.error(t.getMessage());
			log.error("get recommendOld error, id is " + id);
			model.addAttribute("code", -1);
			return "/common/fail";
		}

		try {
			log.info("update recommend: recommend= " + recommend);
			Long uid = Long.valueOf(cookieUtil.getKeyIdentity(request, CookieUtil.USER_ID));
			recommend.setUpdateBy(uid);
			recommend.setId(id);
			boolean updateRecommend = recommendService.update(recommend);
			if (!updateRecommend) {
				log.info("update recommend error, recommend id = " + id);
				model.addAttribute("code", -10510);
				return "/common/fail";
			}
			model.addAttribute("code", 0);
		} catch (Throwable t) {
			t.printStackTrace();
			log.error(t.getMessage());
			log.error("update recommend error, id is " + id, t);
			model.addAttribute("code", -1);
		}
		return "/data/json";
	}

	/**
	 * 删除推荐
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/a/u/recommend/{id}", method = RequestMethod.DELETE)
	public String deleteRecommendJson(HttpServletRequest request, HttpServletResponse response, ModelMap model,
			@PathVariable Long id) throws Exception {
		log.info("================================");
		log.info("delete recommend : id = " + id);
		// 校验
		if (id == null) {
			log.info("id is null");
			model.addAttribute("code", -10503);
			return "/common/fail";
		}
	
		try {
			Recommend recommend = recommendService.getObjectById(id);
			if (recommend == null) {
				log.info("recommend of id " + id + "doesn't exist");
				model.addAttribute("code", -10504);
				return "/common/fail";
			}
			boolean deleteRecommend = recommendService.delete(id);
			if (!deleteRecommend) {
				log.info("delete recommend error, recommend id = " + id);
				model.addAttribute("code", -10511);
				return "/common/fail";
			}
			log.info("delete recommend success");

			// 修改人才推荐职位数
			Talent talent = talentService.getObjectById(recommend.getTalentId());
			if (talent == null) {
				log.info("talent of id = " + recommend.getTalentId() + "doesn't exist");
				model.addAttribute("code", -10512);
				return "/common/fail";
			}
			Long recommendNum = talent.getRecommendNum();
			log.info("talent recommendNum : recommendNum = " + recommendNum);
			talent.setRecommendNum(recommendNum - 1);
			boolean updateTalent = talentService.update(talent);
			if (!updateTalent) {
				log.info("update talent recommend number error, talent id = " + recommend.getTalentId());
				model.addAttribute("code", -10506);
				return "/common/fail";
			}

			model.addAttribute("code", 0);
		} catch (Throwable t) {
			t.printStackTrace();
			log.error(t.getMessage());
			log.error("delete recommend error, id is " + id, t);
			model.addAttribute("code", -1);
		}
		return "/data/json";
	}

}
