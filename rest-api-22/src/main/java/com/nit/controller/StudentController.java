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

import com.nit.model.StudentModel;


@RestController
@RequestMapping("/students")

public class StudentController {

	private Map<String, StudentModel> cdetails = new HashMap<>();

	@GetMapping
	public Collection<StudentModel> getCourses() {
		return cdetails.values();
	}

	
	@GetMapping("/{cid}" )//Gets the student details
	public StudentModel getCourse(@PathVariable String cid) {
		
		if(cdetails.containsKey(cid)) {
			return cdetails.get(cid);
			
		}
			//return stddetails.values();
		return null;
	}

	@PostMapping
	public String postCourse(@RequestBody StudentModel stddetails) {
		StudentModel cmd=new StudentModel();
		cmd.setSid(stddetails.getSid());
		cmd.setSname(stddetails.getSname());
		cmd.setPhno(stddetails.getPhno());
		cmd.setCourse(stddetails.getCourse());
		cmd.setCid(stddetails.getCid());
		cdetails.put(stddetails.getCid(), cmd);
		
		
		return "Cuourse posted";
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