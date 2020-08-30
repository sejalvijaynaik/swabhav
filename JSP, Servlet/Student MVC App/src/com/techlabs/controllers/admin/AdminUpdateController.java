package com.techlabs.controllers.admin;

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

@WebServlet("/adminUpdate")
public class AdminUpdateController extends HttpServlet {
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
		PrintWriter out = response.getWriter();
		double cgpa;

		// --------To type check for number-----------------------
		request.setAttribute("firstName", request.getParameter("firstName"));
		request.setAttribute("lastName", request.getParameter("lastName"));
		request.setAttribute("address", request.getParameter("address"));
		request.setAttribute("dob", request.getParameter("dob"));
		request.setAttribute("cgpa", request.getParameter("cgpa"));

		String decimalPattern = "([0-9]*)\\.([0-9]*)";
		if (!Pattern.matches(decimalPattern, request.getParameter("cgpa"))) {
			System.out.println("Not a number");
			out.println("<h2 style = 'color:red'>Enter number in cgpa</h2>");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("adminUpdate.jsp");
			requestDispatcher.include(request, response);
			return;
		}

		// --------------------------------------------------------------

		System.out.println("number");
		System.out.println("student d :" + student.getId());
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String address = request.getParameter("address");
		String dob = request.getParameter("dob");
		cgpa = Double.parseDouble(request.getParameter("cgpa"));

		studentService.updateStudent(student.getId(), firstName, lastName, address, dob, cgpa);

		response.sendRedirect("adminList");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		student = studentService.getStudent(request.getParameter("studentId"));

		// -------------To pre-populate form -------------------------------
		request.setAttribute("firstName", student.getFirstName());
		request.setAttribute("lastName", student.getLastName());
		request.setAttribute("address", student.getAddress());
		request.setAttribute("dob", student.getDob());
		request.setAttribute("cgpa", student.getCgpa());
		// --------------------------------------------------------------

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("adminUpdate.jsp");
		requestDispatcher.forward(request, response);
	}
}
