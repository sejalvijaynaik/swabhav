package com.techlabs.actions;

import java.sql.SQLException;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.EmployeeJDBC;

public class AddEmployeeAction extends ActionSupport {

	private EmployeeJDBC employeeJDBC;
	private String name;
	private Double salary;
	private String designation;

	public AddEmployeeAction() throws ClassNotFoundException, SQLException {
		employeeJDBC = new EmployeeJDBC();
	}

	@Override
	public String execute() throws Exception {

		employeeJDBC.addEmployee(name, salary, designation);
		return "success";

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
