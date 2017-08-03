package com.carrots.zangai.util;

import org.apache.http.util.TextUtils;
import org.junit.Test;
import org.python.antlr.op.In;
import org.python.core.util.StringUtil;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * Created by lzn312 on 2017/7/11.
 */
public class LeeZerUtil {



    public static boolean isNotNull(Integer i) {
        if (i ==null) {

            return false;
        }
        return  true;
    }

    public static  int getNowCoulmn(Integer b,Integer c){
     int i=(b.intValue()-1)*(c.intValue());
      if (i<0){
          i=0;
      }

       return i;
    }
    public static Integer getCanShu(Integer i,Integer b){


        if (i ==null || i <=0){
            i=new Integer(b);
            return i;
        }
        return i;
    }


    public static Long getStartTimeOfDay(Long now, String timeZone) {
        String tz = TextUtils.isEmpty(timeZone) ? "GMT+8" : timeZone;
        TimeZone curTimeZone = TimeZone.getTimeZone(tz);
        Calendar calendar = Calendar.getInstance(curTimeZone);
        calendar.setTimeInMillis(now);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTimeInMillis();
    }
}
