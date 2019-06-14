package com.karthik.thymeleafdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.karthik.thymeleafdemo.dao.EmployeeJPARepository;
import com.karthik.thymeleafdemo.entity.Employee;

@Controller
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeJPARepository es;

	@GetMapping("/employees")
	public String getEmployees(Model theModel) {
		theModel.addAttribute("employees", es.findAllByOrderByLastNameAsc());
		return "employees/employeeList";
	}

	@GetMapping("/employees/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		theModel.addAttribute("employee", new Employee());
		return "employees/employee-form";
	}

	@GetMapping("/employees/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("id") int id,
			Model theModel) {
		theModel.addAttribute("employee", es.findById(id));
		return "employees/employee-form";
	}

	@PostMapping("/employees/save")
	public String save(@ModelAttribute("employee") Employee emp) {
		es.save(emp);
		return "redirect:/api/employees";
	}

	@GetMapping("/employees/delete")
	public String delete(@RequestParam("id") int id) {
		es.deleteById(id);
		return "redirect:/api/employees";
	}
}
