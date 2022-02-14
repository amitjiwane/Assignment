package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;
import com.example.demo.serviceImple.DepartmentServiceImple;

@RestController
@RequestMapping("/department")
public class DepartmentRestController {
	
	@Autowired(required = true)
	private DepartmentServiceImple  departmentServiceImple; 

	@GetMapping("/get")
	public List<Department> obtainDepartment(){
		return departmentServiceImple.getDepartment();
}
	
	@PostMapping("/save")
	public Department storeDepartment(Department department) {
		return departmentServiceImple.saveDepartment(department);
	}
	
	@PutMapping("/update")
	public Department modifyDepartment(Department department) {
		return departmentServiceImple.saveDepartment(department);
	}
	
	@DeleteMapping("/delete")
	public String deleteDepartment(Department department) {
		 departmentServiceImple.deleteDepartment(department);
		 return "Deleted";
	}
}
