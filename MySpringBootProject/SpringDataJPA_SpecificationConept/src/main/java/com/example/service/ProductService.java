package com.example.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.example.entity.Product;
import com.example.repository.ProductRepository;
import com.example.specification.ProductSpecification;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public void saveProduct() {
		Product p1= new Product("Samsung",10000.00,"Mobiles");
		Product p2= new Product("Apple",50000.00,"Mobiles");
		Product p3= new Product("Oppo",40000.00,"Mobiles");
		
		productRepository.saveAll(Arrays.asList(p1,p2,p3));
	}
	
	public void getProduct() {
		Product p1= new Product();
		p1.setCategory("Mobiles");
		
		/*No need to manually write methods like findByCategory(String category) in Repository.
		 * p1.setCategory("Mobiles");
		   p1.setBrand("Samsung");
		   it will work as WHERE category = 'Mobiles' AND brand = 'Samsung'
		 */
		Example<Product> of=Example.of(p1);
		
		List<Product> findAll =productRepository.findAll(of);
		findAll.forEach(a->System.out.println(a));
	}
	
	public void getProductSpec(String name,Double minPrice,Double maxPrice) {
		Specification<Product> spec=Specification.where(null);
		
		if(name!= null) {
			spec=spec.and(ProductSpecification.nameLike(name));
		}
		
		if(minPrice != null) {
			spec=spec.and(ProductSpecification.pricegreaterThan(minPrice));
		}
		
		if(maxPrice != null) {
			spec=spec.and(ProductSpecification.priceLessThan(maxPrice));
		}
		
		List<Product> findAll=productRepository.findAll(spec);
		findAll.forEach(a->System.out.println(a));
	}
}
