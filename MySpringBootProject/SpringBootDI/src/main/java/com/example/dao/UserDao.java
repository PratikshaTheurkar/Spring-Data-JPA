package com.example.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public UserDao() {
		System.out.println("Inside UserDao Constructor");
	}

	public String findName(int id) {
		if(id==100) {
			return "Ajay";
		}
		else {
			return "Smith";
		}
	}
	
}
