package com.nit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import com.nit.model.Student;


@RestController
@RequestMapping("/redirect")
public class CommonUtility {
	
	@Autowired
	private RestClient client;
	
	@GetMapping("/{key}")
	public Object getStudents(@PathVariable String key) {
	
		switch(key) {
		case "students":
			return client.get()
					.uri("/students")
					.retrieve()
					.body(new ParameterizedTypeReference <List<Student>>() {
					});
		case "courses":
			return client.get()
					.uri("/students")
					.retrieve()
					.body(new ParameterizedTypeReference<List<Student>>() {
			});
		}
		return key;
		}
	}


