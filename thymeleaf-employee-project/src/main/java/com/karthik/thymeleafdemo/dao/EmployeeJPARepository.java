package com.karthik.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karthik.thymeleafdemo.entity.Employee;

public interface EmployeeJPARepository
		extends JpaRepository<Employee, Integer> {
	public List<Employee> findAllByOrderByLastNameAsc();
}
