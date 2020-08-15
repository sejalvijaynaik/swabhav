package com.techlabs.actions;

import java.sql.SQLException;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.EmployeeJDBC;

public class PrepopulateEmployeeAction extends ActionSupport {

	private EmployeeJDBC employeeJDBC;

	public PrepopulateEmployeeAction() throws ClassNotFoundException, SQLException {
		employeeJDBC = new EmployeeJDBC();
	}

	@Override
	public String execute() throws Exception {

		System.out.println(ServletActionContext.getRequest().getParameter("employeeId"));
		return "lala";
	}

}
