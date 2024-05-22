package com.nit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.model.Course;



public interface CourseRepository extends JpaRepository<Course, Serializable> {

}
