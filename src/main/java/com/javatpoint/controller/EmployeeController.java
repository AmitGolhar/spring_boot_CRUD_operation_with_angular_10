package com.javatpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.exceptions.UserNotFoundException;
import com.javatpoint.model.Employee;
import com.javatpoint.service.EmployeeService;

 
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	// get all employee
	@GetMapping("employee")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployees();
		
	}
	
	// add new employee
 
	@PostMapping("employee")
	public void SaveEmployee(@RequestBody Employee employee) {
		System.out.println(employee);
		employeeService.SaveEmp(employee);
	}

		// get employee by ID
 
	@GetMapping("employee/{id}")
	public Employee getById(@PathVariable("id") int id) {
		// return employeeService.getById(id);
		Employee user= employeeService.getById(id);  
		if(user==null)  
		//runtime exception  
		throw new UserNotFoundException("id: "+ id);  
		return user; 
		
	}
 
	@DeleteMapping("employee/{id}")
	public void deleteEmployee(@PathVariable("id") int id) {
		employeeService.deleteEmployee(id);
	}
	
}
