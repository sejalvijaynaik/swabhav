package com.techlabs.actions;

import java.sql.SQLException;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.models.Employee;
import com.techlabs.service.EmployeeJDBC;

public class PrepopulateEmployeeAction extends ActionSupport {

	private Employee employee;
	private EmployeeJDBC employeeJDBC;

	public PrepopulateEmployeeAction() throws ClassNotFoundException, SQLException {

		employeeJDBC = new EmployeeJDBC();
	}

	@Override
	public String execute() throws Exception {
		
		String idInString = ServletActionContext.getRequest().getParameter("employeeId");
		int id = Integer.parseInt(idInString);
		
		employee = employeeJDBC.getEmployee(id);
		
		return "success";
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
