package com.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	public List<Employee> findByName(String name);
	
	/*findByXXX method used to retrieve data based on non primary key value column 
	 * 
	 * X stands for column name in entity class
	 * */
}
