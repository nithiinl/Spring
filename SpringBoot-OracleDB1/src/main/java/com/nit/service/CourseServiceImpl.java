package com.nit.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.binding.Course;
import com.nit.repository.CourseRepository;


@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepo;
	
	@Override
	public String upsert(Course course) {
		
		courseRepo.save(course);
		
		return "success";
	}

	@Override
	public Course getById(Integer cid) {
		Optional<Course> findById=courseRepo.findById(cid);
		
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public String deleteById(Integer cid) {
		if(courseRepo.existsById(cid)) {
			courseRepo.deleteById(cid);
			return "Delete success..........!!";
		}
		else {
			return "Delete failed.....";
		}
		
	}

	@Override
	public List<Course> getAllCourses() {
		
		return courseRepo.findAll();
	}

}
