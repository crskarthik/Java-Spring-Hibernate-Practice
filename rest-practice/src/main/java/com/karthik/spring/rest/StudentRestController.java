package com.karthik.spring.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karthik.spring.entity.Student;
import com.karthik.spring.entity.StudentErrorResponse;
import com.karthik.spring.exceptions.ObjectNotFoundException;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> students;

	@PostConstruct
	public void LoadData() {
		students = new ArrayList<>();
		students.add(new Student(1, "Karthik", "Chinta"));
		students.add(new Student(2, "Srikar", "Chinta"));
		students.add(new Student(3, "Raja", "Chinta"));
	}

	@GetMapping("/students")
	public List<Student> getStudents() {

		return students;
	}

	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {

		if (studentId >= students.size() || studentId < 0) {
			throw new ObjectNotFoundException(
					"Student id not found : " + studentId);
		}
		return students.get(studentId);

	}

}
