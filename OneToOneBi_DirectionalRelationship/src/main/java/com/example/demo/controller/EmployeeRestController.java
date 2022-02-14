package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Department;
import com.example.demo.service.EmployeeService;
import com.example.demo.serviceImpl.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

	@Autowired(required = true)
	private EmployeeServiceImpl employeeServiceImpl;
	
	@PostMapping("/save")
	public Department storeEmployee(@RequestBody Department employee) {
		return employeeServiceImpl.saveEmployee(employee);
	}
	
	@GetMapping("/get")
	public List<Department> findEmployee(@RequestBody List<Department> employee){
		return employeeServiceImpl.getEmployee(employee);
	}
	
	@PutMapping("/update")
	public Department modifyEmployee(@RequestBody Department employee) {
		return employeeServiceImpl.updateEmployee(employee);
	}
	
	public String deleteEmployee(@RequestBody Department employee) {
		employeeServiceImpl.deleteEmployee(employee);
		return "Deleted "+employee;
	}
}
