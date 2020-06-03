package com.techlabs.salary.increment.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SalaryIncrementTest {
public static void main(String[] args) throws SQLException {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet res = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav", "root", "root");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the employee number whose need to be incremented by 20%");
			int empno = sc.nextInt();
			
			System.out.println("Before incrementing");
			stmt = conn.prepareStatement("select * from emp where empno = ?");
			stmt.setInt(1, empno);
			res = stmt.executeQuery();
			
			res.next();
			System.out.println("Name : " + res.getString("ename"));
			System.out.println("Job : " + res.getString("job"));
			System.out.println("Manager : " + res.getInt("mgr"));
			System.out.println("Hire Date : " + res.getDate("hiredate"));
			System.out.println("Salary : " + res.getDouble("sal"));
			System.out.println("Commision : " + res.getDouble("comm"));
			System.out.println("Department No : " + res.getInt("deptno"));
			res.close();
			
			stmt = conn.prepareStatement("update emp set sal = sal * 1.2 where empno = ?");
			stmt.setInt(1, empno);
			stmt.executeUpdate();
			
			System.out.println("After incrementing");
			stmt = conn.prepareStatement("select * from emp where empno = ?");
			stmt.setInt(1, empno);
			res = stmt.executeQuery();
			
			res.next();
			System.out.println("Name : " + res.getString("ename"));
			System.out.println("Job : " + res.getString("job"));
			System.out.println("Manager : " + res.getInt("mgr"));
			System.out.println("Hire Date : " + res.getDate("hiredate"));
			System.out.println("Salary : " + res.getDouble("sal"));
			System.out.println("Commision : " + res.getDouble("comm"));
			System.out.println("Department No : " + res.getInt("deptno"));
			
			sc.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if (res != null) {
				res.close();
			}
		}
	}
}
