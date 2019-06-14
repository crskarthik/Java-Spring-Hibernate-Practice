package com.karthik.spring.security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	@GetMapping("/accessDenied")
	public String denied() {
		return "accessDenied";
	}

	@GetMapping("/showLogin")
	public String loginPage() {
		return "login";
	}

	@GetMapping("/managers")
	public String managers() {
		return "forManagers";
	}

	@GetMapping("/admin")
	public String admin() {
		return "forAdmin";
	}

	@GetMapping("/")
	public String showHome() {
		return "home";
	}
}
