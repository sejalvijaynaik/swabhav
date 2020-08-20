package com.techlabs.actions;

import java.sql.SQLException;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.daos.EmployeeDao;
import com.techlabs.viewModels.Employee;

public class EmployeeListAction extends ActionSupport {

	private EmployeeDao employeeDao;
	private List<Employee> employees;

	public EmployeeListAction() throws ClassNotFoundException, SQLException {
		employeeDao = new EmployeeDao();
	}

	@Override
	public String execute() throws Exception {

		System.out.println("EmployeeListAction execute running");
		employees = employeeDao.getEmployees();
		return "success";
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
