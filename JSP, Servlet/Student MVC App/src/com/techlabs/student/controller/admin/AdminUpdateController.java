package com.techlabs.student.controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.student.service.StudentService;

@WebServlet("/AdminUpdateController")
public class AdminUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		String id = request.getParameter("ID");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String address = request.getParameter("address");
		String dob = request.getParameter("dob");
		double cgpa = Double.parseDouble(request.getParameter("cgpa"));
		
		StudentService studentService = StudentService.getStudentService();
		studentService.updateStudent(id, firstName, lastName, address, dob, cgpa);
		
		response.sendRedirect("AdminStudentController");
	}

}
