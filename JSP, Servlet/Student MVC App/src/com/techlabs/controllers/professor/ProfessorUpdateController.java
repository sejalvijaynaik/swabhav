package com.techlabs.controllers.professor;

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

@WebServlet("/professorUpdate")
public class ProfessorUpdateController extends HttpServlet {
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

		request.setAttribute("cgpa", request.getParameter("cgpa"));

		String decimalPattern = "([0-9]*)\\.([0-9]*)";
		if (!Pattern.matches(decimalPattern, request.getParameter("cgpa"))) {
			System.out.println("Not a number");
			out.println("<h2 style = 'color:red'>Enter number in cgpa</h2>");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("professorUpdate.jsp");
			requestDispatcher.include(request, response);
			return;
		}

		// --------------------------------------------------------------

		System.out.println("number");
		System.out.println("student id :" + student.getId());
		cgpa = Double.parseDouble(request.getParameter("cgpa"));

		studentService.updateCgpa(student.getId(), cgpa);

		response.sendRedirect("professorList");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		student = studentService.getStudent(request.getParameter("studentId"));
		request.setAttribute("student", student);

		// -------------To pre-populate form -------------------------------

		request.setAttribute("cgpa", student.getCgpa());

		// --------------------------------------------------------------

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("professorUpdate.jsp");
		requestDispatcher.forward(request, response);
	}

}
