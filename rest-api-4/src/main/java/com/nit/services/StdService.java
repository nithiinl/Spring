package com.nit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.nit.model.Student;

@Service

public class StdService {

	@Autowired
	//@Qualifier("api1")
	private RestClient client;

	public Student getStd(String sid) {

		/*String url = "";
		
			if(true) {
			// url1 
			url = "";
		} else if(true) {
			// url2
		}
				
		
		RestClient.builder().baseUrl(url).build();*/

		return client.get().uri("/students/{sid}", sid).retrieve().body(Student.class);
	}

	public List<Student> getAll() {
		return client.get().uri("/students").retrieve().body(new ParameterizedTypeReference<List<Student>>() {
		});
	}

}
