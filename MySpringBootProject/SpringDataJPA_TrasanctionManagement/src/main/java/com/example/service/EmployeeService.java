package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.entity.Address;
import com.example.entity.Employee;
import com.example.repository.AddressRepository;
import com.example.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Transactional(rollbackOn = Exception.class)
	public void saveEmployee() {
		
		Employee employee=new Employee();
		employee.setName("vinod");
		employee.setSalary(5000);
		
		Employee emp=employeeRepository.save(employee);
		
		//int a=10/0;
		
		Address address=new Address();
		address.setCity("pune");
		address.setState("Maharashtra");
		address.seteId(emp.getId());
		
		addressRepository.save(address);
	}
}
