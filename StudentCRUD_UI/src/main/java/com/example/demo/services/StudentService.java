package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudent(){
		return studentRepository.findAll();
	}
	
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}
	
	public String deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		return "Deleted"+id;
	}
}
