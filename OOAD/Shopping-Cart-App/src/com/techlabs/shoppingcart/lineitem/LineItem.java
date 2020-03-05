package com.techlabs.shoppingcart.lineitem;

import com.techlabs.shoppingcart.product.Product;

public class LineItem {

	private int lineItemId;
	private int quantity = 0;
	private double cartPrice = 0;
	private Product product;

	public LineItem(int lineItemId, int quantity, Product product) {
		this.product = product;
		this.quantity = quantity;
		this.lineItemId = lineItemId;
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
		if (this.quantity - subtractQuantity >= 0)
			this.quantity = this.quantity - subtractQuantity;
	}

	@Override
	public boolean equals(Object obj) {
		LineItem lineItem = (LineItem)obj;
		if(this.lineItemId != lineItem.lineItemId) {
			return false;
		}
		if(!this.product.equals(lineItem.product)) {
			return false;
		}
		return true;
	}
}
