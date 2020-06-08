package com.techlabs.sales.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import com.techlabs.sales.model.Customer;
import com.techlabs.sales.model.Merchant;
import com.techlabs.sales.service.SalesTransactionService;

@WebServlet("/SalesTransactionController")
public class SalesTransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Resource(name = "jdbc/sales")
	private DataSource dataSource;
	private SalesTransactionService salesTransactionService;

	@Override
	public void init() throws ServletException {
		super.init();
		salesTransactionService = new SalesTransactionService(dataSource);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String merchantName = request.getParameter("merchantName");
		int customerId = Integer.parseInt(request.getParameter("customerId"));
		double amount = Double.parseDouble(request.getParameter("amount"));

		Merchant oldMerchant = salesTransactionService.getMerchant(merchantName);
		Customer oldCustomer = salesTransactionService.getCustomer(customerId);

		boolean transactSuccessful = salesTransactionService.transact(merchantName, customerId, amount);

		Merchant newMerchant = salesTransactionService.getMerchant(merchantName);
		Customer newCustomer = salesTransactionService.getCustomer(customerId);

		request.setAttribute("oldMerchant", oldMerchant);
		request.setAttribute("oldCustomer", oldCustomer);
		request.setAttribute("newMerchant", newMerchant);
		request.setAttribute("newCustomer", newCustomer);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("checkout.jsp");

		if (transactSuccessful == false) {
			out.println("Customer balance too low...transaction unsuccessful");
			requestDispatcher.include(request, response);
		} else {
			requestDispatcher.forward(request, response);
		}
	}
}
