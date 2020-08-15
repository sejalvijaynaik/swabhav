package com.techlabs.actions;

import java.sql.SQLException;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.EmployeeJDBC;

public class UpdateEmployeeAction extends ActionSupport {

	private String name;
	private Double salary;
	private String designation;
	private EmployeeJDBC employeeJDBC;

	public UpdateEmployeeAction() throws ClassNotFoundException, SQLException {

		employeeJDBC = new EmployeeJDBC();
	}

	@Override
	public String execute() throws Exception {

		System.out.println();

		String idInString = ServletActionContext.getRequest().getParameter("employeeId");
		int id = Integer.parseInt(idInString);
		
		employeeJDBC.updateEmployee(id, name, salary, designation);

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
