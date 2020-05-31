package com.techlabs.student.controller.student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.student.model.Student;
import com.techlabs.student.service.StudentService;

@WebServlet("/StudentStudentController")
public class StudentStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		StudentService studentService = StudentService.getStudentService();
		request.setAttribute("students", studentService.getStudents());
		request.setAttribute("student", studentService.getSpecificId());

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("studentStudents.jsp");
		requestDispatcher.forward(request, response);
	}
}
