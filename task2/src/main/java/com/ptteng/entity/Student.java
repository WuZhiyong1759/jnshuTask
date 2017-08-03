package com.ptteng.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private int id;
	private String stu_name;
	private long create_at;
	private long update_at;
	private String sign;
	private String stu_school;
	private String stu_introducer;
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getStu_name(){
		return stu_name;
	}
	public void setStu_name(String stu_name){
		this.stu_name = stu_name;
	}
	public long getCreate_at(){
		return create_at;
	}
	public void setCreate_at(long create_at) {
		this.create_at = create_at;
	}
	public long getUpdate_at(){
		return update_at;
	}
	public void setUpdate_at(long update_at) {
		this.update_at = update_at;
	}
	public String getSign(){
		return sign;
	}
	public void setSign(String sign){
		this.sign = sign;
	}
	public String getStu_school(){
		return stu_school;
	}
	public void setStu_school(String stu_school){
		this.stu_school = stu_school;
	}
	public String getStu_introducer(){
		return stu_introducer;
	}
	public void setStu_introducer(String stu_introducer){
		this.stu_introducer = stu_introducer;
	}

	@Override
	public String toString(){
		return "123";
	}

	public Student(){
		super();
	}

	public Student(int id,String stu_name,long create_at,long update_at,String sign,String stu_school,String stu_introducer){
		super();
		this.id = id;
		this.stu_name = stu_name;
		this.create_at = create_at;
		this.update_at = update_at;
		this.sign = sign;
		this.stu_school = stu_school;
		this.stu_introducer = stu_introducer;
	}
	
}
