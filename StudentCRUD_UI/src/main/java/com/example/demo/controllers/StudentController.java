package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Student;
import com.example.demo.services.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
//	
//	@GetMapping("/get")
//	public String greeting() {
//		return "index";
//	}
//	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		List<Student> obtainAll = studentService.getAllStudent();
		model.addAttribute("liststudent", obtainAll);
		return "index";
		
	}
	
	@GetMapping("/new")
	public String add(Model model) {
		model.addAttribute("student", new Student());
		return "new";
		
	}
	
	 @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String storeStudent(@ModelAttribute("student") Student std) {
	       studentService.saveStudent(std);
	        return "redirect:/";
	    }
//	@GetMapping("/new")
//	public Student addStudent(Model model, Student student) {
//		Student storeStudent=studentService.saveStudent(student);
//		return "new";
//	}
}
