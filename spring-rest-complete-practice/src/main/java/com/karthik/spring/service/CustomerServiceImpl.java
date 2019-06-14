package com.karthik.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karthik.spring.dao.CustomerDAO;
import com.karthik.spring.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerdao;

	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerdao.getCustomers();
	}

	@Override
	@Transactional
	public Customer getCustomer(int id) {
		return customerdao.getCustomer(id);
	}

	@Override
	@Transactional
	public void addOrUpdateCustomer(Customer cus) {
		customerdao.addOrUpdateCustomer(cus);
	}

	@Override
	@Transactional
	public void deleteCustomer(int id) {
		customerdao.deleteCustomer(id);
	}

}
