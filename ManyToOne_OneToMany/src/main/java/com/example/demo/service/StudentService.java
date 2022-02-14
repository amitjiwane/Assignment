package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {

	public List<Student> getStudent();

	public Student saveStudent(Student student);
	
	public Student updateStudent(Student student);

	public String deleteStudent(Student student);
}
