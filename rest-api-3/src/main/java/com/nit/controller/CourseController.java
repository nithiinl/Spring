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

import com.nit.model.CourseModel;


@RestController
@RequestMapping("/course")

public class CourseController {

	private Map<String, CourseModel> cdetails = new HashMap<>();

	@GetMapping
	public Collection<CourseModel> getCourses() {
		return cdetails.values();
	}

	
	@GetMapping("/{cid}" )//Gets the student details
	public CourseModel getCourse(@PathVariable String cid) {
		
		if(cdetails.containsKey(cid)) {
			return cdetails.get(cid);
			
		}
			//return stddetails.values();
		return null;
	}

	@PostMapping
	public String postCourse(@RequestBody CourseModel coursedetails) {
		CourseModel cmd=new CourseModel();
		cmd.setCid(coursedetails.getCid());
		cmd.setCname(coursedetails.getCname());
		cmd.setCtype(coursedetails.getCtype());
		cmd.setCduration(coursedetails.getCduration());
		cdetails.put(coursedetails.getCid(), cmd);
		
		
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