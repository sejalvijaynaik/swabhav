package com.techlabs.actions;

import java.sql.SQLException;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.EmployeeJDBC;

public class DeleteEmployeeAction extends ActionSupport {

	private EmployeeJDBC employeeJDBC;

	public DeleteEmployeeAction() throws ClassNotFoundException, SQLException {

		employeeJDBC = new EmployeeJDBC();
	}

	@Override
	public String execute() throws Exception {

		String idInString = ServletActionContext.getRequest().getParameter("employeeId");
		int id = Integer.parseInt(idInString);

		System.out.println(id);
		employeeJDBC.deleteEmployee(id);
		return "success";

	}

}
