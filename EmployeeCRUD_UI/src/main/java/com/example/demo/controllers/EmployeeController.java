package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Employee;
import com.example.demo.serviceImple.EmployeeServiceImple;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeServiceImple employeeServiceImple;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		List<Employee> listAllEmployee=employeeServiceImple.getAllEmployees();
		model.addAttribute("listemployee", listAllEmployee);
		return "index";
  }
	
	@GetMapping("/showNewEmployee")
	public String showNewEmployee(Model model) {
		//create model attribute to bind form data
		Employee employee=new Employee();
		model.addAttribute("employee", employee);
		return "newEmployee";
		
	}
	
	@PostMapping("/saveEmployee")
	public String storeEmployee(@ModelAttribute("employee")  Employee employee) {
		//save data to database
		employeeServiceImple.saveEmployee(employee);
		System.out.println("saved successfully");
		return "redirect:/";
		
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable (value = "id") Long id, Model model) {
		//get Employee from service
		Employee employee=employeeServiceImple.getEmployeeById(id);
		
		//set employee as model attribute to pre populate the form
       model.addAttribute("employee", employee);	
		return "updateEmployee";
    
		
	}
	
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable(value = "id") Long id) {
		employeeServiceImple.deleteEmployeeById(id);
		return "redirect:/";
	}
}
