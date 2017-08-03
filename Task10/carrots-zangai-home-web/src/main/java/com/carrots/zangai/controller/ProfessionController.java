package com.carrots.zangai.controller;

import com.carrots.zangai.util.DynamicUtil;
import com.carrots.zangai.util.LeeZerUtil;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.carrots.zangai.model.*;
import com.ptteng.carrots.zangai.service.*;
import javassist.bytecode.annotation.IntegerMemberValue;
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
import javax.swing.text.html.HTML;
import java.util.*;

/**
 * Profession  crud
 * 
 * @author magenm
 * @Date 2014-4-16 13:43
 * 
 */
@Controller
public class ProfessionController {
	private static final Log log = LogFactory.getLog(ProfessionController.class);

	@Autowired
	private ProfessionService professionService;

	@Autowired
	private CompanyLabelService companyLabelService;

	@Autowired
	private CompanyService companyService;
	@Autowired
	 private  ProfessionLabelService professionLabelService;
	@Autowired
	private ProducterService producterService;

	/*
	 *@Author LeeZer
	 *@Date 2017/7/11 10:58
	 *@Description  前台最新职位/推荐职位页面
	 * @Param workexp
	 * @Param name
	 * @Param industry
	 * @Param city
	 * @Param recommend
	 * @Param page
	 * @Param size
	 * @Param salary
	 * @Param releasedAt
	 */
	@RequestMapping(value = "/a/profession/search", method = RequestMethod.GET)
	public String getprofessionList(HttpServletRequest request,
			HttpServletResponse response, ModelMap model,String name,Integer industry,String city,Integer recommend,
									Integer workexp,Integer salary,Integer page, Integer size
	,String compareTime ,Integer education
	) throws Exception {

		
		
		log.info("data:" +industry);
		log.info("data:" +name);
		log.info("data:" +workexp);
		log.info("data:" +salary);
		log.info("data:" +city);
		log.info("data:" +recommend);
		log.info("data:" +page);
		log.info("data:" +size);
//		判断

		page= LeeZerUtil.getCanShu(page,1);
		size= LeeZerUtil.getCanShu(size,10);
		int start= LeeZerUtil.getNowCoulmn(page,size);

		try {
//			获取职位ids
			Map<String,Object> params=DynamicUtil.getProfessionList(name,city,industry,workexp,salary,education,compareTime,recommend);
		    List<Long> ids=professionService.getIdsByDynamicCondition(Profession.class,params,0,Integer.MAX_VALUE);
		    log.info("ids"+ ids);
		    Long total=(long)ids.size();
		     List<Long> professionList=professionService.getIdsByDynamicCondition(Profession.class,params,start,size);
             log.info("professionList"+professionList);

             List<Profession> list =professionService.getObjectsByIds(professionList);

//             用一个Data来封装我们需要返回的数据

			List<HashMap<String,Object>> professionData =new ArrayList<HashMap<String, Object>>();

//			前台需要返回的还有公司属性和公司标签 公司因为已经在取出职位的时候取出了，所以我们需要先处理公司标签

			Map<String,Object> companyLabelParam =DynamicUtil.getCompanyLableList();

			List<Long> companyLabelIds =companyLabelService.getIdsByDynamicCondition(CompanyLabel.class,companyLabelParam,0,Integer.MAX_VALUE);

			List<CompanyLabel> companyLabelList=companyLabelService.getObjectsByIds(companyLabelIds);

//          这里我们已经取到了所有的公司标签,因为我们去到的list是多个符合搜索条件的list，所以我们需要从职位标签里把所有的
//			都取出来，然后再去循环遍历的时候知道我们用了那一个
			for(Profession profession :list){
				HashMap<String,Object> professionDataMap =new HashMap<String, Object>();

				professionDataMap.put("professionId",profession.getId());


				professionDataMap.put("professionName",profession.getName());


				professionDataMap.put("salary",profession.getSalary());


				professionDataMap.put("city",profession.getCity());


				professionDataMap.put("county",profession.getCounty());


				professionDataMap.put("education",profession.getEducation());


				professionDataMap.put("workExp",profession.getWorkexp());

				professionDataMap.put("releasedAt",profession.getReleasedAt());



				Long id =profession.getCId();

				Company company= companyService.getObjectById(id);

				professionDataMap.put("companyId",company.getId());

				professionDataMap.put("companyName",company.getName());

				professionDataMap.put("companyLogo",company.getLogo());

				professionDataMap.put("companyIndustry",company.getIndustry());


//                获取公司标签，注意需要考虑是否有公司没有公司标签

				String pause=" ";
				for (int i=0;i<companyLabelList.size();i++){
					if (company.getId().equals(companyLabelList.get(i).getCId())) {
						pause += companyLabelList.get(i).getContent() + ".";
					}
				String[] pauses=pause.split("\\.",0);
					for(String w:pauses)
						System.out.println(w);

				log.info("pauses:"+pauses);
				}
				if (pause!=null){
					professionDataMap.put("companyLabel",pause);
				}else {
					professionDataMap.put("companyLabel",null);
				}


				professionData.add(professionDataMap);

			}
			model.addAttribute("code",0);
			model.addAttribute("page",page);
			model.addAttribute("size",size);
			model.addAttribute("total",total);
			model.addAttribute("professionData",professionData);


		}catch (Exception e){

			e.printStackTrace();
			log.error(e.getMessage());
			model.addAttribute("code",-603);
		}

		return "/profession/json/professionDetailJson";
	}
    
    

    
	/*
	*@Author LeeZer
	*@Date  15:32
	*@Description\
	* 公司职位详情页
	*/

