package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;

@RestController
public class PersonController {

	@Autowired
	private PersonRepository personRepository;
	
	@GetMapping("/api/, /api/{id}")
	public Person getDefaultEmployeesByIdWithOptional(Optional<Long> id) {
		Person p=new Person();
		if(id.isPresent()) {
			p=personRepository.findById(id.get()).get();
			return p;
		}
		else {
			return p;
		}
	}
	
	@GetMapping("/")
	public List<Person> getAllPerson(){
		return personRepository.findAll();
	}
	
	@PostMapping("/addPerson")
	public Person savePerson(@RequestBody Person person) {
		return personRepository.save(person);
	}
	
	@PutMapping("/updatePerson")
	public Person updatePerson(@RequestBody Person person) {
		return personRepository.save(person);
	}
	
	@DeleteMapping("/deletePerson")
	public 	String deletePerson() {
		 personRepository.deleteAll();
		 return "Deleted successfully";
	}
}
