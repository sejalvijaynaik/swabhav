package com.techlabs.prepopulate.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.employee.model.Employee;
import com.techlabs.employee.service.EmployeeService;


@WebServlet("/PrepopulateEmployeeController")
public class PrepopulateEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if((session.getAttribute("username") == null)&&(session.getAttribute("password") == null)){
			response.sendRedirect("login.jsp");
		}
	}*/

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String id = request.getParameter("employeeId");
		
		EmployeeService employeeService = EmployeeService.getEmployeeService();
		Employee employee = employeeService.getEmployee(id);
		
		request.setAttribute("employee", employee);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("update.jsp");
		requestDispatcher.forward(request, response);
	}
}
