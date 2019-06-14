package com.karthik.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.karthik.spring.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sf;

	@Override
	public List<Customer> getCustomers() {
		Session session = sf.getCurrentSession();
		List<Customer> customers = session
				.createQuery("from Customer", Customer.class).getResultList();
		return customers;
	}

	@Override
	public Customer getCustomer(int id) {
		Session session = sf.getCurrentSession();
		Customer customer = session.get(Customer.class, id);
		return customer;
	}

	@Override
	public void addOrUpdateCustomer(Customer cus) {
		sf.getCurrentSession().saveOrUpdate(cus);
	}

	@Override
	public void deleteCustomer(int id) {
		sf.getCurrentSession().delete(getCustomer(id));
	}

}
