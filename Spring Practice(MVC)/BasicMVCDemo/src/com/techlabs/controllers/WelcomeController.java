package com.techlabs.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("welcome")
public class WelcomeController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "form";
	}
	
	@RequestMapping("/welcomeSimple")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping("/welcomeUpperCase")
	public String welcomeUperCase(HttpServletRequest request, Model model) {
		
		String myName = request.getParameter("myName");
		myName = myName.toUpperCase();
		model.addAttribute("myName", myName);
		
		return "welcome";
	}
	@RequestMapping("/welcomeRequestParam")
	public String welcomeRequestParam(@RequestParam("myName")String myName, Model model) {
		
		myName = myName.toUpperCase();
		model.addAttribute("myName", myName);
		
		return "welcome";
	}
}
