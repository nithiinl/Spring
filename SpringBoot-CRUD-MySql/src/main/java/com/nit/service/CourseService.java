package com.nit.service;

import java.util.List;

import com.nit.model.Course;

public interface CourseService {
	
	public String upsert(Course course);
	
	public Course getById(Integer Id);
	
	public List<Course> getAllCourses();
	
	public String deleteById(Integer cid);

}
