package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Student;
import com.nit.services.StdService;

/*@RestController
@RequestMapping("/students")*/
public class StdController {
	
	/*@Autowired
	private StdService std;
	@GetMapping("/{sid}")
	public Student getStd(@PathVariable String sid) {
		return std.getStd(sid);
	}*/

	/*@Autowired
	private StdService stdSevice;
	
	@GetMapping("/{sid}")
	public Student getSingle(@PathVariable String sid) {
		return stdSevice.getStd(sid);
	
	}
	
	
	@GetMapping
	public List<Student> getAlls(){
		return stdSevice.getAll();
	}*/

}
