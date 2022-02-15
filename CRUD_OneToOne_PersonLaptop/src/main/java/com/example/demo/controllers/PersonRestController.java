package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.serviceImple.PersonServiceImple;

@RestController
@RequestMapping("/person")
public class PersonRestController {

	@Autowired(required = true)
	private PersonServiceImple personServiceImple;
	
	@GetMapping("/get")
	public List<Person> obtainPerson(){
		return personServiceImple.getPerson();
	}
	
	
	@PostMapping("/save")
	public Person storePerson(@RequestBody Person person) {
		return personServiceImple.savePerson(person);
	}
	
	@DeleteMapping("/delete")
	public String erasePerson(@RequestBody Person person) {
		personServiceImple.deletePerson(person);
		return "Deleted"+person;
	}
}
