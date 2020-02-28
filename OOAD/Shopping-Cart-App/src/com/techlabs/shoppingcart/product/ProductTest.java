package com.techlabs.shoppingcart.product;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	void testProductConstructorThreeParameters() {
		
		int expectedProductId = 001;
		String expectedProductName = "shoes";
		double expectedProdctPrice = 500.0;
		
		Product product = new Product(001, "shoes", 500.0);
		
		assertEquals(expectedProductId, product.getProductId());
		assertEquals(expectedProductName, product.getProductName());
		assertEquals(expectedProdctPrice, product.getProductPrice());
	}
}
