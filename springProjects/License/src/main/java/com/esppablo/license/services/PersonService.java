package com.esppablo.license.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.esppablo.license.models.Person;
import com.esppablo.license.repositories.PersonRepository;

@Service

public class PersonService {
	private PersonRepository personRepository;
	
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	// return all persons
	public List<Person> allPersons(){
		return personRepository.findAll();
	}
	
	// add new Person
	public void addPerson(Person person) {
		personRepository.save(person);
	}
	
}
