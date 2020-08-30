package com.techlabs.employee.service;

import java.util.List;
import com.techlabs.employee.dao.LoginEmployeeDAO;
import com.techlabs.employee.model.LoginEmployee;

public class LoginEmployeeService {

	private LoginEmployeeDAO loginEmployeeDAO;

	public LoginEmployeeService() {
		loginEmployeeDAO = new LoginEmployeeDAO();
	}

	public List<LoginEmployee> getLoginEmployees() {
		return loginEmployeeDAO.getLoginEmployees();
	}

	public boolean isValid(String username, String pasword) {

		List<LoginEmployee> loginEmployees = loginEmployeeDAO.getLoginEmployees();

		for (LoginEmployee loginEmployee : loginEmployees) {
			if ((username.equals(loginEmployee.getUsername())) && (pasword.equals(loginEmployee.getPassword()))) {
				return true;
			}
		}
		return false;
	}

}
