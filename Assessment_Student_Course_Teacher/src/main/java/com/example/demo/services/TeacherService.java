package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Course;
import com.example.demo.model.Teacher;

public interface TeacherService {

	public List<Teacher> getAllTeacher();

	public Teacher saveTeacher(Teacher teacher);

	public String deleteTeacher(Teacher teacher);
}
