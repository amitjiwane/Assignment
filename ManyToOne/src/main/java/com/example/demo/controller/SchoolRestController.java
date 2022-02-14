package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.School;
import com.example.demo.serviceImple.SchoolServiceImple;

@RestController
@RequestMapping("/school")
public class SchoolRestController {

	@Autowired(required = true)
	private SchoolServiceImple schoolServiceImple; 
	
	@GetMapping("/get")
	public List<School> obtainSchool(){
		return schoolServiceImple.getSchool();
		
	}
	
	@PostMapping("/save")
	public School storeSchool(@RequestBody School school) {
		return schoolServiceImple.saveSchool(school);
	}
	
	@PostMapping("/update")
	public School modifySchool(@RequestBody School school) {
		return schoolServiceImple.saveSchool(school);
	}
	
	public String EraseSchool(@RequestBody School school) {
		schoolServiceImple.deleteSchool(school);
		return "Deleted"+school;
	}
}
