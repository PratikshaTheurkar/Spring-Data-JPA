package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeService {

	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void findByName(String name) {
		List<Employee> names=employeeRepository.findByName(name);
		names.forEach(a->System.out.println(a));
	}
}
