package com.carrots.zangai.controller;

import com.carrots.zangai.util.DynamicUtil;
import com.carrots.zangai.util.LeeZerUtil;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.carrots.zangai.model.*;
import com.ptteng.carrots.zangai.service.CompanyLabelService;
import com.ptteng.carrots.zangai.service.CompanyService;
import com.ptteng.carrots.zangai.service.ProducterService;
import com.ptteng.carrots.zangai.service.ProfessionService;
import com.qding.common.util.DataUtils;
import com.qding.common.util.FileUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.DateTime;
import org.python.antlr.ast.Str;
import org.python.antlr.op.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * Company  crud
 *
 * @author magenm
 * @Date 2014-4-16 13:43
 */
@Controller
public class CompanyController {
    private static final Log log = LogFactory.getLog(CompanyController.class);

    @Autowired
    private CompanyService companyService;
    @Autowired
    private ProfessionService professionService;
    @Autowired
    private ProducterService producterService;
//   @Autowired
//   private com.qding.common.util.http.cookie.CookieUtil cookieUtil;
   @Autowired
   private CompanyLabelService companyLabelService;

    public  static  final  Integer UN_APPROVED=0;

    public  static  final  Integer APPROVED=1;

    public static  final  Integer FREEZED=1;

    public static  final  Integer UN_FREEZED=0;
   /*
   *@Author LeeZer
   *@Date 2017/7/15 10:47
   *@Description  找精英 公司职位列表页
   * @Para,
   */

    @RequestMapping(value = "/a/company/list", method = RequestMethod.GET)
    public String getcompanyList(HttpServletRequest request,
                                 HttpServletResponse response, ModelMap model, Integer industry, String city,
                                 Integer financing, Integer page, Integer size) throws Exception {
        log.info("industry:" + industry);
        log.info("financing" + financing);


      page=  LeeZerUtil.getCanShu(page, 1);
      size=  LeeZerUtil.getCanShu(size, 10);
       int start= LeeZerUtil.getNowCoulmn(page,size);
//通过查询条件获取到ids

        try {


            Map<String, Object> params = DynamicUtil.getCompanyList(city, industry, financing);
            List<Long> ids = companyService.getIdsByDynamicCondition(Company.class, params, start, size);
            List<Company> companyList = companyService.getObjectsByIds(ids);
            List<HashMap<String, Object>> companyDataList = new ArrayList<HashMap<String, Object>>();
//		一样的我们需要算一下职位书，最初想用jobs去直接从后台存储这个数据的，后面想想不能这么改需求还是算了。
//		换了哥思路，虽然这样肯定会很耗内存。
//        那就直接根据职位列表里面取出所有和公司id相等，如果有这个数据就直接+1，缺点就是耗性能，需要再次去procfession
//		里面数据取出来比较
            Map<String, Object> professionparam = DynamicUtil.getProfessionList();
            List<Long> pIds = professionService.getIdsByDynamicCondition(Profession.class, professionparam, 0, Integer.MAX_VALUE);
            List<Profession> professionList = professionService.getObjectsByIds(pIds);
            for (Company company : companyList) {
                HashMap<String, Object> companyDataMap = new HashMap<String, Object>();
                int jobs = 0;
                for (int i = 0; i < professionList.size(); i++) {

                    if (company.getId().equals(professionList.get(i).getCId())) {

                        jobs += jobs;
                    }
                }
                companyDataMap.put("companyName", company.getName());
                companyDataMap.put("companyLogo", company.getLogo());
                companyDataMap.put("companyFinancing", company.getFinancing());
                companyDataMap.put("companyCity", company.getCity());
                companyDataMap.put("companyIndustry",company.getIndustry());
                companyDataMap.put("companySign", company.getSign());
                companyDataMap.put("jobs", jobs);
                companyDataList.add(companyDataMap);
            }
            model.addAttribute("code", 0);
            model.addAttribute("page", page);
            model.addAttribute("size", size);
            model.addAttribute("total", ids.size());
            model.addAttribute("companyDataList", companyDataList);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("code", -10001);
        }
        return "/company/json/companyDetailJson";
    }

