package com.karthik.springreactrestapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karthik.springreactrestapi.entity.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Integer> {

}
