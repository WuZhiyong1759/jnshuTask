package com.ptteng.controller;


import com.ptteng.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by litao on 2017/2/24.
 */

@org.springframework.stereotype.Controller
public class StudentDeleteController implements Controller {

    @Autowired
    private StudentService studentService;

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception{
        int id = Integer.parseInt(request.getParameter("id"));
//        int rs = studentService.deleteStudentById(id);
        response.sendRedirect("http://www.baidu.com");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("update");
        return mv;
    }
}