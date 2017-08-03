package cn.li.task4.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * Created by lizenan on 2017/4/24.
 * 编写一个字符请求在HttprServletrequest请求执行前进行
 */
public class MyCharacterEncodingRequest extends HttpServletRequestWrapper {
private HttpServletRequest request;
public MyCharacterEncodingRequest(HttpServletRequest request){
    super(request);
    this.request=request;
}
/**
 * 重写get方法
 *
 *
 *
 * */
 public String getParameter(String name){
     try{
         String value=this.request.getParameter(name);
         if(value==null){
             return null;
         }
//         如果不是get方式提交的数据，直接返回获取到的值
         if(this.request.getMethod().equalsIgnoreCase("get")){
             return value;
         }else {
//             如果是get方式提交数据的，就对获取的值进行转码操作
             value =new String(value.getBytes("ISO8859-1"),this.request.getCharacterEncoding());
             //                value = new String(value.getBytes("UTF-8"),this.request.getCharacterEncoding());
             return value;
         }
     }catch (Exception e){
         throw new RuntimeException(e);
     }
 }

}
