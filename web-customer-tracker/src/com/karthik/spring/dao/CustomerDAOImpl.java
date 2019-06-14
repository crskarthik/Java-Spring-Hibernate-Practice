package com.karthik.spring.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.karthik.spring.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {
		Session session = sessionFactory.getCurrentSession();

		Query<Customer> theQuery = session.createQuery("from Customer order by lastName",
				Customer.class);

		return theQuery.getResultList();
	}

	@Override
	public Customer getCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();
		if (id > 0) {
			return session.get(Customer.class, id);
		}
		return null;
	}

	@Override
	public void saveCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);
	}

	@Override
	public void deleteCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(getCustomer(id));
	}

//	@Override
//	public void updateCustomer(Customer customer) {
//		Session session = sessionFactory.getCurrentSession();
//		session.update(customer);
//	}
}
