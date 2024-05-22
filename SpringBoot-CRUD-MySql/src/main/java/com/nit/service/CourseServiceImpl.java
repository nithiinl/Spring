package com.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.model.Course;
import com.nit.repo.CourseRepository;


@Service
public class CourseServiceImpl implements CourseService {
	
	
	@Autowired
	private CourseRepository courseRepo;

	@Override
	public String upsert(Course course) {
		courseRepo.save(course);    //insert or update both operations
		return "Success";
	}

	@Override
	public Course getById(Integer Id) {
		Optional<Course> findById=courseRepo.findById(Id);
		
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Course> getAllCourses() {
		
		return courseRepo.findAll();
	}

	@Override
	public String deleteById(Integer cid) {
		if(courseRepo.existsById(cid)) {
			courseRepo.deleteById(cid);
			return "Delete success";
			
		}else {
			return "No record found";
		}
		
	
		
	}

}
