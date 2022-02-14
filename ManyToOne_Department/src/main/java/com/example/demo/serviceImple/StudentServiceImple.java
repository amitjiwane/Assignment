package com.example.demo.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.services.StudentService;

@Service
public class StudentServiceImple implements StudentService {

	@Autowired(required = true)
	private StudentRepository studentRepository;

	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public String deleteStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.delete(student);
		return "Deleted"+student;
	}
}
