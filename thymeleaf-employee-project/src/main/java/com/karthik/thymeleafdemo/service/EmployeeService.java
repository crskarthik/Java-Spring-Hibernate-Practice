package com.karthik.thymeleafdemo.service;

import java.util.List;

import com.karthik.thymeleafdemo.entity.Employee;

public interface EmployeeService {
	public List<Employee> findAll();

	public Employee getEmployee(int id);

	public void saveOrUpdateEmployee(Employee emp);

	public void deleteEmployee(int id);
}
