package com.carrots.zangai.util;

import com.gemantic.common.util.MyArrayUtil;
import com.gemantic.common.util.MyListUtil;
import com.ptteng.common.dao.util.SQLUtil;
import com.qding.common.util.DataUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.HashMap;
import java.util.Map;

public class DynamicUtil {

    private static final Log log = LogFactory.getLog(DynamicUtil.class);

    public static final int THREE_DAY = 1000 * 24 * 3600 * 2;

    public static final int SEVEN_DAY = 1000 * 24 * 3600 * 6;




    /*
    *@Author LeeZer
    *@Date 2017/7/9 17:08
    *@Description
    * @Descrpito：
    * article 查询
    * @Param title
    * @Param startDate
    * @Param endDate
    * @Param type
    * @Param statu
    * @Param industry
    * @Param create_By(待定）
    */

    public static Map<String, Object> getArticleList(String title, Long startDate,
                                                     Long endDate, Integer type, Integer statu,
                                                     Integer industry) {

        Map<String, Object> params = new HashMap<String, Object>();

        if (DataUtils.isNotNullOrEmpty(title)) {
            params.put("title & like ", "'%" + title + "%'");
        }
        if (DataUtils.isNotNullOrEmpty(startDate)) {
            params.put("update_at & >=", startDate);
        }
        if (DataUtils.isNotNullOrEmpty(endDate)) {
            params.put("update_at & <= ", endDate);
        }
        if (DataUtils.isNotNullOrEmpty(type)) {
            params.put("type ", type);
        }
        if (DataUtils.isNotNullOrEmpty(statu)) {
            params.put("statu ", statu);
        }
        if (DataUtils.isNotNullOrEmpty(industry)) {
            params.put("industry ", industry);
        }

        params.put("@order", "  update_at desc ");

        params.put("@query", " id");

        params.put("@table", " article ");

        log.info("getArticleList sql is " + SQLUtil.convert2Sql(params, 0, 0));

        return params;
    }


    public static Map<String, Object> getCompanyList(String city, Integer industry,
                                                      Integer financing) {

        Map<String, Object> params = new HashMap<String, Object>();


        if (DataUtils.isNotNullOrEmpty(city)) {
            params.put("city ", "'" + city + "'");
        }
        if (DataUtils.isNotNullOrEmpty(industry)) {
            params.put("industry ", "'" + industry + "'");
        }
        if (DataUtils.isNotNullOrEmpty(financing)) {
            params.put("financing ", "'" + financing + "'");
        }


//  按照创建时间和认证状态倒序排列
        params.put("@order", " approved =1, create_at desc ");

        params.put("@query", " id");

        params.put("@table", " company ");

        log.info("getCompanyList sql is " + SQLUtil.convert2Sql(params, 0, 0));

        return params;


    }
    /*
    *@Author LeeZer
    *@Date 2017/7/15 18:45
    *@Description
    * 后台职位搜索接口
    */
        public static Map<String, Object> getCompanyList(String companyName, String city,String county
            ,Integer industry,Integer financing,Integer approved, Integer freezed ) {

        Map<String, Object> params = new HashMap<String, Object>();


        if (DataUtils.isNotNullOrEmpty(companyName)) {
            params.put("name  & like ", "'%" + companyName + "%'");
        }
        if (DataUtils.isNotNullOrEmpty(industry)) {
            params.put("industry ", "'" + industry + "'");
        }
        if (DataUtils.isNotNullOrEmpty(financing)) {
            params.put("financing ", "'" + financing + "'");
        }
        if (DataUtils.isNotNullOrEmpty(city)) {
            params.put("city ", "'" + city + "'");
        }
        if (DataUtils.isNotNullOrEmpty(county)) {
            params.put("county ", "'" + county + "'");
        }

        if (DataUtils.isNotNullOrEmpty(approved)) {
            params.put("approved ", "'" + approved + "'");
        }

        if (DataUtils.isNotNullOrEmpty(freezed)) {
            params.put("freezed ", "'" + freezed + "'");
        }




//  按照创建时间和认证状态倒序排列
        params.put("@order", "  create_at desc ");

        params.put("@query", " id");

        params.put("@table", " company ");

        log.info("getCompanyList sql is " + SQLUtil.convert2Sql(params, 0, 0));

        return params;


    }


