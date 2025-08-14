package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public void getName(int id) {
		String name=userDao.findName(id);
		System.out.println("name>>"+name);
	}
}
