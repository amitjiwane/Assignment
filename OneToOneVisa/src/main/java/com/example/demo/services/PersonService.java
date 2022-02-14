package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Person;

public interface PersonService {

	public List<Person> getPerson();

	public Person savePerson(Person person);

	public Person updatePerson(Person person);

	public String deletePerson(Person person);
}
