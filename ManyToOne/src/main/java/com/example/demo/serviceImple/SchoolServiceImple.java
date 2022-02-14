package com.example.demo.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.School;
import com.example.demo.repository.SchoolRepository;
import com.example.demo.service.SchoolService;

@Service
public class SchoolServiceImple implements SchoolService{
	
	@Autowired(required = true)
	private SchoolRepository schoolRepository;

	@Override
	public List<School> getSchool() {
		// TODO Auto-generated method stub
		return schoolRepository.findAll();
	}

	@Override
	public School saveSchool(School school) {
		// TODO Auto-generated method stub
		return schoolRepository.save(school);
	}

	@Override
	public School updateSchool(School school) {
		// TODO Auto-generated method stub
		return schoolRepository.save(school);
	}

	@Override
	public String deleteSchool(School school) {
		// TODO Auto-generated method stub
		schoolRepository.delete(school);
		return "Deleted"+school;
	}

}
