package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/obtain")
	public List<Student> obtainStudent(){
		return studentServiceImple.getStudent();
}
	
	@PostMapping("/save")
	public Student storeStudent(@RequestBody Student student) {
		return studentServiceImple.saveStudent(student);
	}
	
	@PutMapping("/modify")
	public Student modifyStudent(@RequestBody Student student) {
		return studentServiceImple.saveStudent(student);
	}
	
	@DeleteMapping("/delete")
	public String deleteStudent(@RequestBody Student student) {
		 studentServiceImple.deleteStudent(student);
		 return "Deleted";
	}
}
