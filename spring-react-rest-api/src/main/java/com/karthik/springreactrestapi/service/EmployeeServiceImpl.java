package com.karthik.springreactrestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.karthik.springreactrestapi.dao.EmployeeDAO;
import com.karthik.springreactrestapi.entity.Employee;

@Component
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO ed;

	@Override
	public List<Employee> findAll() {
		return ed.findAll();
	}

	@Override
	public Employee findById(int id) {
		Optional<Employee> em = ed.findById(id);
		if (em.isPresent()) {
			return em.get();
		} else {
			throw new RuntimeException("Employee not found with id:" + id);
		}
	}

	@Override
	public void saveOrUpdateEmployee(Employee emp) {
		ed.save(emp);
	}

	@Override
	public void deleteEmployee(int id) {
		ed.deleteById(id);
	}
}
