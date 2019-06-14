package com.karthik.thymeleafdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karthik.thymeleafdemo.dao.EmployeeJPARepository;
import com.karthik.thymeleafdemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeJPARepository ejr;

	@Override
	public List<Employee> findAll() {
		return ejr.findAll();
	}

	@Override
	public Employee getEmployee(int id) {
		Optional<Employee> result = ejr.findById(id);
		if (result.isPresent()) {
			return result.get();
		} else {
			throw new RuntimeException("Employee not found with id:" + id);
		}
	}

	@Override
	public void saveOrUpdateEmployee(Employee emp) {
		ejr.save(emp);
	}

	@Override
	public void deleteEmployee(int id) {
		ejr.deleteById(id);
	}

}
