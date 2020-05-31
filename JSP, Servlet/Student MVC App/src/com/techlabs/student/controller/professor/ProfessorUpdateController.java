package com.techlabs.student.controller.professor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.student.service.StudentService;

@WebServlet("/ProfessorUpdateController")
public class ProfessorUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		String id = request.getParameter("ID");
		double cgpa = Double.parseDouble(request.getParameter("cgpa"));
		
		StudentService studentService = StudentService.getStudentService();
		studentService.updateCgpa(id, cgpa);
		
		response.sendRedirect("ProfessorStudentController");
	}

}
