package com.techlabs.controllers.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.student.service.StudentService;

@WebServlet("/adminList")
public class AdminListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		response.setContentType("text/html");

		StudentService studentService = StudentService.getStudentService();
		request.setAttribute("students", studentService.getStudents());

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("adminList.jsp");
		requestDispatcher.forward(request, response);
	}

}