    public static Map<String, Object> getCompanyList(String name, Integer industry, String city, String county,
                                                     Integer approved, Integer financing) {

        Map<String, Object> params = new HashMap<String, Object>();
        if (DataUtils.isNotNullOrEmpty(name)) {
            params.put("name & like ", "'%" + name + "%'");
        }
        if (DataUtils.isNotNullOrEmpty(industry)) {
            params.put("industry ", "'" + industry + "'");
        }
        if (DataUtils.isNotNullOrEmpty(city)) {
            params.put("city ", "'" + city + "'");
        }
        if (DataUtils.isNotNullOrEmpty(county)) {
            params.put("county ", "'" + county + "'");
        }
        if (DataUtils.isNotNullOrEmpty(financing)) {
            params.put("financing ", "'" + financing + "'");
        }
        if (DataUtils.isNotNullOrEmpty(approved)) {
            params.put("approved ", "'" + approved + "'");
        }
        params.put("freezed", "1");
//  按照创建时间和认证状态倒序排列
        params.put("@order", " approved =1, create_at desc ");

        params.put("@query", " id");

        params.put("@table", " company ");

        log.info("getCompanyList sql is " + SQLUtil.convert2Sql(params, 0, 0));

        return params;


    }

    /*
    *@Author LeeZer
    *@Date 2017/7/10 11:24
    *@Description  获取职位列表
    *
    */
    public static Map<String, Object> getProfessionList() {

        Map<String, Object> params = new HashMap<String, Object>();



        params.put("@order","status=1,released_at desc ");

        params.put("@query", " id");

        params.put("@table", " profession ");

        log.info("getCompanyList sql is " + SQLUtil.convert2Sql(params, 0, 0));


        return params;

    }
    public static Map<String, Object> getProfessionLists() {

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("@order", "released_at desc ");

        params.put("@query", " id");

        params.put("@table", " profession ");
        log.info("getCompanyList sql is " + SQLUtil.convert2Sql(params, 0, 0));

        return params;

    }
    public static Map<String, Object> getProfessionList(String name, String city, Integer industry, Integer workexp, Integer salary, Integer education, String compareTime, Integer recommend) {

        Map<String, Object> params = new HashMap<String, Object>();

        if (DataUtils.isNotNullOrEmpty(name)) {
            params.put("name & like ", "'%" + name + "%'");
        }

        if (DataUtils.isNotNullOrEmpty(city)) {
            params.put("city ", "'" + city + "'");
        }

        if (DataUtils.isNotNullOrEmpty(industry)) {
            params.put("industry ", "'" + industry + "'");
        }

        if (DataUtils.isNotNullOrEmpty(workexp)) {
            params.put("workexp", "'" + workexp + "'");
        }

        if (DataUtils.isNotNullOrEmpty(salary)) {
            params.put("salary ", "'" + salary + "'");
        }

        if (DataUtils.isNotNullOrEmpty(education)) {
            params.put("education", "'" + education + "'");
        }

        if (DataUtils.isNotNullOrEmpty(compareTime)) {
//        因为这里发布时间是为了比较当前时间的时间戳，所以我们需要判断一下我们发布的时间是在今天还是在什么时候然后用来比较我们的
            //获取当天零时的时间戳
       /*
        Long current = System.currentTimeMillis();// 当前时间时间戳
        Long time = current / (1000 * 3600 * 24) * (1000 * 3600 * 24) - TimeZone.getDefault().getRawOffset();// 今天零点零分零秒的时间戳
        */
//       上面的Long型加减获取有一个不足就是可能回去取到前一天的0点，所以我选择使用了Canldener
            Long now = System.currentTimeMillis();
            String timeZone = null;
            Long time = LeeZerUtil.getStartTimeOfDay(now, timeZone);
//        获取到今天的凌晨的时间后我们把我们的发布时间-今天凌晨的时间得到的时间戳
            System.out.println(time);

            switch (compareTime) {
                case "1":
                    params.put("released_at & >", time);
                    break;

                case "2":
                    params.put("released_at & >", time - THREE_DAY);
                    break;

                case "3":
                    params.put("released_at & >", time - SEVEN_DAY);

            }

        }

        if (DataUtils.isNotNullOrEmpty(recommend)) {
            params.put("recommend", "'" + recommend + "'");
        }

        params.put("@order", "status=1,released_at desc ");

        params.put("@query", " id");

        params.put("@table", " profession ");

        log.info("getCompanyList sql is " + SQLUtil.convert2Sql(params, 0, 0));


        return params;

    }

