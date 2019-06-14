package com.karthik.springbootemployeeproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karthik.springbootemployeeproject.entity.Employee;

public interface EmployeeJPARepository
		extends JpaRepository<Employee, Integer> {

}
