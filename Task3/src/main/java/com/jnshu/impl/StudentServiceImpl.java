package com.jnshu.impl;

import com.jnshu.dao.StudentDao;
import com.jnshu.model.Student;
import com.jnshu.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Tom on 2017/4/14.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class StudentServiceImpl implements StudentService{
    @Resource
    private StudentDao studentDao;

    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
    }

    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    public List<Student> getAllStudent() {
        return studentDao.getAllStudent();
    }

    public List<Student> getByNameAndPwd(String name, String pwd) {
        return studentDao.getByNameAndPwd(name,pwd);
    }
}
