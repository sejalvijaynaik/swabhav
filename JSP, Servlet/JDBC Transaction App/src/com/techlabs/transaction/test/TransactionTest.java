package com.techlabs.transaction.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionTest {
	
	public static void main(String[] args) throws SQLException {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sales", "root", "root");
			conn.setAutoCommit(false);
			showTables(conn, "merchant");
			showTables(conn, "customer");
			
			stmt = conn.createStatement();
			
			stmt.executeUpdate("update merchant set balance = balance + 1000.00 where id = 1");
			stmt.executeUpdate("update customer set balance = balance - 1000.00 where id = 1");
			
			conn.commit();
			
			showTables(conn, "merchant");
			showTables(conn, "customer");
			
		} catch (SQLException e) {
			conn.rollback();
			showTables(conn, "merchant");
			showTables(conn, "customer");
			e.printStackTrace();
		}
	}
	
	public static void showTables(Connection conn, String tableName) {
		PreparedStatement pstmt = null;
		ResultSet res = null;
		
		try {
			pstmt = conn.prepareStatement("select * from " + tableName);
			res = pstmt.executeQuery();
			res.next();
			System.out.println("Details of table : " + tableName);
			System.out.print(res.getInt("id") + ", ");
			System.out.print(res.getString("name") + ", ");
			System.out.println(res.getDouble("balance"));
			System.out.println();
			res.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}






