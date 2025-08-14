package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.ProductService;

@SpringBootApplication
public class SpringDataJpaTimestampingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ap=SpringApplication.run(SpringDataJpaTimestampingApplication.class, args);
		ProductService productService=ap.getBean(ProductService.class);
		productService.saveProduct();
	}

}
