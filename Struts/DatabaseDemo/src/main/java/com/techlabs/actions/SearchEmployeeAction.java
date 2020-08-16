package com.techlabs.actions;

import java.sql.SQLException;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.models.Employee;
import com.techlabs.service.EmployeeJDBC;

public class SearchEmployeeAction extends ActionSupport {

	private String searchName;
	private List<Employee> employees;
	private EmployeeJDBC employeeJDBC;

	public SearchEmployeeAction() throws ClassNotFoundException, SQLException {

		employeeJDBC = new EmployeeJDBC();
	}

	@Override
	public String execute() throws Exception {

		employees = employeeJDBC.searchEmployees(searchName);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		return "success";
	}

	public String getSearchName() {
		return searchName;
	}

	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}

}
