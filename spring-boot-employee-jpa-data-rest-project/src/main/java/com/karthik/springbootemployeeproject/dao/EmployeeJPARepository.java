package com.karthik.springbootemployeeproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.karthik.springbootemployeeproject.entity.Employee;

@RepositoryRestResource(path = "members")
public interface EmployeeJPARepository
		extends JpaRepository<Employee, Integer> {

}
