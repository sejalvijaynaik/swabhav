package com.techlabs.student.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.student.model.Student;
import com.techlabs.student.service.StudentService;

@WebServlet("/AdminPrepopulateController")
public class AdminPrepopulateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		String id = request.getParameter("studentId");
		
		StudentService studentService = StudentService.getStudentService();
		Student student = studentService.getStudent(id);
		
		request.setAttribute("student", student);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("adminUpdate.jsp");
		requestDispatcher.forward(request, response);
	}
}
