package com.karthik.springBootDemo.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	@GetMapping("/")
	public String sayHelloWorld() {
		return "Hello world <br>"+LocalDateTime.now();
	}
	
	@GetMapping("/test")
	public String test() {
		return "Hello test <br>"+LocalDateTime.now();
	}
}
