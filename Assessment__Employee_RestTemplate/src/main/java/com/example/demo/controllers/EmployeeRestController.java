package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Employee;
import com.example.demo.serviceImple.EmployeeServiceImple;

@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeServiceImple employeeServiceImple;
	
	@Autowired
	private RestTemplate restTemplate;
	
	//consume RestAPI
	@GetMapping("/consume")
	public String consumeRest() {
		String url="http://localhost:8084/get";
		return restTemplate.getForEntity(url, String.class).getBody();
	}
	
	@GetMapping("/get")
	public List<Employee> obtainAllEmployee(){
		return employeeServiceImple.getAllEmployee(); 
	}
	
	@PostMapping("/post")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeServiceImple.saveEmployee(employee);
	}
	
	@DeleteMapping("/delete")
	public String eraseEmployee(@RequestBody Employee employee) {
		employeeServiceImple.deleteEmployee(employee);
		return "Deleted";
	}
}

