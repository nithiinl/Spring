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

import com.nit.model.StudentModal;

@RestController //making class as REST API through annotation
 @RequestMapping("/students")
public class StudentController {
	
	//@Autowired
	//private WebClient.Builder webClient;
	
	//StudentModal details=new StudentModal();
	
	
	private Map<String, StudentModal> stddetails=new HashMap<>();//for storing the properties data in HashMap

	
	@GetMapping("/{sid}" )//Gets the student details
	public StudentModal getStudents(@PathVariable String sid) {
		/*ResponseData response=new ResponseData();
		response.setStudent(details);
		String id=details.getCid();*/
		
		
		
		//before Rest template code this is there
		if(stddetails.containsKey(sid)) {
			return stddetails.get(sid);
			
		}
			//return stddetails.values();
		return null;
	}

	@GetMapping
	public Collection<StudentModal>  getStd() {
		return	stddetails.values();
	}
	
	
	
	
	/*@RequestMapping(value = "/students", method = RequestMethod.GET)
	public StudentModal getStudents() {
		return (StudentModal) stddetails.values();
	}*/
	
	@PostMapping
	public String postStudents( @RequestBody StudentModal studentdetails) { //that annotation will get the details enterd by user in reuquest body, all details entered by user will store in "studentdetails"
		; //creating an object ref for the class StudentModal and accessing the getters and setters method
		//ResponseData response = new ResponseData();
		StudentModal details=new StudentModal();
		details.setSid(studentdetails.getSid());
		details.setSname(studentdetails.getSname());
		details.setPhno(studentdetails.getPhno());
		details.setCourse(studentdetails.getCourse());
		details.setCid(studentdetails.getCid());
		
		/*	response.setStudent(details);
			
			
			String id=details.getCid();
			RestTemplate rt = new RestTemplate();
			String endpoint="localhost:8090/courses/{id}";
			ResponseEntity<CourseModel> data=rt.getForEntity(endpoint, CourseModel.class, cid);
			if(data.getStatusCodeValue()==200) {
				CourseModel model=data.getBody();
				response.setCourse(model);
				
			}*/
			
			stddetails.put(studentdetails.getSid(), details);
		return "User addedd";
	}
	
	@PutMapping(path = "/{sid}")
	public String editStudents(@PathVariable String sid, @RequestBody StudentModal studentdetails) { //getting the value from t
		if(stddetails.containsKey(sid)) {
			StudentModal details=new StudentModal(); //creating an object ref for the class StudentModal and accessing the getters and setters method
			details.setSid(studentdetails.getSid());
			details.setSname(studentdetails.getSname());
			details.setPhno(studentdetails.getPhno());
			details.setCourse(studentdetails.getCourse());
			details.setCid(studentdetails.getCid());
			stddetails.put(sid, details);
			return "User Id edited successfully";
		}
		else {
			return "User Id not found";
		}
	}
	
	@DeleteMapping(path = "/{sid}")
	public String deleteStudents(@PathVariable String sid) { //@PathVariable is used to get the values entered by user from the URL like user ID or student ID
		if(stddetails.containsKey(sid)) {
			stddetails.remove(sid);
			return "User deleted successfully";
		}
		else {
			return "User Id not found";
		}
	
	}
	
	

}
