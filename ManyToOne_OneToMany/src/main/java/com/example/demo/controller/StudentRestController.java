package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired(required = true)
	private StudentServiceImple studentServiceImple; 
	
	@GetMapping("/get")
	public List<Student> obtainStudent(){
		return studentServiceImple.getStudent();
		
	}
	
	@PostMapping("/save")
	public Student storeStudent(@RequestBody Student student) {
		return studentServiceImple.saveStudent(student);
	}
	
	@PostMapping("/update")
	public Student modifyStudent(@RequestBody Student student) {
		return studentServiceImple.saveStudent(student);
	}
	
	public String EraseStudent(@RequestBody Student student) {
		studentServiceImple.deleteStudent(student);
		return "Deleted"+student;
	}
}
