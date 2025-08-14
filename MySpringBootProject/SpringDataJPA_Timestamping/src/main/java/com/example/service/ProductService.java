package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Product;
import com.example.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public void saveProduct() {
		Product p= new Product();
		p.setpId(4);
		p.setPname("mouse");
		p.setPrice(800);
		
		productRepository.save(p);
		System.out.println("Product Saved");
	}
}
