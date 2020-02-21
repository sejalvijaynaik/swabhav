package com.techlabs.shoppingcart.order;

import java.util.List;
import com.techlabs.shoppingcart.lineitem.LineItem;

public class Order {

	private static int orderIdCount = 1;
	private int orderId;
	private List<LineItem> lineItems;

	public Order(List<LineItem> lineItems) {
		this.lineItems = lineItems;
		orderId = orderIdCount;
		orderIdCount++;
	}

	public int getOrderId() {
		return orderId;
	}

	public List<LineItem> getLineItems() {
		return lineItems;
	}
}
