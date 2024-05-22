package com.nit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.nit.model.Course;

@Service
public class CourseService {
	
	
	/*@Autowired
	private RestClient client;
	public Course getCourse(String cid) {
		
		return client.get()
					.uri("/course/{cid}", cid)
					.retrieve()
					.body(Course.class);
	}
					
	public List<Course>  getAll(){
		return client.get()
				.uri("/course")
				.retrieve()
				.body(new ParameterizedTypeReference<List<Course>>() {
				});
	}*/
	
	

}
