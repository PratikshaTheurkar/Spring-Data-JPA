package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.ProductService;

@SpringBootApplication
public class SpringDataJpaSpecificationConeptApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ap=SpringApplication.run(SpringDataJpaSpecificationConeptApplication.class, args);
		ProductService productService=ap.getBean(ProductService.class);
		//productService.saveProduct();
		
		//productService.getProduct();
		
		productService.getProductSpec("ppl", 20000.00, 60000.00);
	}

}
