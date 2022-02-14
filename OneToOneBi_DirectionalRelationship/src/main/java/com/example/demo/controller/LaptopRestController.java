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
import com.example.demo.entities.Laptop;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.LaptopService;

@RestController
@RequestMapping("/laptop")
public class LaptopRestController {

	@Autowired(required = true)
	private LaptopService laptopService;
	@PostMapping("/save")
	public Laptop storeLaptop(@RequestBody Laptop laptop) {
		return laptopService.saveLaptop(laptop);
		
	}
	
	@GetMapping("/get")
	public List<Laptop> findLaptop(@RequestBody List<Laptop> laptop) {
		return laptopService.getLaptop(laptop);
		
	}
	
	@PutMapping("/modify")
	public Laptop modifyLaptop(@RequestBody Laptop laptop) {
		return laptopService.updateLaptop(laptop);
	}
	
	public String EraseLaptop(@RequestBody Laptop laptop) {
		laptopService.deleteLaptop(laptop);
		return "Erase successfully"+laptop;
				
	}
	
	
}
