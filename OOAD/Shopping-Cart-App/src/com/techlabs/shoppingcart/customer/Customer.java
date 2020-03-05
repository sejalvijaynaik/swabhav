package com.techlabs.shoppingcart.customer;

import java.util.Date;
import java.util.List;
import com.techlabs.shoppingcart.order.Order;

public class Customer {

	private static int customerIdCount = 1;
	private int customerId;
	private String name;
	private List<Order> orders;
	private Date date;

	public Customer(String name, List<Order> orders, Date date) {
		this.name = name;
		this.orders = orders;
		this.date = date;
		customerId = customerIdCount;
		customerIdCount++;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getName() {
		return name;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public Date getDate() {
		return date;
	}

	public boolean checkOrderExists(int orderNumber) {

		boolean orderExists = false;
		for (Order order : orders) {

			if (order.getOrderId() == orderNumber)
				orderExists = true;
			return orderExists;
		}
		return orderExists;
	}

	public void addOrder(Order order) {
		orders.add(order);
	}

	public boolean checkOrderExists(Order order) {

		if(orders.contains(order)) {
			return true;
		}
		return false;
	}
}
