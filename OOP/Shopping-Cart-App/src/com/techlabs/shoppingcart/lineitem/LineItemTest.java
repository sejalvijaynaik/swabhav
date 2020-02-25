package com.techlabs.shoppingcart.lineitem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.shoppingcart.product.Product;

class LineItemTest {

	@Test
	void testConstructorTwoParameters() {
		
		int expectedProductId = 001;
		String expectedProductName = "shoes";
		double expectedProdctPrice = 500.0;
		
		int expectedLineItemId = 1;
		int expectedQuantity = 3;
		
		Product actualProduct = new Product(001, "shoes", 500.0);
		LineItem lineItem1 = new LineItem(1, 3, actualProduct);
		
		assertEquals(expectedProductId, actualProduct.getProductId());
		assertEquals(expectedProductName, actualProduct.getProductName());
		assertEquals(expectedProdctPrice, actualProduct.getProductPrice());
		
		assertEquals(expectedLineItemId, lineItem1.getLineItemId());
		assertEquals(expectedQuantity, lineItem1.getQuantity());
		System.out.println("testConstructorTwoParameters "+ lineItem1.getLineItemId());
	}
	
	@Test
	void testCalculatePrice() {
		
		Product expectedProduct = new Product(001, "shoes", 500.0);
		
		int expectedLineItemId = 1;
		int expectedQuantity = 3;
		double expectedCartPrice = 1500.0;
		
		Product actualProduct = new Product(001, "shoes", 500.0);
		
		LineItem lineItem = new LineItem(1, 3, actualProduct);
		lineItem.calculateCartPrice();
		
		assertEquals(expectedCartPrice, lineItem.getCartPrice());
		System.out.println("testCalculatePrice " + lineItem.getLineItemId());
	}
	
	@Test
	void testAddQuantity() {
		
		double expectedCartPrice = 2000.0;
		
		Product actualProduct = new Product(001, "shoes", 500.0);
		
		LineItem lineItem = new LineItem(1, 3, actualProduct);
		lineItem.calculateCartPrice();
		lineItem.addQuantity(1);
		lineItem.calculateCartPrice();
		
		assertEquals(expectedCartPrice, lineItem.getCartPrice());
		System.out.println("testAddQuantity " + lineItem.getLineItemId());
	}
	
	@Test
	void testSubstractQuantity() {
		
		
		double expectedCartPrice = 1500.0;
		
		Product actualProduct = new Product(001, "shoes", 500.0);
		
		LineItem lineItem = new LineItem(1, 3, actualProduct);
		lineItem.calculateCartPrice();
		lineItem.subtractQuantity(4);
		lineItem.calculateCartPrice();
		
		assertEquals(expectedCartPrice, lineItem.getCartPrice());
		System.out.println("testSubstractQuantity " + lineItem.getLineItemId());
	}
}
