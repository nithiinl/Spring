package com.nit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.nit.model.Course;

@Service

public class StdService {
	
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
