package com.example.specification;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.Product;

import jakarta.persistence.criteria.CriteriaBuilder;

public class ProductSpecification {

	// get mobile greater than 10k and less than 50k
	
	public static Specification<Product> nameLike(String name){
		return (root,query,criteriaBuilder)-> 
		criteriaBuilder.like(root.get("name"), "%"+name+"%");
	}
	
	public static Specification<Product> priceLessThan(Double sal){
		return(root,query,criteriaBuilder)->
		criteriaBuilder.lessThanOrEqualTo(root.get("sal"), sal);
	}
	
	
	//root.get("sal")-> sal should be exact field name mention in entity class
	
	public static Specification<Product> pricegreaterThan(Double sal){
		return(root,query,criteriaBuilder)->
		criteriaBuilder.greaterThanOrEqualTo(root.get("sal"), sal);
	}
}
