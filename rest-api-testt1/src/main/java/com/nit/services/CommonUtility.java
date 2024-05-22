package com.nit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import com.nit.model.Course;
import com.nit.model.Student;

@RestController
@RequestMapping("/redirect")
public class CommonUtility {

	@Autowired
	private Environment env;

	/*public RestClient restClient() {
	
		switch (url1) {
		case "courses":
			return RestClient.builder().baseUrl(url1).build();
		case "students":
			return RestClient.builder().baseUrl(url2).build();
	
		}
		return null;
	
	}*/
	/*	.build();return RestClient.builder()
							.baseUrl(env1.getProperty("students"))
				
	}*/
	
	//String url1 = env.getProperty("courses");

	@GetMapping("/{key}")
	public Object getStudents(@PathVariable String key) {

		switch (key) {
		case "students":
			String url = env.getProperty("students");
			RestClient client = this.getBaseClient(url);
			return client.get().uri("/students").retrieve().body(new ParameterizedTypeReference<List<Student>>() {
			});
		case "courses":
			String url1 = env.getProperty("courses");
			RestClient client1 = this.getBaseClient(url1);
			return client1.get().uri("/course").retrieve().body(new ParameterizedTypeReference<List<Course>>() {
			});
		}
		return key;
	}

	/*@Autowired
	@Qualifier("api")
	private RestClient client;
	
	@GetMapping("/students/{id}")
		public Course getCourse(String cid) {
		return client.get()
					.uri("/course/{cid}", cid)
					.retrieve()
					.body(Course.class);
	}*/


	private RestClient getBaseClient(String url) {
		return RestClient.builder().baseUrl(url).build();
	}
	/*	
		@GetMapping("/courses")
		public List<Course> getCourses(){
			RestClient client1 = this.getBaseClient(url1);
			return client1.get().uri("/course").retrieve().body(new ParameterizedTypeReference<List<Course>>() {
			});
		}*/

}
