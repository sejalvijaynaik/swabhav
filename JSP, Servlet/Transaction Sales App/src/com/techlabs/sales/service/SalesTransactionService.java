package com.techlabs.sales.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.techlabs.sales.model.Customer;
import com.techlabs.sales.model.Merchant;

public class SalesTransactionService {

	private DataSource dataSource;

	public SalesTransactionService(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public Merchant getMerchant(String merchantName) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;

		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement("select * from merchant where name = ?");
			pstmt.setString(1, merchantName);
			res = pstmt.executeQuery();
			res.next();
			int id = res.getInt("id");
			String name = res.getString("name");
			double balance = res.getDouble("balance");
			Merchant merchant = new Merchant(id, name, balance);
			return merchant;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeWithPreparedStatement(conn, pstmt, res);
		}
		return null;
	}

	public Customer getCustomer(int customerId) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;

		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement("select * from customer where id = ?");
			pstmt.setInt(1, customerId);
			res = pstmt.executeQuery();
			res.next();
			int id = res.getInt("id");
			String name = res.getString("name");
			double balance = res.getDouble("balance");
			Customer customer = new Customer(id, name, balance);
			return customer;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeWithPreparedStatement(conn, pstmt, res);
		}
		return null;
	}

	public boolean transact(String merchantName, int customerId, double amount) {

		if (checkBalance(customerId, amount) == false) {
			return false;
		}
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = dataSource.getConnection();
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement("update merchant set balance = balance + ? where name = ?");
			pstmt.setDouble(1, amount);
			pstmt.setString(2, merchantName);
			pstmt.executeUpdate();
			pstmt.close();
			pstmt = conn.prepareStatement("update customer set balance = balance - ? where id = ?");
			pstmt.setDouble(1, amount);
			pstmt.setInt(2, customerId);
			pstmt.executeUpdate();
			conn.commit();
			return true;

		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			closeWithPreparedStatement(conn, pstmt, null);
		}
		return false;
	}

	public boolean checkBalance(int customerId, double amount) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;

		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement("select * from customer where id = ?");
			pstmt.setInt(1, customerId);
			res = pstmt.executeQuery();
			res.next();
			double balance = res.getDouble("balance");
			if ((balance - amount) < 0) {
				return false;
			} else {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeWithPreparedStatement(conn, pstmt, res);
		}
		return false;
	}

	public void closeWithPreparedStatement(Connection conn, PreparedStatement pstmt, ResultSet res) {
		try {
			if (res != null) {
				res.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
