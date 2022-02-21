package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Course;
import com.example.demo.serviceImple.CourseServiceImple;

@RestController
@RequestMapping("/course")
public class CourseRestController {

	@Autowired
	private CourseServiceImple courseServiceImple;
	
	@GetMapping("/get")
	public List<Course> obtainAllCourse(){
		return courseServiceImple.getAllCourse();
	}
	
	@PostMapping("/post")
	public Course storeCourse(@RequestBody Course course) {
		return courseServiceImple.saveCourse(course);
	}
	
	@DeleteMapping("/delete")
	public String eraseCourse(@RequestBody Course course) {
		courseServiceImple.deleteCourse(course);
		return "Deleted";
	}
}
