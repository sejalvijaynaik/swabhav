package com.techlabs.controllers.admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.techlabs.student.service.StudentService;

@WebServlet("/adminLogin")
public class AdminLoginController extends HttpServlet {
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

		System.out.println(request.getParameter("username"));
		System.out.println(request.getParameter("password"));

		if ((request.getParameter("username") != null) && (request.getParameter("password") != null)) {
			if (studentService.isValidAdmin(request.getParameter("username"), request.getParameter("password"))) {

				session.setAttribute("userType", "admin");
				session.setMaxInactiveInterval(60 * 60 * 24);

				response.sendRedirect("adminList");
			} else {
				out.println("<h2 style = 'color:red'>Username or password entered is wrong</h2>");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("adminLogin.jsp");
				requestDispatcher.include(request, response);
			}
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("adminLogin.jsp");
		requestDispatcher.include(request, response);
	}
}
