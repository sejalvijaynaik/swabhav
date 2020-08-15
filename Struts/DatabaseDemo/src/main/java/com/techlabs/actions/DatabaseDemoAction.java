package com.techlabs.actions;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.models.Employee;
import com.techlabs.service.EmployeeJDBC;

public class DatabaseDemoAction extends ActionSupport {
	
	private List<Employee> employees;
	private EmployeeJDBC employeeJDBC;
	
	public DatabaseDemoAction() throws ClassNotFoundException, SQLException {
		employeeJDBC = new EmployeeJDBC();
	}

	@Override
	public String execute() throws Exception {
		
		employees = employeeJDBC.getEmployees();
		return "success";

	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
}
