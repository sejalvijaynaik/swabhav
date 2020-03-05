package com.techlabs.shoppingcart.order;

import java.util.List;
import com.techlabs.shoppingcart.lineitem.LineItem;

public class Order {

	private static int orderIdCount = 1;
	private int orderId;
	private List<LineItem> lineItems;
	private double totalOrderPrice;

	
	public Order(int orderId) {
		this.orderId = orderId;
	}

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

	public double getTotalOrderPrice() {
		return totalOrderPrice;
	}

	public double calculateTotalOrderPrice() {

		totalOrderPrice = 0;
		for (LineItem lineItem : lineItems) {
			totalOrderPrice = totalOrderPrice + lineItem.getCartPrice();
		}
		return totalOrderPrice;
	}

	public void addLineItem(LineItem lineItem) {

		lineItems.add(lineItem);
	}

	public boolean lineItemExists(LineItem lineItem) {

		if (lineItems.contains(lineItem)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean equals(Object obj) {

		Order order = (Order) obj;

		if (this.orderId != order.orderId) {
			return false;
		}
		return true;
	}
}
