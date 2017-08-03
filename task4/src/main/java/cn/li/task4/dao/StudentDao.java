package cn.li.task4.dao;

import cn.li.task4.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lizenan on 2017/4/12.
 */
@Component
public interface StudentDao {
 public    List<Student> getAllStudents();

 public  Student findStudentById(int id);

 public  int deleteStudentByid(int id);

 public int addStudent(Student stu);

 public int updateStudent(Student stu);

 public List<Student> findAllGoodStudent();

 public Student findStudentByPhone(long phone);



}
