package com.ptteng.controller;

import com.ptteng.dao.StudentDao;
import com.ptteng.entity.Student;
import com.ptteng.requestModels.StudentRequest;
import com.ptteng.responseModels.ResultData;
import com.ptteng.service.StudentService;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by litao on 2017/2/23.
 */

@Controller
@RequestMapping("/info")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentDao dao;





    @RequestMapping(value = "/nowdate", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getDate(HttpServletResponse response) throws IOException {
        SimpleDateFormat tempDate = new SimpleDateFormat("yyyy-MM-dd");
        String datetime = tempDate.format(new java.util.Date());
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("data", datetime);
        return map;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String getStudents(ModelMap modelMap){
        // 查询user表中所有记录
//        try {
//            List<Student> list = studentService.getAllStudents();
//            // 将所有记录传递给要返回的jsp页面，放在userList当中
//            modelMap.addAttribute("list", list);
//        }catch (Exception e){
//
//        }
        System.out.print("************************dao = "+dao);

        List<Student> list = dao.getAllStudents();
        modelMap.addAttribute("list", list);

        // 返回pages目录下的admin/users.jsp页面
        return "list";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable("id") int userId){

        try {
            int rs = studentService.deleteStudentById(userId);
        }catch (Exception e){
            e.printStackTrace();
        }

        return "redirect:/info/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addStudent(){
        //返回add.jsp页面
        return "add";
    }

    @RequestMapping(value = "/addStu",method = RequestMethod.POST)
    public String addStudentPost(@ModelAttribute("student") Student student){
        //注意此处,post请求传递过来的是一个Student对象,里面包含了该用户的信息
        //通过@ModelAttribute()注解可以获取传递过来的student,并创建这个对象
        //数据库添加一个学员,该步暂时不会刷新缓存
        Date date = new Date();
        student.setCreate_at(date.getTime());

        System.out.print("<---------------------" + student.getId()+student.getStu_name());

        if (student.getStu_name().length() == 0){
            return "redirect:/info/list";
        }
        try{
            studentService.addStudent(student);

        }catch (Exception e){
            e.printStackTrace();
        }

        return "redirect:/info/list";
    }



    @RequestMapping(value = "/allStudents", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getAllStudents(HttpServletResponse response) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("springmvc-conf.xml");
        StudentDao dao = (StudentDao)context.getBean("studentDao");
        List<Student> list = dao.getAllStudents();
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("data",list);
        return map;
    }

    @RequestMapping(value = "/stuInfo", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>getStudentWithId(@RequestParam(value = "id") int id){
        Map m = new HashMap();
//        Student stu = null;
        try {
            Student stu = studentService.findStudentById(id);
            m.put("data",stu);
        }catch (Exception e){
            e.printStackTrace();
        }
        return m;
    }

}
