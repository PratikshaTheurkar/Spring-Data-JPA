package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.EmployeeService;

@SpringBootApplication
public class SpringDataJpaFindByXxxImplApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ap=SpringApplication.run(SpringDataJpaFindByXxxImplApplication.class, args);
		EmployeeService employeeService=ap.getBean(EmployeeService.class);
		employeeService.findByName("Ajay");
	}

}
