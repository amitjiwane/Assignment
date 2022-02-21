package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.serviceImple.StudentServiceImple;

@RestController
@RequestMapping("/student")
public class StudentRestController {

	@Autowired
	private StudentServiceImple studentServiceImple;
	
	@GetMapping("/get")
	public List<Student> obtainAllStudent(){
		return studentServiceImple.getAllStudents(); 
	}
	
	@PostMapping("/post")
	public Student storeStudent(@RequestBody Student student) {
		return studentServiceImple.saveStudent(student);
	}
	
	@DeleteMapping("/delete")
	public String eraseStudent(@RequestBody Student student) {
		studentServiceImple.deleteStudent(student);
		return "Deleted"+student;
	}
}
