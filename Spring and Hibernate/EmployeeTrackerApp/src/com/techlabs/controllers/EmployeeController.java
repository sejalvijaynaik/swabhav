package com.techlabs.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techlabs.entities.Employee;
import com.techlabs.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/list")
	public String listEmployees(Model model) {

		List<Employee> employees = employeeService.getEmployees();

		model.addAttribute("employees", employees);

		return "list";
	}

	@GetMapping("/addForm")
	public String showAddForm(Model model) {

		Employee employee = new Employee();

		model.addAttribute("employee", employee);

		return "employee-form";
	}

	@PostMapping("/addOrUpdate")
	public String addOrUpdateEmployee(@ModelAttribute("employee") Employee employee) {

		employeeService.addEmployee(employee);

		return "redirect:/employee/list";
	}

	@GetMapping("/updateForm")
	public String showUpdateFormAndPrepopulate(@RequestParam("employeeId") int employeeId, Model model) {

		Employee employee = employeeService.getEmployee(employeeId);

		model.addAttribute("employee", employee);

		return "employee-form";
	}

	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("employeeId") int employeeId) {

		employeeService.deleteEmplyee(employeeId);

		return "redirect:/employee/list";
	}

	@GetMapping("/search")
	public String searchEmployee(@RequestParam("searchName") String searchName, Model model) {

		List<Employee> employees = employeeService.searchEmployees(searchName);

		model.addAttribute("employees", employees);

		return "list";
	}
}
