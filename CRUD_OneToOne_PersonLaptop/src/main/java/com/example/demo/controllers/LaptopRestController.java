package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Laptop;
import com.example.demo.serviceImple.LaptopServiceImple;

@RestController
@RequestMapping("/laptop")
public class LaptopRestController {

	@Autowired
	private LaptopServiceImple laptopServiceImple;
	
	@GetMapping("/get")
	public List<Laptop> obtainLaptop(){
		return laptopServiceImple.getLaptop();
	}
	
	@PostMapping("/save")
	public Laptop storeLaptop(@RequestBody Laptop laptop) {
		return laptopServiceImple.saveLaptop(laptop);
	}
	
	public String eraseLaptop(@RequestBody Laptop laptop) {
		laptopServiceImple.deleteLaptop(laptop);
		return "Deleted"+laptop;
	}
}