    /*
    *@Author LeeZer
    *@Date 2017/7/15 16:01
    *@Description 后台公司查询接口，后台管理需要拦截
    * 所以我们需要自己
    */
    @RequestMapping(value = "/a/u/company/search", method = RequestMethod.GET)
    public String getCompanyList(HttpServletResponse response,HttpServletRequest request,Integer page,Integer size,String companyName,
            ModelMap model,String  producterName, String  city,String county,Integer industry,Integer  financing
          , Integer approved,Integer freezed      ){
        LeeZerUtil.getCanShu(page,1);
        LeeZerUtil.getCanShu(size,10);
        int start = LeeZerUtil.getNowCoulmn(page,size);

        List<Long> ids=null;
        List<Company> companyList=null;
        List<Long> pids =null;
        try {


            Map<String, Object> param =  DynamicUtil.getCompanyList(companyName,city,county,industry,financing,approved,freezed);
            ids=companyService.getIdsByDynamicCondition(Company.class,param,start,size);
            log.info("ids"+ids);
            companyList=companyService.getObjectsByIds(ids);
            List<HashMap<String,Object>> compantData =new ArrayList<HashMap<String, Object>>();
//            Map<String,Object> params=DynamicUtil.getProducter(producterName);
//            pids=producterService.getIdsByDynamicCondition(Producter.class,params,0,Integer.MAX_VALUE);
            List<Producter> producterList=producterService.getObjectsByIds(pids);
            for (Company company:companyList){
                HashMap<String,Object> companyDataMap =new HashMap<>();
                companyDataMap.put("companyName",company.getName());
                companyDataMap.put("industry",company.getIndustry());
                companyDataMap.put("city",company.getCity());
                companyDataMap.put("county",company.getCounty());
                companyDataMap.put("financing",company.getFinancing());
                companyDataMap.put("approved",company.getApproved());
                companyDataMap.put("freezed",company.getFreezed());
//
//                for (Producter producter:producterList){
//                    if (producter.getCId().equals(company.getId())){
//                    companyDataMap.put("")
//                    }
//                }

                compantData.add(companyDataMap);

            }

           model.addAttribute("code",0);
            model.addAttribute("page",page);
            model.addAttribute("size",size);
            model.addAttribute("total",ids.size());
            model.addAttribute("companyData",compantData);



        }catch (Exception e){
            e.printStackTrace();
            model.addAttribute("code",-10001);
        }
        return "/pages/company/companyAndProducterJson";

    }

    /*
    *@Author LeeZer
    *@Date 2017/7/15 21:16
    *@Description
    *   新增公司接口
    */

