package com.karthik.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karthik.spring.entity.Customer;
import com.karthik.spring.exceptions.CustomerErrorException;
import com.karthik.spring.service.CustomerService;

@RestController
@RequestMapping("/api")
public class AppController {

	@Autowired
	private CustomerService cs;

	@GetMapping("/customers")
	public List<Customer> showCustomers() {
		return cs.getCustomers();
	}

	@GetMapping("/customers/{id}")
	public Customer showCustomer(@PathVariable int id) {
		Customer c = cs.getCustomer(id);
		if (c == null) {
			throw new CustomerErrorException(
					"Customer Not found with id :" + id);
		}
		return cs.getCustomer(id);
	}

	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer cus) {
		cus.setId(0);
		cs.addOrUpdateCustomer(cus);
		return cus;
	}
	
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer cus) {
		cs.addOrUpdateCustomer(cus);
		return cus;
	}
	
	@DeleteMapping("/customers/{id}")
	public String deleteCustomer(@PathVariable int id) {
		if(cs.getCustomer(id)==null) {
			throw new CustomerErrorException("Customer No found with id :"+id);
		}
		cs.deleteCustomer(id);
		return "Customer deleted successfully";
	}
}
