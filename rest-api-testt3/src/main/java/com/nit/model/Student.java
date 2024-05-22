package com.nit.model;

import java.util.List;

import org.springframework.http.ResponseEntity;


public class Student {

	private String sid;//primary key
	private String sname;
	private String phno;
	private Course coursee;
	
	//private List<Course> coursee;
	
	
	public String getSid() {
		return sid;
	}


	public void setSid(String sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getPhno() {
		return phno;
	}


	public void setPhno(String phno) {
		this.phno = phno;
	}


	public List<Course> getCoursee() {
		return coursee;
	}
	
	
	public void setCoursee(List<Course> coursee) {
		this.coursee = coursee;
	}

	
	/*public Course getCoursee() {
		return coursee;
	}
	
	
	public void setCoursee(Course coursee) {
		this.coursee = coursee;
	}*/


	



	
	
}
