package com.karthik.springbootemployeeproject.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.karthik.springbootemployeeproject.dao.EmployeeDAO;
import com.karthik.springbootemployeeproject.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO ed;

	@Override
	@Transactional
	public List<Employee> findAll() {
		return ed.findAll();
	}

	@Override
	@Transactional
	public Employee getEmployee(int id) {
		return ed.getEmployee(id);
	}

	@Override
	@Transactional
	public void saveOrUpdateEmployee(Employee emp) {
		ed.saveOrUpdateEmployee(emp);
	}

	@Override
	@Transactional
	public void deleteEmployee(int id) {
		ed.deleteEmployee(id);
	}

}
