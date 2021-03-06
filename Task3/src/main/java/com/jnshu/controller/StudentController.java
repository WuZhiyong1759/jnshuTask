package com.jnshu.controller;

import com.jnshu.dao.StudentDao;
import com.jnshu.model.Student;
import com.jnshu.services.StudentService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom on 2017/4/15.
 */
@Controller
public class StudentController {
    Logger log=Logger.getLogger(StudentController.class);
    @Resource
    private StudentService studentService;

    @RequestMapping("/regist")
    public String regist(Model model){
        log.info("regist方法被调用！");
        Student student=new Student();
        model.addAttribute("student",student);
        return "regist";
    }
    @RequestMapping(value="/register",method = RequestMethod.POST)
    public String register(
            @ModelAttribute Student student,
            Model model){
        log.info("register方法被调用==参数student："+student);
        long timeNow=System.currentTimeMillis();
        student.setCreate_at(timeNow);
        studentService.addStudent(student);
        return "redirect:/login";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/loginer")
    public String login(@RequestParam String name,@RequestParam String password){
            log.info("login方法被调用！name="+name+",password="+password);
            if(studentService.getByNameAndPwd(name,password)!=null){
                return "redirect:/Task3/showList";
            }else {
                return "login";
            }
    }
    @RequestMapping("/showList")
    public String showList(Model model){
        log.info("showList方法被调用");
        List<Student> studentList= new ArrayList<Student>();
        studentList=studentService.getAllStudent();
        model.addAttribute("studentList",studentList);
        return "showlist";
    }
    @RequestMapping("/Task3/delete/{id}")
    public String delete(@PathVariable("id") int id){
        log.info("delete方法被调用 id="+id);
        studentService.deleteStudent(id);
        return "redirect:/Task3/showList";
    }
    @RequestMapping(value = "/update/{id}",method = RequestMethod.GET)
    public String update(@PathVariable int id,Model model){
        log.info("update方法被调用 id="+id);
        Student student=studentService.getStudentById(id);
        model.addAttribute("student",student);
        return "update";
    }@RequestMapping(value = "/updateNow",method = RequestMethod.POST)
    public String updateNow(@ModelAttribute Student student){
        log.info("updateNow方法被调用。student："+student);
        long timeNow=System.currentTimeMillis();
        student.setUpdate_at(timeNow);
        studentService.updateStudent(student);
        return "redirect:/Task3/showList";
    }
}
