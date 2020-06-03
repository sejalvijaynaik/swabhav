package com.techlabs.department.dump.csv.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DepartmentCSVDumpTest {

	public static void main(String[] args) throws IOException {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;
		
		File file = new File("files/dept-dump.csv");
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write("deptid,deptname,empid,empname,salary");
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/department", "root", "root");
			stmt = conn.createStatement();
			res = stmt.executeQuery("select * from dept");
			
			while(res.next()) {
				bufferedWriter.newLine();
				bufferedWriter.write(res.getInt("deptid") + ",");
				bufferedWriter.write(res.getString("deptname") + ",");
				bufferedWriter.write(res.getInt("empid") + ",");
				bufferedWriter.write(res.getString("empname") + ",");
				bufferedWriter.write(String.valueOf(res.getDouble("salary")));
				System.out.print(res.getInt("deptid") + ",");
				System.out.print(res.getString("deptname") + ",");
				System.out.print(res.getInt("empid") + ",");
				System.out.print(res.getString("empname") + ",");
				System.out.print(String.valueOf(res.getDouble("salary")));
				System.out.println();
			}
			
			bufferedWriter.close();
			fileWriter.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
