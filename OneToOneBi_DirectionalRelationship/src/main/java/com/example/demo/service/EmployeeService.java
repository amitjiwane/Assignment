package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Department;


public interface EmployeeService {

	public Department saveEmployee(Department employee);
	
	public List<Department> getEmployee(List<Department> employee);
	
	public Department updateEmployee(Department employee);
	
	public String deleteEmployee(Department employee);
}
