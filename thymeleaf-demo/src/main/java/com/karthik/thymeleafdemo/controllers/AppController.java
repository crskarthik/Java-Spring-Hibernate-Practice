package com.karthik.thymeleafdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	@GetMapping("/hello")
	public String hello(Model theModel) {
		theModel.addAttribute("theDate", new java.util.Date());
		return "helloworld";
	}
}
