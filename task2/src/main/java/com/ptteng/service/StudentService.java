package com.ptteng.service;

import com.ptteng.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by litao on 2017/2/23.
 */

@Service
public interface StudentService {

    public List<Student> getAllStudents() throws Exception;

    public Student findStudentById(int id) throws Exception;

    public int deleteStudentById(int id) throws Exception;

    public int addStudent(Student stu) throws Exception;

    public int updateStudent(Student stu) throws Exception;
}
