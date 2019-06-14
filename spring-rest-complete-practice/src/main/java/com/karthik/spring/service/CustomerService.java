package com.karthik.spring.service;

import java.util.List;

import com.karthik.spring.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();
	public Customer getCustomer(int id);
	public void addOrUpdateCustomer(Customer cus);
	public void deleteCustomer(int id);
}
