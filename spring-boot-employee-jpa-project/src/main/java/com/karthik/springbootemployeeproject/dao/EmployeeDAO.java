package com.karthik.springbootemployeeproject.dao;

import java.util.List;

import com.karthik.springbootemployeeproject.entity.Employee;

public interface EmployeeDAO {
	public List<Employee> findAll();

	public Employee getEmployee(int id);

	public void saveOrUpdateEmployee(Employee emp);

	public void deleteEmployee(int id);
}
