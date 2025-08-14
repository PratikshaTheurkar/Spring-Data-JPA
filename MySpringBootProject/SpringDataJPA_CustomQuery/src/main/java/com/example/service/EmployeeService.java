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

	public void getAllEmployeeSQLQuery() {

		List<Employee> list = employeeRepository.getAllEmpSql();
		list.forEach(a -> System.out.println(a));
	}

	public void getAllEmployeeHQLQuery() {

		List<Employee> list = employeeRepository.getAllEmpHql("Ajay");
		list.forEach(a -> System.out.println(a));
	}
}
