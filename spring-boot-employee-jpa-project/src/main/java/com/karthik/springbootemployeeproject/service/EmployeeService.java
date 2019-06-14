package com.karthik.springbootemployeeproject.service;

import java.util.List;

import com.karthik.springbootemployeeproject.entity.Employee;

public interface EmployeeService {
	public List<Employee> findAll();

	public Employee getEmployee(int id);

	public void saveOrUpdateEmployee(Employee emp);

	public void deleteEmployee(int id);
}