    @RequestMapping(value="/a/u/company",method = RequestMethod.POST)
    public String addCompanyInfo(HttpServletRequest request, HttpServletResponse response, @RequestBody CompanyData companyData
    ,ModelMap model){

//    因为我们要完成的是在一个提交按钮上提交三个表的信息插入，所以我们需要想好插入的顺序。这样插入才能保证我们的插入是万
//     万无一失手的
//      有位有几个必须传入的参数，虽然数据库里面我们也设置了如果我们不传的话数据是不会插入的。
//        但是我们也要给前端返回一个参数，告诉这个没有填写是不行的。

        Company company =companyData.getCompany();

        String companyLabel=companyData.getCompanyLabel();

        Producter producter=companyData.getProducter();



        Producter producter1=new Producter();

        if (company.getName()==null){
            model.addAttribute("code",-100001);
            return "/common/fail";
        }

        if (company.getSign()==null){
            model.addAttribute("code",-100001);
            return "/common/fail";
        }

        if (company.getLogo()==null){
            model.addAttribute("code",-100001);
            return "/common/fail";
        }

        if (company.getIntroduce()==null){
            model.addAttribute("code",-100001);
            return "/common/fail";
        }

        if (company.getNumber()==null){
            model.addAttribute("code",-100001);
            return "/common/fail";
        }

//       逻辑判断我那成之后就该是一些设置了，这里我们需要设置一下创建公司的人这样方便我们以后去查找
//        是哪里有问题；
//        Long aid=null;
////        在传入之前因为我们做了拦截，所以肯定会存在cooki当中
////      我们要做的就是把它从cookie中取出来
//        aid=Long.valueOf(cookieUtil.getKeyIdentity(request,com.qding.common.util.http.cookie.CookieUtil.USER_ID));
////      设置传入的创建者
//        company.setCreateBy(aid);
//z     拦截没做好，这里暂时不把set家进入try catch

            company.setApproved(UN_APPROVED);
            company.setFreezed(UN_FREEZED);


//       插入公司
        try {
         Long companyId=  companyService.insert(company);
         model.addAttribute("companyId", companyId);
         if (null !=companyLabel){
         String[] copmpanyLabels=companyLabel.split(",");
         List<String> companyLabelList= Arrays.asList(copmpanyLabels);
             List<CompanyLabel> labels=new ArrayList<>();
         for (String s:companyLabelList){
             CompanyLabel companyLabel1=new CompanyLabel();
            companyLabel1.setContent(s);
            companyLabel1.setCId(companyId);
            companyLabel1.setCreateAt(System.currentTimeMillis());
            companyLabel1.setUpdateAt(companyLabel1.getCreateAt());
            labels.add(companyLabel1);
         }
         companyLabelService.insertList(labels);
         if (null != producter){

                 producter1.setCId(companyId);
                 producter1.setSign(producter.getSign());
                 producter1.setLogo(producter.getLogo());
                 producter1.setName(producter.getName());
                 producter1.setCreateAt(System.currentTimeMillis());
                 producter1.setUpdateBy(producter.getCreateAt());

                 producterService.insert(producter1);
             }
         }


         model.addAttribute("code",0);


        }catch (Throwable t){
            t.printStackTrace();
            model.addAttribute("code",-9999);
            return "common/fail";
        }
        return "common/addsuccess";
    }

    /*
    *@Author LeeZer
    *@Date 2017/7/18 14:27
    *@Description
    * 更新公司信息
    */

