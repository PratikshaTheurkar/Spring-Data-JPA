package com.example;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

@SpringBootApplication
public class SpringDataJpaCrudOperationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ap=SpringApplication.run(SpringDataJpaCrudOperationApplication.class, args);
		EmployeeService employeeService=ap.getBean(EmployeeService.class);
		
		//SaveAll>>Used to save multiple records, we can pass list or set
		//employeeService.saveAllEmployee();
		
		//used to get record based on Primary Key
		//employeeService.getEmpId(101);
		
		//used to get multiple record based on primary Key
		//employeeService.getEmps(Arrays.asList(101,102,104));
		
		//used to check record present in table or not
		//employeeService.getCheckingEmployeeId(1005);
		
		//used to get tptal record count from db
		//employeeService.getCount();
		
		employeeService.deleteById(103);
		
		employeeService.deleteAllById(Arrays.asList(101,102));
		
		
		Employee emp=new Employee(101,"Ajay",5000);
		employeeService.deleteByEntity(emp);
		
		employeeService.deleteAllEmployee();
	}

}
