package com.karthik.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@RequestParam String name, Model model) {
//		String finalName = req.getParameter("name");
		name = name.toUpperCase();
		model.addAttribute("message",name);
		return "helloworld";
	}

}
