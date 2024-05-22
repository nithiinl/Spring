package com.nit.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Student;


@RestController
@RequestMapping("/studentss")
public class Test {
	
	private Map<String,Student> sdetails=new HashMap<>();
	
	@PostMapping
	public String  student(@RequestBody Student c) {
		Student std=new Student();
		std.setSid(c.getSid());
		std.setSname(c.getSname());
		std.setPhno(c.getPhno());
		std.setCoursee(c.getCoursee());
	
		sdetails.put(c.getSid(), std);
	return "posted";
	
	
	}
	
	@GetMapping
	public Collection<Student> std() {
		return sdetails.values();

}
	
@GetMapping("/{cid}" )//Gets the student details
public Student getStudent(@PathVariable String cid) {
	
	if(sdetails.containsKey(cid)) {
		return sdetails.get(cid);
		
	}
		//return stddetails.values();
	return null;
}
}
