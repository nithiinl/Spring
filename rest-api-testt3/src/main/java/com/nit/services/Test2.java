package com.nit.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Course;

@RestController
@RequestMapping("/courses")
public class Test2 {
	

	private Map<String,Course> cdetails=new HashMap<>();
	
	//private List<Course> list=new ArrayList<>();
	
	@PostMapping
	public String  student(@RequestBody Course c) {
		Course ctd=new Course();
		ctd.setCid(c.getCid());
		ctd.setCname(c.getCname());
		ctd.setCtype(c.getCtype());
		ctd.setCduration(c.getCduration());
		ctd.setSid(c.getSid());
		
		//list.add(ctd);
		cdetails.put(c.getSid(), ctd);
	return "posted";
		
	
	
	}
	
	@GetMapping
	public Collection<Course> ctd() {
		
		/*Course cc=null;
		for(Course c:list) {
			cc=c;
		}*/
		//return list;
		return cdetails.values();

}
	
@GetMapping("/{cid}" )//Gets the student details
public  Course getCourse(@PathVariable String cid) {
	
	/*return list.stream()
	     .filter(user -> sid.contains(user.getSid()))
	     .collect(Collectors.toList());
	*/
	/* O.ptional<Course> userOptional = list.stream().filter(user -> user.getSid().equals(cid)).findFirst();
	 return userOptional.orElse(null);*/
	

	if(cdetails.containsKey(cid)) {
		return cdetails.get(cid);
		
	}
	return null;
	
	/*
		if(list.contains(cid)) {
			return list.get(cid);
			
		}
		//return stddetails.values();
	*/
}

}
