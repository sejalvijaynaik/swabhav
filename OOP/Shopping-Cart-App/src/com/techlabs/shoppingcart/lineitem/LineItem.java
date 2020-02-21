package com.techlabs.shoppingcart.lineitem;

import com.techlabs.shoppingcart.product.Product;

public class LineItem {

	private static int lineItemIdCount = 1;
	private int lineItemId;
	private int quantity = 0;
	private double cartPrice = 0;
	private Product product;

	public LineItem(int quantity, Product product) {
		this.product = product;
		this.quantity = quantity;
		lineItemId = lineItemIdCount;
		lineItemIdCount++;
	}

	public int getLineItemId() {
		return lineItemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getCartPrice() {
		return cartPrice;
	}

	public Product getProduct() {
		return product;
	}

	public void calculateCartPrice() {
		cartPrice = quantity * product.getProductPrice();
	}

	public void addQuantity(int addQuantity) {
		this.quantity = this.quantity + addQuantity;
	}
	
	public void subtractQuantity(int subtractQuantity) {
		if(this.quantity - subtractQuantity >= 0)
		this.quantity = this.quantity - subtractQuantity;
	}
}
