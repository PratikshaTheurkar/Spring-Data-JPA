package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Double sal;
	private String category;
	
	
	
	public Product() {
		System.out.println("Inside default constructor");
	}

	public Product(String name, Double sal, String category) {
		this.name = name;
		this.sal = sal;
		this.category = category;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", sal=" + sal + ", category=" + category + "]";
	}
	
	
}
