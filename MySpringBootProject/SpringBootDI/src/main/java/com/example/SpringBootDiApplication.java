package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.UserService;

@SpringBootApplication
public class SpringBootDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ap=SpringApplication.run(SpringBootDiApplication.class, args);
		UserService us=ap.getBean(UserService.class);
		us.getName(100);
	
	}

}
