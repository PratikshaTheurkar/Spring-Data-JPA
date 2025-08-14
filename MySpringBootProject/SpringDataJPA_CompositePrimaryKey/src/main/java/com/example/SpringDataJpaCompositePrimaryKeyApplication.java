package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.PersonService;

@SpringBootApplication
public class SpringDataJpaCompositePrimaryKeyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ap=SpringApplication.run(SpringDataJpaCompositePrimaryKeyApplication.class, args);
		PersonService personService=ap.getBean(PersonService.class);
		//personService.savePerson();
		personService.getPerson();
	}

}
