package com.javatpoint.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatpoint.model.Employee;
import com.javatpoint.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees() {
		List<Employee> employee = employeeRepository.findAll();

		if (employee.size() > 0) {
			return employee;
		} else {
			return new ArrayList<Employee>();
		}

	}

	public void SaveEmp(Employee employee) {
		employeeRepository.save(employee);
	}

	public Employee getById(int id) {
		return employeeRepository.findById(id).get();
	}
	
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}

}
