package com.ptteng.requestModels;

import com.ptteng.entity.Student;

import java.io.Serializable;

/**
 * Created by litao on 2017/2/23.
 */
public class StudentRequest implements Serializable{

    private static final long SerialVersionUID = 1L;

    private Header header;//请求头

    private Student student;//请求对象

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Student getStudent(){
        return student;
    }

    public void setStudent(Student student){
        this.student = student;
    }

    public StudentRequest() {
        super();
    }

    public StudentRequest(Header header, Student student) {
        super();
        this.header = header;
        this.student = student;
    }
}
