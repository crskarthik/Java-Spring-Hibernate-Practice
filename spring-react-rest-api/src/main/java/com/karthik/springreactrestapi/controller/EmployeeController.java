package com.karthik.springreactrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.karthik.springreactrestapi.entity.Employee;
import com.karthik.springreactrestapi.service.EmployeeService;

@RestController
//@CrossOrigin(origins = {"http://localhost:3000/","http://localhost:3000/edit"})
@RequestMapping("/api/")
public class EmployeeController {
	@Autowired
	private EmployeeService es;

	@GetMapping("employees")
	public List<Employee> showEmps() {
		return es.findAll();
	}

	@GetMapping("employees/{id}")
	public Employee findEmp(@PathVariable int id) {
		return es.findById(id);
	}

	@PostMapping("employees")
	@ResponseBody
	public ResponseEntity<Object> saveEmp(@RequestBody Employee emp) {
		es.saveOrUpdateEmployee(emp);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PutMapping("employees")
	public ResponseEntity<Object> updateEmp(@RequestBody Employee emp) {
		es.saveOrUpdateEmployee(emp);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@DeleteMapping("employees/{id}")
	public List<Employee> deleteEmp(@PathVariable int id) {
		es.deleteEmployee(id);
		return es.findAll();
	}
}
