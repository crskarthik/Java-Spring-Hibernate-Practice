package com.karthik.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, ste);
	}
	
	@RequestMapping("/")
	public String showForm(Model theModel) {

		theModel.addAttribute("student",new Student());
		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student student,BindingResult br) {
		if(br.hasErrors()) {
			return "student-form";
		}
		return "studentProcessedForm";
	}
}
