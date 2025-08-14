package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.PageRequest;

import com.example.service.EmployeeService;

@SpringBootApplication
public class SpringDataJpaPaginationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ap=SpringApplication.run(SpringDataJpaPaginationApplication.class, args);
		EmployeeService employeeService=ap.getBean(EmployeeService.class);
		//employeeService.getAllEmployee();
		//employeeService.getAllEmployeeSort();
		employeeService.getAllPagination();
	}
	

}