    /*
    *@Author LeeZer
    *@Date 2017/7/10 14:58
    *@Description 获取articleBanner
    */
    public static Map<String, Object> getArticleBanner(Integer type, Integer industry) {
        Map<String, Object> params = new HashMap<String, Object>();

        if (DataUtils.isNotNullOrEmpty(type)) {
            params.put("type", "'" + type + "'");
        }
        if (DataUtils.isNotNullOrEmpty(industry)) {
            params.put("industry", "'" + industry + "'");
        }

        params.put("statu", "1");

        params.put("@query", " id");

        params.put("@table", " article ");

        log.info("getArticleyBanner sql is " + SQLUtil.convert2Sql(params, 0, 0));


        return params;

    }
    /*
    *@Author LeeZer
    *@Date 2017/7/11 15:50
    *@Description 获取公司标签内容
    */
    public static Map<String,Object> getCompanyLableList() {
        Map<String, Object> params = new HashMap<String, Object>();


        params.put("@query", " id");

        params.put("@order", "create_at desc ");

        params.put("@table", " companyLabel ");

        log.info("getArticleyBanner sql is " + SQLUtil.convert2Sql(params, 0, 0));

        return params;

    }

    public static void main(String[] args) {


    }


    /*
    *@Author LeeZer
    *@Date 2017/7/15 19:32
    *@Description
    * 查询公司产品
    */
    public static Map<String,Object> getProducter(String producterName) {

        Map<String,Object> param= new HashMap<String,Object>();
        if (DataUtils.isNotNullOrEmpty(producterName)) {
            param.put("name & like", "'%" + producterName + "%'");
        }

        param.put("@query","id");

        param.put("@order","create_at desc");


        param.put("@table","producter");

        return param;
    }

    /*
    *@Author LeeZer
    *@Date 2017/7/18 15:38
    *@Description
    * 这个是用来获取公司标签通过公司cid
    */
    public static Map<String,Object> getCompanyLabelByCompanyId(Long companyId) {

  Map<String,Object> param=new HashMap<String,Object>();
        if (DataUtils.isNotNullOrEmpty(companyId)) {
            param.put("c_id",  "'" + companyId + "'"  );
        }
        param.put("@query","id");

        param.put("@order","create_at desc");


        param.put("@table","companyLabel");

        return param;
    }

    public static Map<String,Object> getProducterByCompanyId(Long companyId) {
        Map<String,Object> param=new HashMap<String, Object>();
        if (DataUtils.isNotNullOrEmpty(companyId)) {
            param.put("c_id", companyId );
        }
        param.put("@query","id");

        param.put("@order","create_at desc");

        param.put("@table","producter");

        return param;
    }

    public static Map<String,Object> getProfessionByCId(Long companyId) {
        Map<String,Object> param=new HashMap<String, Object>();
        if (DataUtils.isNotNullOrEmpty(companyId)) {
            param.put("c_id",  "'" + companyId + "'"  );
        }
        param.put("@query","id");

        param.put("@order","create_at desc");

        param.put("@table","profession");

        return param;
    }

    public static Map<String,Object> getProfessionByCIds(Long companyId,Integer catgory) {
        Map<String,Object> param=new HashMap<String,Object>();
        if (DataUtils.isNotNullOrEmpty(companyId)) {
            param.put("c_id", "'" + companyId + "'" );
        }
        if (DataUtils.isNotNullOrEmpty(catgory)) {
            param.put("catgory", "'" + catgory + "'" );
        }
        param.put("status","1");

        param.put("@query","id");

        param.put("@order","create_at desc");

        param.put("@table","profession");
        log.info("get profession sql is " + SQLUtil.convert2Sql(param, 0, 0));
        return param;
    }

    public static Map<String,Object> getProfessionLabelByCId(Long professionId) {
        Map<String,Object> param=new HashMap<String,Object>();
        if (DataUtils.isNotNullOrEmpty(professionId)) {
            param.put("p_id", "'" + professionId + "'" );
        }
        param.put("@query","id");

        param.put("@order","create_at desc");

        param.put("@table","professionLabel");
        log.info("get professionLabel sql is " + SQLUtil.convert2Sql(param, 0, 0));
        return param;
    }
}
