package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	/*1)
	 * Native SQL>> A plain sql is called as native Sql (table name + column name Imp) dependant query
	 * */
	
	@Query(value = "select * from employee", nativeQuery = true)
	
	public List<Employee> getAllEmpSql();
	
	
	/*1)
	 * HQL>> Hibernate Query Language Independant query  entity class name and variable name is imp
	 * */
	@Query ("from Employee e where e.name= :name")
	
	public List<Employee> getAllEmpHql(@Param("name") String name);
}
