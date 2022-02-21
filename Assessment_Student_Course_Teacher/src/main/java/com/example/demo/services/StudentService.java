package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {

	public List<Student> getAllStudents();
	
	public Student saveStudent(Student student);
	
	public String deleteStudent(Student student);
}
