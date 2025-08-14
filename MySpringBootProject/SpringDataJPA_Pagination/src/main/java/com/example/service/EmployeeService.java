package com.example.service;

import java.util.List;
import java.util.SortedMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void getAllEmployee() {
		List<Employee> list=employeeRepository.findAll();
		list.forEach(a->System.out.println(a));
	}
	
	public void getAllEmployeeSort() {
		Sort sort= Sort.by("sal").ascending();
		List<Employee> list=employeeRepository.findAll(sort);
		list.forEach(a->System.out.println(a));
	}
	
	public void getAllPagination() {
		int pagesize=3;
		int pageNumber=1;
		PageRequest pr=PageRequest.of(pageNumber, pagesize);
		Page<Employee> page=employeeRepository.findAll(pr);
		List<Employee> list=page.getContent();
		list.forEach(a->System.out.println(a));
	}
}
