package com.techlabs.student.controller.student;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.student.model.Student;
import com.techlabs.student.service.StudentService;

@WebServlet("/StudentSearchController")
public class StudentSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("searchName");

		StudentService studentService = StudentService.getStudentService();
		List<Student> searchStudents = studentService.searchStudents(name);

		if (searchStudents != null) {
			Cookie searchNameCookie = new Cookie("searchNameCookie", request.getParameter("searchName"));
			searchNameCookie.setMaxAge(60 * 60 * 24);
			response.addCookie(searchNameCookie);
		}

		request.setAttribute("searchStudents", searchStudents);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("studentSearch.jsp");
		requestDispatcher.forward(request, response);
	}

}
