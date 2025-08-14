package com.example.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void saveAllEmployee() {
		Employee e1= new Employee(101,"Ajay",5000);
		Employee e2= new Employee(102,"Gopal",6000);
		Employee e3= new Employee(103,"Suyog",7000);
		
		List<Employee> list=Arrays.asList(e1,e2,e3);
		
		employeeRepository.saveAll(list);
		System.out.println("Record Inserted.....");
	}
	
	public void getEmpId(Integer id) {
		Optional<Employee> emp=employeeRepository.findById(id);
		if(emp.isPresent()) {
			Employee emps=emp.get();
			System.out.println(emps);
		}
		else {
			System.out.println("Record is not available");
		}
	}
	
	public void getEmps(List<Integer> id) {
		Iterable<Employee> emp=employeeRepository.findAllById(id);
		emp.forEach(s->System.out.println(s));
	}
	
	public void getCheckingEmployeeId(Integer Id) {
		boolean status=employeeRepository.existsById(Id);
		System.out.println("Employee present status>>"+status);
	}
	
	public void getCount() {
		long l=employeeRepository.count();
		System.out.println("Count is>>"+l);
	}
	
	public void deleteById(Integer id) {
		employeeRepository.deleteById(id);
		System.out.println("Record deleted");
	}
	
	public void deleteAllById(List<Integer> id) {
		employeeRepository.deleteAllById(id);
		System.out.println("Record deleted");
	}
	
	
	public void deleteByEntity(Employee emp) {
		employeeRepository.delete(emp);
	}
	
	public void deleteAllEmployee() {
		employeeRepository.deleteAll();
	}
}
