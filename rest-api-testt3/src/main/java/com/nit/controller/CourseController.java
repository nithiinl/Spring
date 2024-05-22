package com.nit.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Combined;
import com.nit.model.Course;
import com.nit.model.Student;
import com.nit.services.CourseService;

@RestController
@RequestMapping("/coursess")
public class CourseController {
	
	@Autowired
	private CourseService course;
	
	//List<String> ls=new ArrayList<String>();
	
		@GetMapping("/{cid}")
		public Collection<Object> getAll(@PathVariable String cid) {
			List<Student> c=course.getAll(cid);
			List<Course> s=course.getStd(cid);
			Map<String, Object> map=new HashMap<>();
			
					map.put("string", s);
			map.put("nihtin", c);
				
			
			return map.values();
		}
			
			
		
		

	
		/*
		@GetMapping("/{cid}")
		public List<Course> getAlls(@PathVariable String cid){
			return course.getStd(cid);
		}*/

}
