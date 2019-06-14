package com.karthik.springbootemployeeproject.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.karthik.springbootemployeeproject.entity.Employee;

@Repository
public class EmployeeDAOjpaImpl implements EmployeeDAO {

	@Autowired
	private EntityManager em;

	@Override
	public List<Employee> findAll() {
		return em.createQuery("from Employee", Employee.class).getResultList();
	}

	@Override
	public Employee getEmployee(int id) {
		return em.find(Employee.class, id);
	}

	@Override
	public void saveOrUpdateEmployee(Employee emp) {
		emp.setId(em.merge(emp).getId());
	}

	@Override
	public void deleteEmployee(int id) {
		em.createQuery("delete from Employee where id=:empID")
				.setParameter("empID", id).executeUpdate();
	}

}
