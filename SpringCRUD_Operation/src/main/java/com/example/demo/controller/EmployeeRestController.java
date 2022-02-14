package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/addEmployees")
	public List<Employee> addEmployee(List<Employee> employee){
		return service.saveEmployees(employee);
	}

	
	@GetMapping("/")
	public List<Employee> FindAllEmployee(){
		return service.getAllData();
	}

}
