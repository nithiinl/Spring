package com.nit.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nit.model.Course;
import com.nit.model.Student;

@RestController
@RequestMapping("/students")
public class Final {
	
	private String url1="http://localhost:8020/studentss";
	private String url2="http://localhost:8020/courses";
	
	private final RestTemplate restTemplate;
	
	/*@Autowired
	private RestTemplate template;*/
	
	public Final(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
	
	
	@GetMapping("/{sid}")
	public ResponseEntity<?> getAll(@PathVariable String sid){
		
		Student  student= getStudent(sid);
		List<Course> course=getCourse(sid);
		/*	Student std=new Student();
			 std.setCoursee(course);*/
		
		student.setCoursee(course);
		
		return ResponseEntity.ok(student);
		
	}
	
	public Student getStudent(String sid) {
		return restTemplate.getForObject(url1+"/"+sid, Student.class);
	}
	
	public List<Course> getCourse(String sid) {
		return (List<Course>) restTemplate.getForObject(url2+"/"+sid, Course.class);
	}
	

}
