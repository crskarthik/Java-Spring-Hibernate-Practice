package com.karthik.springbootemployeeproject.controller;

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
import com.karthik.springbootemployeeproject.entity.Employee;
import com.karthik.springbootemployeeproject.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	private EmployeeService es;

	@Autowired
	public EmployeeController(EmployeeService es) {
		this.es = es;
	}

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return es.findAll();
	}

	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return es.getEmployee(id);
	}

	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee emp) {
		emp.setId(0);
		es.saveOrUpdateEmployee(emp);
		return emp;
	}

	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee emp) {
		es.saveOrUpdateEmployee(emp);
		return emp;
	}

	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable int id) {
		if (es.getEmployee(id) != null) {
			es.deleteEmployee(id);
			return "Employee deleted";
		} else {
			return "Employee not found";
		}
	}
}
