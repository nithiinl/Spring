package com.nit.controller;

import com.nit.model.StudentModal;

public class ResponseData {
	
	private StudentModal student;
	private CourseModel course;
	
	
	public StudentModal getStudent() {
		return student;
	}
	public void setStudent(StudentModal student) {
		this.student = student;
	}
	public CourseModel getCourse() {
		return course;
	}
	public void setCourse(CourseModel course) {
		this.course = course;
	}
	
	

}
