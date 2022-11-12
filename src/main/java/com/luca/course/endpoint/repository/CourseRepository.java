package com.luca.course.endpoint.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.luca.course.endpoint.model.Course;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long>{

}
