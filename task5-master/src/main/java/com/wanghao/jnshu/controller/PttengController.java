package com.wanghao.jnshu.controller;

import com.wanghao.jnshu.Util.DesUtil;
import com.wanghao.jnshu.Util.MD5Util;
import com.wanghao.jnshu.Util.TypeUtil;
import com.wanghao.jnshu.model.*;
import com.wanghao.jnshu.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created by WangHao on 2017/1/24.
 */
@Controller
@RequestMapping//url:模块/资源/{}/细分

public class PttengController {
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private PhotoServiceImpl photoService;
    @Autowired
    private CooperateServiceImpl cooperateService;
    @Autowired
    private LinksServiceImpl linksService;
    @Autowired
    StatisticsServiceImpl statisticsService;
    @Autowired
    StudentServiceImpl studentService;
    @Autowired
    OccupationServiceImpl occupationService;
    //主页
    @RequestMapping(value = "/index.html",method = RequestMethod.GET)
    public String index(Model model,HttpServletRequest request)
    {
        List<Photos> photosList=photoService.select();
        List<Cooperate> cooperateList=cooperateService.select();
        List<Links> linksList=linksService.select();
        Statistics statistics=statisticsService.select();
        List<Student> studentList=studentService.select();
        String contextpath;
        contextpath = request.getScheme() +"://" + request.getServerName()  + ":" +request.getServerPort() +request.getContextPath();
        model.addAttribute("contextpath",contextpath);
        //list.jsp+mode=ModelAndView
        model.addAttribute("photosList",photosList);
        model.addAttribute("cooperateList",cooperateList);
        model.addAttribute("linksList",linksList);
        model.addAttribute("statistics",statistics);
        model.addAttribute("studentList",studentList);

        return "index.首页.ptteng";
    }
    //职业页面
    @RequestMapping(value = "/u/occupation.html",method = RequestMethod.GET)
    public String occupation(Model model,HttpServletRequest request)
    {
        List<Occupation> occupationList=occupationService.select();
        model.addAttribute("occupationList",occupationList);
        String contextpath;
        contextpath = request.getScheme() +"://" + request.getServerName()  + ":" +request.getServerPort() +request.getContextPath();
        model.addAttribute("contextpath",contextpath);
        return "occupation.职业.ptteng";
    }
    //登录页面
    @RequestMapping(value = "/login.html",method = RequestMethod.GET)
    public String login(){
        return "login";
    }
    //登录失败页面
    @RequestMapping(value = "/no.html",method = RequestMethod.GET)
    public String no(){
        return "no";
    }
    //登录处理
    @RequestMapping(value = "/login.html",method = RequestMethod.POST)
    public void loginaction(@RequestParam("username") String username, @RequestParam("password") String password,
                               HttpServletResponse httpServletResponse) {
        String md5= MD5Util.stringToMD5(password);
        if(userService.verification(username,md5)){
            //待加密内容
            long id=userService.selectToUsername(username).getId();
            long creatDate=new Date().getTime();
            String str = id+"="+creatDate;
            //加密操作
            byte[] result = DesUtil.desCrypto(str,"12345678");
            //把加密的字节转换为16进制
            String resules= TypeUtil.bytesToHexString(result);
            Cookie cookie = new Cookie("token",resules);
            cookie.setMaxAge(60*60*24*7);//保留7天
            httpServletResponse.addCookie(cookie);
            try {
                httpServletResponse.sendRedirect("index.html");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            try {
                httpServletResponse.sendRedirect("no.html");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //注册页面
    @RequestMapping(value = "/register.html",method = RequestMethod.POST)
    public String register(@RequestParam("user") String user,@RequestParam("passwd") String passwd){
            String md5= MD5Util.stringToMD5(passwd);
            userService.insert(user,md5);
            return "ok";

    }
}
