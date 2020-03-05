package com.techlabs.shoppingcart.product;

public class Product {

	private int productId;
	private String productName;
	private double productPrice;

	public Product(int productId, String productName, double productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	@Override
	public boolean equals(Object obj) {

		Product product = (Product) obj;

		if (this.productId != product.productId) {
			return false;
		}
		if (!this.productName.equalsIgnoreCase(product.productName)) {
			return false;
		}
		if (this.productPrice != product.productPrice) {
			return false;
		}
		return true;
	}
}
