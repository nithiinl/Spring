package com.nit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.binding.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable> {

}
