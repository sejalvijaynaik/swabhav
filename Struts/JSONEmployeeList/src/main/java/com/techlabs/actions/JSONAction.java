package com.techlabs.actions;

import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.model.Employee;
import com.techlabs.service.EmployeeService;

public class JSONAction extends ActionSupport {

	private List<Employee> employees;

	@Override
	public String execute() throws Exception {

		System.out.println("action execute running");
		EmployeeService employeeService = EmployeeService.getEmployeeService();
		employees = employeeService.getEmployees();
		System.out.println(employees.size());

		return "success";
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
