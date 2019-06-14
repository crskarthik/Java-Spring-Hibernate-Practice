package com.karthik.spring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.karthik.spring.entity.Customer;
import com.karthik.spring.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		List<Customer> customers = customerService.getCustomers();
		theModel.addAttribute("customers", customers);
		return "list-customers";
	}

	@GetMapping("/showAddForm")
	public String addCustomer(Model theModel) {
		theModel.addAttribute("customer", new Customer());
		return "add-customer";
	}

	@GetMapping("/showUpdateForm")
	public String updateCustomer(@RequestParam("customerId") int id, Model theModel) {
		theModel.addAttribute("customer", customerService.getCustomer(id));
		return "update-customer";
	}

	@PostMapping(path = "/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.saveCustomer(customer);
		return "redirect:/customer/list";
	}

	@PostMapping(path = "/updateCustomer")
	public String updateCustomer(@ModelAttribute("customer") Customer customer) {
		System.out.println(customer);
		customerService.saveCustomer(customer);
		return "redirect:/customer/list";
	}

	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId")int id, Model theModel)
	{
		customerService.deleteCustomer(id);
		return "redirect:/customer/list";
	}

	@GetMapping("/{id}")
	public String viewCustomer(@PathVariable int id, Model theModel) {
		theModel.addAttribute("customer", customerService.getCustomer(id));
		return "view-customer";
	}
}
