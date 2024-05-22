package com.nit.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.nit.model.Student;

@RestController
@RequestMapping("/students")
public class StudentController {
	

	private Map<String, Student> sdetails = new HashMap<>();

	@GetMapping
	public Collection<Student> getCourses() {
		return sdetails.values();
	}

	
	@GetMapping("/{cid}" )//Gets the student details
	public Student getStdeunt(@PathVariable String sid) {
		
		if(sdetails.containsKey(sid)) {
			return sdetails.get(sid);
			
		}
			//return stddetails.values();
		return null;
	}

	@PostMapping
	public String postCourse(@RequestBody Student stddetails) {
		Student cmd=new Student();
		cmd.setSid(stddetails.getCid());
		cmd.setSname(stddetails.getSname());
		cmd.setPhno(stddetails.getPhno());
		cmd.setCourse(stddetails.getCourse());
		cmd.setCid(stddetails.getCid());
		sdetails.put(stddetails.getCid(), cmd);
		
		
		return "Course posted";
	}

	@PutMapping
	public String editCourse() {
		return "Edit course successfully";
	}

	@DeleteMapping
	public String deleteCourse() {
		return "Course deleted";
	}


}
