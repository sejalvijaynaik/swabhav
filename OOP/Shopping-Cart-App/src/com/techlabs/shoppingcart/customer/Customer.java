package com.techlabs.shoppingcart.customer;

import java.util.List;
import com.techlabs.shoppingcart.order.Order;

public class Customer {

	private static int customerIdCount = 1;
	private int customerId;
	private String name;
	private List<Order> orders;

	public Customer(String name, List<Order> orders) {
		this.name = name;
		this.orders = orders;
		customerId = customerIdCount;
		customerId++;
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
}
