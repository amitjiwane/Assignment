package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.serviceImple.EmployeeServiceImple;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

	@Autowired(required = true)
	private EmployeeServiceImple employeeServiceImple;

	@GetMapping("/get")
	public List<Employee> obtainEmployee() {
		return employeeServiceImple.getEmployee();
	}

	@PostMapping("/save")
	public Employee storeEmployee(@RequestBody Employee employee) {
		return employeeServiceImple.saveEmployee(employee);
	}

	@PutMapping("/update")
	public Employee modifyEmployee(@RequestBody Employee employee) {
		return employeeServiceImple.saveEmployee(employee);
	}

	@DeleteMapping("/delete")
	public String deleteEmployee(@RequestBody Employee employee) {
		employeeServiceImple.deleteEmployee(employee);
		return "Deleted" + employee;
	}
}
