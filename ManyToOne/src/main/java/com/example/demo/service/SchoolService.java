package com.example.demo.service;

import java.util.List;

import com.example.demo.model.School;

public interface SchoolService {

	public List<School> getSchool();

	public School saveSchool(School school);
	
	public School updateSchool(School school);

	public String deleteSchool(School school);

}
