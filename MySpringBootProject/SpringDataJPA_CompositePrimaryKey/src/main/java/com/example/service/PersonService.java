package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Person;
import com.example.entity.PersonPK;
import com.example.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	public void savePerson() {
		
		PersonPK personPk=new PersonPK();
		personPk.setPersonId(101);
		personPk.setPassportNum("MG1025KS");
		
		Person person=new Person();
		person.setName("Ajay");
		person.setGender("Male");
		person.setEmail("Ajay@gmail.com");
		person.setPersonPK(personPk);
		
		personRepository.save(person);
		
		System.out.println("Person Saved");
	}
	
	public void getPerson() {
		
		PersonPK personPk=new PersonPK();
		personPk.setPersonId(101);
		personPk.setPassportNum("MG1025KS");
		
		Optional<Person> opt=personRepository.findById(personPk);
		
		if(opt.isPresent()) {
			Person person=opt.get();
			System.out.println(person);
		}
	}
}
