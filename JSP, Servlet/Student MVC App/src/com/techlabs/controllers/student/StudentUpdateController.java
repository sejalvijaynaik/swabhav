package com.techlabs.controllers.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.techlabs.model.Student;
import com.techlabs.student.service.StudentService;

@WebServlet("/studentUpdate")
public class StudentUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Student student = null;
	private StudentService studentService;

	@Override
	public void init() throws ServletException {
		super.init();
		studentService = StudentService.getStudentService();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		System.out.println("student id :" + student.getId());
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String address = request.getParameter("address");
		String dob = request.getParameter("dob");

		studentService.updateForStudent(student.getId(), firstName, lastName, address, dob);

		response.sendRedirect("studentList");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		student = studentService.getStudent(request.getParameter("studentId"));
		
		request.setAttribute("student", student);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("studentUpdate.jsp");
		requestDispatcher.forward(request, response);
	}

}
