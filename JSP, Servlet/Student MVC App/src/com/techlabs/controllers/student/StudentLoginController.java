package com.techlabs.controllers.student;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.techlabs.student.service.StudentService;

@WebServlet("/studentLogin")
public class StudentLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentService studentService;

	@Override
	public void init() throws ServletException {
		super.init();
		studentService = StudentService.getStudentService();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession();

		System.out.println(request.getParameter("firstName"));
		System.out.println(request.getParameter("lastName"));

		if ((request.getParameter("firstName") != null) && (request.getParameter("lastName") != null)) {
			if (studentService.isValidStudent(request.getParameter("firstName"), request.getParameter("lastName"))) {

				session.setAttribute("userType", "student");
				session.setMaxInactiveInterval(60 * 60 * 24);

				ServletContext application = getServletConfig().getServletContext();
				application.setAttribute("studentId", studentService.getStudentId(request.getParameter("firstName"),
						request.getParameter("lastName")));

				response.sendRedirect("studentList");
			} else {
				out.println("<h2 style = 'color:red'>First name or last name is wrong</h2>");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("studentLogin.jsp");
				requestDispatcher.include(request, response);
			}
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("studentLogin.jsp");
		requestDispatcher.include(request, response);
	}
}
