package cn.li.task4.controller;

import cn.li.task4.dao.ProfessionDao;
import cn.li.task4.dao.StudentDao;
import cn.li.task4.entity.Profession;
import cn.li.task4.entity.Student;
import cn.li.task4.util.DESUtil;
import cn.li.task4.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lizenan on 2017/4/16.
 */
@Controller
public class HomeController {

    @Autowired
    private StudentDao dao;

    @Autowired
    private ProfessionDao professionDao;

    @Autowired
    private DESUtil desUtil;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getHomeInfo(ModelMap modelMap) {
//        List<Student> list = dao.findAllGoodStudent();
//        modelMap.put("list", list);
        return "home";
    }

    @RequestMapping(value = "/regist", method = RequestMethod.GET)
    public String goRegisterJSP(ModelMap modelMap) {
        return "regist";
    }

    @RequestMapping(value = "/registAccount", method = RequestMethod.POST)
    public void register(HttpServletRequest request, HttpServletResponse response, @RequestParam("phone") String phone, @RequestParam("password") String password) {
        if (phone == null || phone.length() == 0) {
            try {
                response.sendRedirect("/regist");
            } catch (Exception e) {

            }
            return;
        }
        Student student = new Student();
        student.setPhone(Long.parseLong(phone));
        student.setPassword(MD5Util.stringToMD5(password));
        student.setStu_name("李泽南");
        dao.addStudent(student);
        try {
            response.sendRedirect("/login");
        } catch (Exception e) {

        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/loginIn", method = RequestMethod.POST)
    public String login(HttpServletRequest request, HttpServletResponse response, @RequestParam("phone") String p, @RequestParam("password") String password) {
        if (p.length() == 0) {
            try {

                response.sendRedirect("/login");
            } catch (Exception e) {
            }
            return null;
        }
        long phone = Long.parseLong(p);
        Student stu = dao.findStudentByPhone(phone);
        if (!stu.getPassword().equals(MD5Util.stringToMD5(password))) {
            return "login";
        }
        request.getSession().setAttribute("student", stu);
//    设置服务器以UTF-8编码进行输出
//     设置浏览器以UTF-8编码进行接收，解决中文乱码问题
//      将token加密存到token里面
        String token = stu.getId() + "|" + System.currentTimeMillis();
        byte[] bytes = desUtil.encrypt(token.getBytes(), "12345678");
//        Cookie new("token",new String(bytes));
        Cookie cookie = new Cookie("token", org.apache.commons.codec.binary.Base64.encodeBase64String(bytes));
//       设置Cookie的有效期
        cookie.setMaxAge(60 * 60 * 24 * 7);
//        设置cooki的有效路径
        cookie.setPath(request.getContextPath());
//    讲cookie写入到客户端浏览器
        response.addCookie(cookie);
        try {
            response.sendRedirect("/home");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @RequestMapping(value = "/u/courseList", method = RequestMethod.GET)
    public String getTextInfo(ModelMap modelMap) {

        List<Profession> list1 = professionDao.getProfessionWithDirection(1);
        List<Profession> list2 = professionDao.getProfessionWithDirection(2);
        List<Profession> list3 = professionDao.getProfessionWithDirection(3);
        List<Profession> list4 = professionDao.getProfessionWithDirection(4);
        List<Profession> list5 = professionDao.getProfessionWithDirection(5);

        List list = new ArrayList();
        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);
        list.add(list5);

        modelMap.put("list", list);

        return "courseList";
    }
}
