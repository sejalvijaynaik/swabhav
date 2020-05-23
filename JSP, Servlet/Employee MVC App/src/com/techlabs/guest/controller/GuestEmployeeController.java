package com.techlabs.guest.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.employee.service.EmployeeService;

@WebServlet("/GuestEmployeeController")
public class GuestEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");

		EmployeeService employeeService = EmployeeService.getEmployeeService();
		request.setAttribute("employees", employeeService.getEmployees());

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("guestEmployee.jsp");
		requestDispatcher.forward(request, response);
	}
}
