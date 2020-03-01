package com.springcrudapi.springcrudapi.service;

import java.util.List;

import com.springcrudapi.springcrudapi.model.Employee;

//import com.example.demo.crudapi.model.Employee;

public interface EmployeeService {

List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
	
}

