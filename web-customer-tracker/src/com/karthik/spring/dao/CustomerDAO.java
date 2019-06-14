package com.karthik.spring.dao;

import java.util.List;
import com.karthik.spring.entity.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomers();
	public Customer getCustomer(int id);
	public void saveCustomer(Customer customer);
	public void deleteCustomer(int id);
//	public void updateCustomer(Customer customer);
}
