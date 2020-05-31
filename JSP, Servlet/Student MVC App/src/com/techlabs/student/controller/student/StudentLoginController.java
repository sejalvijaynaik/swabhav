package com.techlabs.student.controller.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.student.model.Student;
import com.techlabs.student.service.StudentService;

@WebServlet("/StudentLoginController")
public class StudentLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		StudentService studentService = StudentService.getStudentService();
		List<Student> students = studentService.getStudents();

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();

		for (Student tempStudent : students) {
			if ((request.getParameter("firstName").equals(tempStudent.getFirstName()))
					&& (request.getParameter("lastName").equals(tempStudent.getLastName()))) {
				session.setAttribute("username", "username");
				session.setAttribute("password", "password");
				session.setMaxInactiveInterval(60*60*24);
				studentService.setSpecificId(tempStudent);
				response.sendRedirect("StudentStudentController");
				return;
			} else {
				out.println("Wrong username or password");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("studentLogin.jsp");
				requestDispatcher.include(request, response);
				return;
			}
		}
	}

}
