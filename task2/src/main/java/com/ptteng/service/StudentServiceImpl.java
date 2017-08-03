package com.ptteng.service;

import com.ptteng.dao.StudentDao;
import com.ptteng.entity.Student;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by litao on 2017/2/23.
 */

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao dao;

    @Transactional
    public List<Student> getAllStudents() throws Exception{
        return dao.getAllStudents();
    }
    @Transactional
    public Student findStudentById(int id) throws Exception{
        return dao.findStudentById(id);
    }
    @Transactional
    public int deleteStudentById(int id) throws Exception{
        return dao.deleteStudentById(id);
    }
    @Transactional
    public int addStudent(Student stu) throws Exception{
        return dao.addStudent(stu);
    }
    @Transactional
    public int updateStudent(Student stu) throws Exception{
        return dao.updateStudent(stu);
    }

    public  StudentDao getDao(){
        return dao;
    }

    public void setDao(StudentDao dao){
        this.dao = dao;
    }

}