    @RequestMapping(value = "/a/u/company/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public String updateCompanyInfo(HttpServletResponse response,HttpServletRequest request,ModelMap model,
                  @PathVariable Long id,@RequestBody CompanyData companyData){
     log.info("id is:"+id);
//     更新公司信息比新增麻烦，这里需要对多个表进行操作
//        理一下思路
//        更新信息，核心的就是update，那么也就是更新的时候我们需要把相关的信息更新到数据库中
//        公司标签因为我们存储的是一个数据 修改的时候不方便修改，直接insert之前删除所有相关的cidlabel然后
//        在重新insert
        if(id==null){
            log.info("id is null");
            model.addAttribute("code",-10086);
        }

        Company company=companyData.getCompany();
        String label =companyData.getCompanyLabel();
        Company company1=new Company();
        CompanyLabel companyLabel=new CompanyLabel();
        Producter producter =companyData.getProducter();

        if (company.getName()==null){
            model.addAttribute("code",-100001);
            return "/common/fail";
        }

        if (company.getSign()==null){
            model.addAttribute("code",-100001);
            return "/common/fail";
        }

        if (company.getLogo()==null){
            model.addAttribute("code",-100001);
            return "/common/fail";
        }

        if (company.getIntroduce()==null){
            model.addAttribute("code",-100001);
            return "/common/fail";
        }

        if (company.getNumber()==null){
            model.addAttribute("code",-100001);
            return "/common/fail";
        }

         try{
         company1=companyService.getObjectById(id);
         company.setFreezed(company1.getFreezed());
         company.setApproved(company1.getApproved());
         company.setCreateAt(company1.getCreateAt());

         company.setId(id);
         log.info("设置的id是："+id);

         log.info("准备更新的内容是"+company);

         companyService.update(company);
         log.info("更新的id是:"+id);

//        删除所有公司id为id的公司标签

//             List<CompanyLabel> companyLabelList=companyLabelService.getObjectsByIds(companyLabel1);
            try {
                Map<String,Object> paramLabel =DynamicUtil.getCompanyLabelByCompanyId(id);

                List<Long> companyLabel1=companyLabelService.getIdsByDynamicCondition(CompanyLabel.class,paramLabel,0,Integer.MAX_VALUE);


                companyLabelService.deleteList(CompanyLabel.class, companyLabel1);
            }
            catch (Throwable t){
            t.printStackTrace();
         }
             String companyLabel2=companyData.getCompanyLabel();
//             重新插入公司标签
             if (null !=companyLabel) {
                 String[] copmpanyLabels = label.split(",");
                 List<String> companyLabelList = Arrays.asList(copmpanyLabels);
                 for (String s : companyLabelList) {
                     companyLabel.setContent(s);
                     companyLabel.setCId(id);
                     companyLabel.setCreateAt(System.currentTimeMillis());
                     companyLabel.setUpdateAt(companyLabel.getCreateAt());
                     companyLabelService.insert(companyLabel);
                 }
             }

//           插入产品
//           产品的逻辑有些混乱，就是从原型图，只显示一个产品。可是并没有说明到底有多少产品。
//           现在的想法就是同过cid把我们取到的所有一个公司的产品取他的第一条数据去更新就行了。
//             producter.setCId(company.getId());
//             if(null !=producter.getName()&& !producter.equals("")&& null != producter){
//                 List<Long> prids=producterService.getProducterIdsByCId(comp,0,1);
////                 获取第一跳产品的数据id
//                 Long pid=prids.get(0);
//                 Producter p=producterService.getObjectById(pid);
//                 producter.setCId(company.getId());
////                 producter.setCreateBy();
//                producter.setCreateAt(p.getCreateAt());
//                 log.info("准备更新的内容是"+producter);
//                producterService.update(producter);
//
//             }
//              通过cid把公司属性取出来
//             List<Long> producterIdList=producterService.getProducterIdsByCId(id,0,10);
//             producterService.deleteList(Producter.class,producterIdList);
//             if (producterIdList !=null){
//                 for (Producter producter1:producter){
//                     producter1.setCreateAt(System.currentTimeMillis());
//                     producter1.setUpdateAt(producter1.getCreateAt());
//                     producter1.setCId(id);
//                     log.info("producter1 is" +producter1);
//                 producterService.insert(producter1);
//                 }
//             }


             if (producter != null && !producter.equals("") && producter.getName()!=null){
                 Map<String,Object> param=DynamicUtil.getProducterByCompanyId(id);
                 List<Long> idList=producterService.getIdsByDynamicCondition(Producter.class,param,0,1);
                 Long pid=idList.get(0);
                 Producter p =producterService.getObjectById(pid);
                 p.setName(producter.getName());
                 p.setSign(producter.getSign());
                 p.setCId(company.getId());
                 p.setCreateBy(producter.getCreateAt());
                 p.setLogo(producter.getLogo());
                 p.setUpdateAt(p.getCreateAt());
                 producterService.update(p);
             }

         }catch (Throwable t){
            t.printStackTrace();
            log.error(t.getMessage());
            log.error("update is erro"+t);
            model.addAttribute("code",-1);
            return "/common/fail";
         }



        return "success";


    }

    /*
    *@Author LeeZer
    *@Date 2017/7/18 21:27
    *@Description
    * 删除公司
    */

