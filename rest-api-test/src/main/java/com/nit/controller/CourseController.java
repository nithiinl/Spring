package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Course;
import com.nit.services.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {
	
	@Autowired

	private CourseService cService;
	
	@GetMapping
	public List<Course> getAlls(){
		return cService.getAll();
	}

}