	@RequestMapping(value = "/a/profession/detail/{id}")
	public String getProfesssionInf(HttpServletResponse response,HttpServletRequest request,ModelMap model,
									@PathVariable Long id) throws ServiceException, ServiceDaoException {

		try {
			Profession profession = professionService.getObjectById(id);
			log.info(profession);

			Long cid = profession.getCId();

			Company company = companyService.getObjectById(cid);

			Map<String, Object> params = DynamicUtil.getProfessionLabelByCId(id);

			List<Long> pidList = professionLabelService.getIdsByDynamicCondition(ProfessionLabel.class, params, 0, Integer.MAX_VALUE);

			List<ProfessionLabel> professionLabelList = professionLabelService.getObjectsByIds(pidList);
			log.info("professionLabel is:" + professionLabelList);

			Map<String, Object> param1 = DynamicUtil.getProducterByCompanyId(id);

			List<Long> pridlist = producterService.getIdsByDynamicCondition(Producter.class, param1, 0, Integer.MAX_VALUE);

			List<Producter> producterList=producterService.getObjectsByIds(pridlist);

			model.addAttribute("code",0);
			model.addAttribute("company",company);
			model.addAttribute("professionLabelList",professionLabelList);
			model.addAttribute("producterList",producterList);
			model.addAttribute("profession",profession);
		}catch (Throwable t){
			t.printStackTrace();
			return "/common/fail";
		}
    return "/profession/json/professionDetail";

	}
	
	

	/*
	*@Author LeeZer
	*@Date 2017/7/20 17:06
	*@Description
	* 获取推荐职位公司
	*/

	@RequestMapping(value = "/a/popularCompany/list")
	public String getPopularCompany(HttpServletRequest request,HttpServletResponse response,ModelMap model) throws ServiceDaoException {
		try{
		Map<String,Object> param=DynamicUtil.getProfessionList();
		List<Long> idList = professionService.getIdsByDynamicCondition(Profession.class,param,0, Integer.MAX_VALUE);

		List<Profession> professionList=professionService.getObjectsByIds(idList);
		List<Long> list=new ArrayList<>();
		for (Profession profession:professionList){
           list.add(profession.getCId());
		}
		log.info("重复的公司id是");

		LinkedHashSet<Long> set=new LinkedHashSet<>(list);
		List<Long> newList=new ArrayList<Long>(set);

		log.info("去除重复后的id是" +newList);

			List<Long> idProfessionList = null;

        List<Company> companyList=companyService.getObjectsByIds(newList);



			// 此处获取到全部职位列表
			Map<String, Object> professionParam = DynamicUtil.getProfessionLists();
			log.info("get  professionParam data is " + professionParam);
			idProfessionList = professionService.getIdsByDynamicCondition(Profession.class, professionParam, 0,
					Integer.MAX_VALUE);
			log.info("get idProfessionList data is " + idProfessionList);
			List<Profession> listProfession = professionService.getObjectsByIds(idProfessionList);
			log.info("get listProfession data is " + listProfession);

			List<HashMap<String, Object>> popularDataList = new ArrayList<HashMap<String, Object>>();
			for (Company company : companyList) {
				HashMap<String, Object> popularDataMap = new HashMap<String, Object>();


				String tempName = "";
				String tempId = "";

				for (int i = 0; i < listProfession.size(); i++) {
					if (company.getId().equals(listProfession.get(i).getCId())) {
						log.info("遍历时,职位表中出现的companyId is：" + company.getId());
						tempId += listProfession.get(i).getId() + ",";
						tempName += listProfession.get(i).getName() + ",";
					}
				}

				tempId = tempId.substring(0, tempId.length() - 1);
				tempName = tempName.substring(0, tempName.length() - 1);

				popularDataMap.put("professionId", tempId);
				popularDataMap.put("professionName", tempName);
				popularDataMap.put("companyId", company.getId());
				popularDataMap.put("companyName", company.getName());
				popularDataMap.put("companyLogo", company.getLogo());
				popularDataMap.put("financing", company.getFinancing());
				popularDataMap.put("industry", company.getIndustry());
				popularDataMap.put("province", company.getCity());
				popularDataMap.put("city", company.getCity());
				popularDataMap.put("county", company.getCounty());
				popularDataList.add(popularDataMap);
			}
			model.addAttribute("code", 0);
			model.addAttribute("popularDataList", popularDataList);



		}catch (ServiceException e) {
			e.printStackTrace();

		}
		return "/profession/json/popularCompany";
	}
}

