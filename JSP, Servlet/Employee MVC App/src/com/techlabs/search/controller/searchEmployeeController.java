package com.techlabs.search.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.employee.model.Employee;
import com.techlabs.employee.service.EmployeeService;

@WebServlet("/searcgEmployeeController")
public class searchEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if((session.getAttribute("username") == null)&&(session.getAttribute("password") == null)){
			response.sendRedirect("login.jsp");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("searchName");
		
		EmployeeService employeeService = EmployeeService.getEmployeeService();
		List<Employee> searchEmployees = employeeService.searchEmployees(name);
		
		if(searchEmployees !=null){
			Cookie searchNameCookie = new Cookie("searchNameCookie", request.getParameter("searchName"));
			searchNameCookie.setMaxAge(60*60*24);
			response.addCookie(searchNameCookie);
		}
		
		request.setAttribute("searchEmployees", searchEmployees);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("search.jsp");
		requestDispatcher.forward(request, response);
	}
}
