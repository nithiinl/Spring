package com.nit.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nit.model.Combined;
import com.nit.model.Course;
import com.nit.model.Student;	

@RestController
@RequestMapping("/cor")
//@Service
public class CourseService {
		
	/*//@Autowired
	private RestClient client1;
	
	//@Autowired
	private RestClient client2;
	
	public CourseService (RestClient.Builder restClient) {
		this.client1=restClient.baseUrl("http://localhost:8080").build();
		this.client2=restClient.baseUrl("http://localhost:8090").build();
	}
	
	
	public List<Student>  getAll(String cid){
		return client2.get()
				.uri("/students/{cid}")
				.retrieve()
				.body(new ParameterizedTypeReference<List<Student>>() {
				});
	}
	
	public List<Course> getStd(String cid){
		return client1.get().uri("/course/{cid}").retrieve().body(new ParameterizedTypeReference<List<Course>>() {
		});
	}
	
	
	@GetMapping("/{cid}")
	public ResponseEntity<?> getAllData(@PathVariable String cid){
		List<Student> std=getAll(cid);
		Map<String,Object> m1=new HashMap<>();
		m1.put("students", std);
		return ResponseEntity.ok(m1);
		
	}*/
	
	@Autowired
	private RestTemplate rest;
	
	
	private String url1="http://localhost:8080/students";
	private String url2="http://localhost:8090/course";
	
	@GetMapping("/{cid}")
	public ResponseEntity<?> getCombinedData(@PathVariable String cid){
		
		//List<Student> std=getStudents(cid);
		List<Course> cors=getCourses(cid);
		
		
		/*	if(!std.isEmpty()) {
				// pass student id to get the respective courses
				List<Course> cors=getCourses();
				std.get(0).setCoursee(cors);
			}*/
	
		
		//Combined std1=new Combined();
		//std1.setCid(std.getCid());
		
		Map<String,Object> combined=new HashMap<>();
		//combined.put("student", std);
		combined.put("course", cors);
		return ResponseEntity.ok(combined);
		
	}
	
	private List<Student> getStudents(String cid) {
	//	Student[] usersArray  = null;
			ResponseEntity<Student[]> responseEntity = rest.getForEntity(url1+"/"+cid,Student[].class);
		    Student[] usersArray = responseEntity.getBody();
		   return Arrays.asList(usersArray);
			/* if(usersArray != null ) {
			 	return Arrays.asList(usersArray);
			 } else {
			 	return new ArrayList<Student>();
			 }*/
	}
	
	private List<Course> getCourses(String cid) {
	    ResponseEntity<Course[]> responseEntity = rest.getForEntity(url2+"/"+cid, Course[].class);
	    Course[] tasksArray = responseEntity.getBody();
	    return Arrays.asList(tasksArray);
	}
	
	
	
	
	
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
