package com.ptteng.dao;

import java.util.List;


import com.ptteng.entity.Student;
import org.springframework.stereotype.Component;

@Component
public interface StudentDao {

	public List<Student> getAllStudents();

	public Student findStudentById(int id);

	public int deleteStudentById(int id);

	public int addStudent(Student stu);

	public int updateStudent(Student stu);
}
