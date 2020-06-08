package com.techlabs.sql.injection.employee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.techlabs.model.employee.Employee;

@WebServlet("/SQLInjectionEmployee")
public class SQLInjectionEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Resource(name = "jdbc/swabhav")
	private DataSource dataSource;
	private Connection conn;
	private Statement stmt;
	private ResultSet res;

	@Override
	public void init() throws ServletException {
		super.init();
		try {
			conn = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Employee> employees = new ArrayList<Employee>();
		String empno = request.getParameter("empno");
		try {
			stmt = conn.createStatement();
			res = stmt.executeQuery("select * from emp where empno = " + empno);
			while (res.next()) {
				int employeeNumber = res.getInt("empno");
				String ename = res.getString("ename");
				String job = res.getString("job");
				int mgr = res.getInt("mgr");
				Date hiredate = res.getDate("hiredate");
				double salary = res.getDouble("sal");
				double comm = res.getDouble("comm");
				int deptno = res.getInt("deptno");
				Employee employee = new Employee(employeeNumber, ename, job, mgr, hiredate, salary, comm, deptno);
				System.out.println(employee.getEname());
				employees.add(employee);
			}
			request.setAttribute("employees", employees);

			RequestDispatcher requestDispatcher = request.getRequestDispatcher("welcome.jsp");
			requestDispatcher.forward(request, response);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
