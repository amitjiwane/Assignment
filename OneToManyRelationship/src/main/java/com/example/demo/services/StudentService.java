package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {

	//Get
		public List<Student> getStudent();
		
		//post
		public Student saveStudent(Student student);
		
		//Put
		public Student updateStudent(Student student);
		
		//delete
		public String deleteStudent(Student student);
}