    @RequestMapping(value = "/a/u/company/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteCompanyInfo(HttpServletRequest request,HttpServletResponse response,ModelMap model,@PathVariable Long id)
    throws Exception{

        Company company=new Company();
        if (null==id){
            log.error("id is null");
            model.addAttribute("code",-1);
            return "/common/fail";
        }
//        List<Long> pids = professionService.getProfessionByCompanyId(id, 0,Integer.MAX_VALUE);
        Map<String,Object> param=DynamicUtil.getProfessionByCId(id);
        List<Long> pids=professionService.getIdsByDynamicCondition(Profession.class,param,0,Integer.MAX_VALUE);
//        判断职位是否为空
//            if ( DataUtils.isNotNullOrEmpty(pids) ) {
//                model.addAttribute("code", -15000);
//                return "/common/fail";
//            }


//        删除公司
        try{
            log.info("delete companyID is"+id);
            company=companyService.getObjectById(id);
                      if (company==null){
                          model.addAttribute("code",-40001);
//                     该公司不存在
                          return "/common/fail";
                      }
            companyService.delete(id);

        }catch (Throwable t){
            t.printStackTrace();
            log.error(t.getMessage());
            log.error("delete company error,id is  " + id);
            model.addAttribute("code", -1);
            return "/common/fail";
        }

//      删除职位，职位这里我么前面就判断过职位是否为空然后我们更具判断要用户先去伤处公司职位。
//       所以这里就不用写删除职位的逻辑，这里写下如果不需要判断的话直接删除职位。
       try{
//        professionService.getObjectsByIds(pids);

           professionService.deleteList(Profession.class,pids);
            log.info("delete is info");
        }catch (Throwable t){
           t.printStackTrace();
           log.error(t.getMessage());
           log.error("delete productList error,productIds is  " +  t);
           model.addAttribute("code", -1);
           return "/common/fail";
       }

//      删除公司标签
        try{
            Map<String,Object> params=DynamicUtil.getCompanyLabelByCompanyId(id);
        List<Long> ids=companyLabelService.getIdsByDynamicCondition(CompanyLabel.class,params,0, Integer.MAX_VALUE);
        log.info("get companyLablList is "+ids);
        companyLabelService.deleteList(CompanyLabel.class,ids);
        log.info("delete is success");
        }catch (Throwable t){
            t.printStackTrace();
            log.error(t.getMessage());
            log.error(" delete company error,id is  " + id);
            model.addAttribute("code", -1);
            return "/common/fail";
        }
//      删除公司产品
        try{
            Map<String,Object> param1=DynamicUtil.getProducterByCompanyId(id);
            List<Long> pid1=companyLabelService.getIdsByDynamicCondition(Producter.class,param1,0, Integer.MAX_VALUE);
            producterService.deleteList(Producter.class,pid1);
            log.info("delete is success for producter");

        }catch (Throwable t){t.printStackTrace();
            log.error(t.getMessage());
            log.error(" delete producter error id is  " + id);
            model.addAttribute("code", -1);
            return "/common/fail";
        }
        return "/common/success";

    }


    /*
    *@Author LeeZer
    *@Date 2017/7/18 22:23
    *@Description
    **修改删冻结和认证状态
    */

    @RequestMapping(value = "/a/u/company/status/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public String changeStatus(HttpServletResponse response,HttpServletRequest request,ModelMap model,Integer type,Integer
            status,@PathVariable Long id) throws ServiceException, ServiceDaoException {
        /*
       * type为 1 则修改冻结/解冻状态
       * status 1-解冻 0-冻结
       * type为 0 则修改认证/取消状态
       * status 0-解除认证 1-认证
       */
        if (null==id){
            model.addAttribute("code",-1);
            return "/copmmon/fail";
        }
//        if (type.equals(UN_FREEZED)){
//         model.addAttribute("code",-1);
//         return "/common/fail";
//        }
//        if (!UN_FREEZED.equals(status)){
//         model.addAttribute("code",-1);
//         return "/common/fail";
//        }
        Company company=companyService.getObjectById(id);

        if (type==1){
            company.setFreezed(status);
        }

        if (type==0){
            company.setApproved(status);
        }
        List<Profession> professionList=null;
        if (type==1&&status==0){
            company.setJobs(0);
        }

//        List<Long> p=professionService.getProfessionByCId(id,0,1);
        Map<String,Object> param=DynamicUtil.getProfessionByCId(id);
        List<Long> p =professionService.getIdsByDynamicCondition(Profession.class,param,0,Integer.MAX_VALUE);
//        冻结的公司全部下架
        List<Profession> professions=professionService.getObjectsByIds(p);
      try {
          for (Profession p1 : professions) {
              p1.setStatus(0);
              p1.setUpdateAt(System.currentTimeMillis());
          }

          company.setUpdateAt(System.currentTimeMillis());

          companyService.update(company);
          professionService.updateList(professions);
          model.addAttribute("code", 0);
      }catch (Throwable t){
          t.printStackTrace();
          log.error(t.getMessage());
          log.error("update company status error!!");
          log.error("update company id is " + id);
          log.error("update state type is " + type);
          log.error("update state is " + status);
          model.addAttribute("code", -1);
          return "/common/fail";
      }
      return "/common/success";
    }
    /*
    *@Author LeeZer
    *@Date 2017/7/19 19:30
    *@Description
    * 这里是公司详情页
    */


    @RequestMapping(value = "/a/company/detail/{id}",method = RequestMethod.GET)
    public String showCompanyInfo(ModelMap model,HttpServletRequest request,HttpServletResponse response,
                                  @PathVariable Long id) throws ServiceException, ServiceDaoException {

         try {
             //        获得company数据
             Company company=companyService.getObjectById(id);
//        获取公司标签根据公司id
             Map<String, Object> param = DynamicUtil.getCompanyLabelByCompanyId(id);

             List<Long> pidList = companyLabelService.getIdsByDynamicCondition(CompanyLabel.class, param, 0, Integer.MAX_VALUE);

             List<CompanyLabel> companyLabelList = companyLabelService.getObjectsByIds(pidList);
             log.info("comlabel is:"+companyLabelList);

             Map<String,Object> param1=DynamicUtil.getProducterByCompanyId(id);

             List<Long> pridlist=producterService.getIdsByDynamicCondition(Producter.class,param1,0,Integer.MAX_VALUE);

             List<Producter> producterList=producterService.getObjectsByIds(pridlist);
             log.info("producterList is:"+producterList);

             model.addAttribute("code",0);
             model.addAttribute("company",company);
             model.addAttribute("companyLabelList",companyLabelList);
             model.addAttribute("producterList",producterList);
         }catch (Exception e){
             e.printStackTrace();
             log.error(e.getMessage());
             log.error("get companyDetail error,id is  " + id);
             model.addAttribute("code", -1);
         }


        return  "/company/json/companyJson";





    }
    /*
    *@Author LeeZer
    *@Date 2017/7/20 13:14
    *@Description
    * 前台公司详情在招职位页
    */


    @RequestMapping(value = "/a/company/profession/{id}",method = RequestMethod.GET)
    public String getProfessionFromCompany(HttpServletResponse response,HttpServletRequest request,
                                           ModelMap modelMap,@PathVariable Long id,Integer catgory,Integer page,Integer size) throws ServiceException, ServiceDaoException {
//
//        if (null== page || page<0){
//            page=1;
//        }
//        if (null== size || size<0){
//            size=10;
//        }
       page=LeeZerUtil.getCanShu(page,1);
       size=LeeZerUtil.getCanShu(size,10);
       int start= LeeZerUtil.getNowCoulmn(page,size);
        log.info("获取的公司id是：" +id);
        Company company=companyService.getObjectById(id);
        log.info("获取的公司对象是：" +company);
//        通过公司di获取职位信息
        try {
            Map<String, Object> param = DynamicUtil.getProfessionByCIds(id,catgory);


            List<Long> idList = professionService.getIdsByDynamicCondition(Profession.class, param, start, size);
            log.info("id is" +idList);
            List<Profession> professionList = professionService.getObjectsByIds(idList);

            Map<String, Object> params = DynamicUtil.getCompanyLabelByCompanyId(id);

            List<Long> pidList = companyLabelService.getIdsByDynamicCondition(CompanyLabel.class, params, 0, Integer.MAX_VALUE);

            List<CompanyLabel> companyLabelList = companyLabelService.getObjectsByIds(pidList);
            log.info("companyLabel is:" + companyLabelList);

            Map<String, Object> param1 = DynamicUtil.getProducterByCompanyId(id);

            List<Long> pridlist = producterService.getIdsByDynamicCondition(Producter.class, param1, 0, Integer.MAX_VALUE);

            List<Producter> producterList = producterService.getObjectsByIds(pridlist);
            log.info("producterList is:" + producterList);

             modelMap.addAttribute("code",0);
             modelMap.addAttribute("total",idList.size());
             modelMap.addAttribute("size",size);
             modelMap.addAttribute("company",company);
             modelMap.addAttribute("professionList",professionList);
             modelMap.addAttribute("companyLabelList",companyLabelList);
             modelMap.addAttribute("producterList",producterList);
        }catch (Exception e){
             e.printStackTrace();
             log.info("get COmpanyInfo is erro");
             return "/common/fail";
        }


return "/company/json/companyAndPrrofession";


    }

}

