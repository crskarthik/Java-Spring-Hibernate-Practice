package com.karthik.springbootemployeeproject.dao;

import java.util.List;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.karthik.springbootemployeeproject.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	private EntityManager em;

	@Autowired
	public EmployeeDAOImpl(EntityManager em) {
		this.em = em;
	}

	@Override
	@Transactional
	public List<Employee> findAll() {
		Session s = em.unwrap(Session.class);
		return s.createQuery("from Employee", Employee.class).getResultList();
	}

	@Override
	@Transactional
	public Employee getEmployee(int id) {
		Session s = em.unwrap(Session.class);
		return s.get(Employee.class, id);
	}

	@Override
	@Transactional
	public void saveOrUpdateEmployee(Employee emp) {
		Session s = em.unwrap(Session.class);
		s.saveOrUpdate(emp);
	}

	@Override
	@Transactional
	public void deleteEmployee(int id) {
		Session s = em.unwrap(Session.class);
//		Query q = s.createQuery("from Employee where id=:emplID");
//		q.setParameter("emplID", id);
//		q.executeUpdate();
		s.delete(s.get(Employee.class, id));
	}

}
