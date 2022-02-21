package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Course;

public interface CourseService {

	public List<Course> getAllCourse();

	public Course saveCourse(Course course);

	public String deleteCourse(Course course);
}
