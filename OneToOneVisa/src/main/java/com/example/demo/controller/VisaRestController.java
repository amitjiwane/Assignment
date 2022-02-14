package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Visa;
import com.example.demo.serviceImple.VisaServiceImple;

@RestController
@RequestMapping("/visa")
public class VisaRestController {

	@Autowired(required = true)
	private VisaServiceImple visaServiceImple; 
	
	@GetMapping("/get")
	public List<Visa> obtainVisa(){
		return visaServiceImple.getVisa();
	}
	
	@PostMapping("/save")
	public Visa storeVisa(@RequestBody Visa visa) {
		return visaServiceImple.saveVisa(visa);
	}
	
	@PutMapping("/update")
	public Visa ModifyVisa(@RequestBody Visa  visa) {
		return visaServiceImple.saveVisa(visa);
	}
	
	@DeleteMapping("/delete")
	public String deleteVisa(@RequestBody Visa visa) {
		visaServiceImple.deleteVisa(visa);
		return "delete";
	}
}
