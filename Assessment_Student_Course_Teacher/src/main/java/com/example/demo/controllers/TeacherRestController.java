package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Teacher;
import com.example.demo.serviceImple.TeacherServiceImple;

@RestController
@RequestMapping("/teacher")
public class TeacherRestController {

	@Autowired
	private TeacherServiceImple teacherServiceImple;
	
	@GetMapping("/get")
	public List<Teacher> obtainAllTeacher(){
		return teacherServiceImple.getAllTeacher();
	}
	
	@PostMapping("/post")
	public Teacher storeTeacher(@RequestBody Teacher teacher) {
		return teacherServiceImple.saveTeacher(teacher);
	}
	
	@DeleteMapping("/delete")
	public String eraseTeacher(@RequestBody Teacher teacher) {
		teacherServiceImple.deleteTeacher(teacher);
		return "Deleted";
	}
}
