package com.karthik.springreactrestapi.service;

import java.util.List;

import com.karthik.springreactrestapi.entity.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	public Employee findById(int id);
	void saveOrUpdateEmployee(Employee emp);
	void deleteEmployee(int id);
}
