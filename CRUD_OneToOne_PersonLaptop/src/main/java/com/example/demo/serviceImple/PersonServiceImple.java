package com.example.demo.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import com.example.demo.services.PersonService;

@Service
public class PersonServiceImple implements PersonService{
	@Autowired
	private PersonRepository personRepository;

	@Override
	public List<Person> getPerson() {
		// TODO Auto-generated method stub
		return personRepository.findAll();
	}

	@Override
	public Person savePerson(Person person) {
		// TODO Auto-generated method stub
		return personRepository.save(person);
	}

	@Override
	public String deletePerson(Person person) {
		// TODO Auto-generated method stub
		personRepository.delete(person);
		return "Deleted"+person;
	}

}
