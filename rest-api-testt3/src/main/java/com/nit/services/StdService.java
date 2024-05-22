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
@RequestMapping("/students")

public class StdService {
	/*
	@Autowired
	private RestClient client;*/
	
	
	/*@GetMapping
	public List<Student> getAll(){
		return client.get().uri("/students").retrieve().body(new ParameterizedTypeReference <List<Student>>() {
		});
	}
	
	
	@GetMapping("/{sid}")
	public Student getbyid(@PathVariable String sid){
		return client.get()
					.uri("/students/{sid}", sid)
					.retrieve()
					.body(Student.class);
	}*/
/*	public List<Student> getStd() {
		return (List<Student>) restTemplate.getForObject("http://localhost:8080/students", Student.class);
	}*/
	
	/*@Autowired
	private Environment env2;
	
	String url=env2.getProperty("courses");
	
	private RestClient client1() {
		return RestClient.builder().baseUrl(url).build();
	}
	
	
	public Course getbyid(String cid){
			return RestClient.get()
						.uri("/course/{cid}", cid)
						.retrieve()
						.body(Course.class);
	}
	*/
	
	/*@Autowired
	@Qualifier("api")
	private RestClient client;
	
	
	public List<Student> getAll(){
		return client.get().uri("/students").retrieve().body(new ParameterizedTypeReference <List<Student>>() {
		});
		
	}*/

	/*@Autowired
	//@Qualifier("api1")
	private RestClient client;
	
	public Student getStd(String sid) {
	
		String url = "";
		
			if(true) {
			// url1 
			url = "";
		} else if(true) {
			// url2
		}
				
		
		RestClient.builder().baseUrl(url).build();
	
		return client.get().uri("/students/{sid}", sid).retrieve().body(Student.class);
	}
	
	public List<Student> getAll() {
		return client.get().uri("/students").retrieve().body(new ParameterizedTypeReference<List<Student>>() {
		});
	}*/


}
