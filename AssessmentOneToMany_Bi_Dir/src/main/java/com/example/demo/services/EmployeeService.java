package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {

	public List<Employee> getEmployee();
	
	public Employee saveEmployee(Employee employee);
	
	public Employee updateEmployee(Employee employee);
	
	public String deleteEmployee(Employee employee);
	
}
