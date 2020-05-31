package com.techlabs.student.controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.student.service.StudentService;

@WebServlet("/AdminDeleteController")
public class AdminDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getContentType();

		String id = request.getParameter("studentId");

		StudentService studentService = StudentService.getStudentService();
		studentService.deleteStudent(id);

		response.sendRedirect("AdminStudentController");
	}

}
