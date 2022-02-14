package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public Student storeStudent(Student student) {
		return studentServiceImple.saveStudent(student);
	}
	
	@PutMapping("/update")
	public Student modifyStudent(Student student) {
		return studentServiceImple.updateStudent(student);
	}
	
	@DeleteMapping("/delete")
	public String eraseStudent(Student student) {
	 studentServiceImple.deleteStudent(student);
		return "Deleted"+student;
	}
}
