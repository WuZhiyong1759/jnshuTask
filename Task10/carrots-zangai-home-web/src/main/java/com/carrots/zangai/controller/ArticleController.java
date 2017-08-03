package com.carrots.zangai.controller;

import com.carrots.zangai.util.DynamicUtil;
import com.carrots.zangai.util.LeeZerUtil;
import com.ptteng.carrots.zangai.model.Article;
import com.ptteng.carrots.zangai.service.ArticleService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * Article  crud
 * 
 * @author magenm
 * @Date 2014-4-16 13:43
 * 
 */
@Controller
public class ArticleController {
	private static final Log log = LogFactory.getLog(ArticleController.class);

	@Autowired
	private ArticleService articleService;


	/*
	*@Author LeeZer
	*@Date 2017/7/9 16:43
	*@Description
	* Bannerz展示
	* 请求参数:
	* @Param title
	* @Param type
	* @Param size
	* @Param startDate
	* @Param endDate
	* @Param industry
	* @Param statu
	* @Param create_by(待定)
	*/
	@RequestMapping(value = "/a/article/list", method = RequestMethod.GET)
	public String getArticleSearch(HttpServletRequest request,
			HttpServletResponse response, ModelMap model,Integer type,Integer page, Integer size,Integer industry) throws Exception {
//		先进行分页初始化
		if (type==null){
			log.info("type is null");
			model.addAttribute("code",-1000);
			return null;
		}

		page= LeeZerUtil.getCanShu(page,1);
		size= LeeZerUtil.getCanShu(size,10);
		int start= LeeZerUtil.getNowCoulmn(page,size);
//		初始化查询list
		List<Long> ids=null;
//		自定义dynamticUtil
		
		try {

			Map<String,Object> param= DynamicUtil.getArticleBanner(type,industry);
			log.info("get  param data is " + param);
			ids=articleService.getIdsByDynamicCondition(Article.class,param,start,size);

			log.info("article ids is:"+ids);
//			获取到 ids 然后 把ids里面的参数传出来

//			通过 后用articleList  接收到id对象的信息然后把结果传出来
			List<Article> articleList=articleService.getObjectsByIds(ids);
			log.info("articleList ids is:"+articleList);

			model.addAttribute("code", 0);
			model.addAttribute("page", page);
			model.addAttribute("size", size);
			model.addAttribute("total", ids.size());
			model.addAttribute("articleList",articleList);

		} catch (Throwable t) {

			log.error(t.getMessage());
			log.error("get article error");
			model.addAttribute("code", -1);
			return "/common/fail";
		}

		return "/article/json/articleListJson";
	}

	@RequestMapping(value = "/a/u/article/search", method = RequestMethod.GET)
	public String getArticleSearch(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, String title,Integer type,Integer page, Integer size,Long startDate,Long endDate,Integer industry,String create_By,Integer statu) throws Exception {
//		先进行分页初始化

		page= LeeZerUtil.getCanShu(page,1);
		size= LeeZerUtil.getCanShu(size,10);
		int start= LeeZerUtil.getNowCoulmn(page,size);
//		初始化查询list
		List<Article> articleList=null;
//		自定义dynamticUtil

		try {

			Map<String,Object> param= DynamicUtil.getArticleList(title, startDate, endDate,type, statu,industry);
			List<Long> ids=articleService.getIdsByDynamicCondition(Article.class,param,start,size);

			log.info("article ids is:"+ids);
//			获取到 ids 然后 把ids里面的参数传出来

//			通过 后用articleList  接收到id对象的信息然后把结果传出来
			articleList=articleService.getObjectsByIds(ids);

			model.addAttribute("code", 0);
			model.addAttribute("page", page);
			model.addAttribute("size", size);
			model.addAttribute("total", ids.size());
			model.addAttribute("articleList",articleList);

		} catch (Throwable t) {

			log.error(t.getMessage());
			log.error("get article error");
			model.addAttribute("code", -1);
			return "/common/fail";
		}

		return "/article/json/articleListJson";
	}


	
	
	
	
}

