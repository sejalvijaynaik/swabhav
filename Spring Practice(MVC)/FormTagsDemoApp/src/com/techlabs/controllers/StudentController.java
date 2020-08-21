package com.techlabs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.techlabs.models.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {

		Student student = new Student();

		model.addAttribute("student", student);

		return "form";

	}

	@RequestMapping("/register")
	public String register(@ModelAttribute("student") Student student) {

		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		System.out.println(student.getCountry());
		System.out.println(student.getFavLanguage());
		
		return "welcome";

	}
}
