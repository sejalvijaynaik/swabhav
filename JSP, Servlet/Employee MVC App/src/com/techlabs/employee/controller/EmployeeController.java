package com.techlabs.employee.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.employee.model.Employee;
import com.techlabs.employee.service.EmployeeService;

@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		EmployeeService employeeService = EmployeeService.getEmployeeService();
		request.setAttribute("employees", employeeService.getEmployees());

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee.jsp");
		requestDispatcher.forward(request, response);
	}
}
