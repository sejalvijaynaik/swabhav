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

@WebServlet("/StudentPrepopulateController")
public class StudentPrepopulateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		
		StudentService studentService = StudentService.getStudentService();
		Student student = studentService.getSpecificId();
		
		request.setAttribute("student", student);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("studentUpdate.jsp");
		requestDispatcher.forward(request, response);
	}

}
