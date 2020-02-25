package com.techlabs.shoppingcart.order;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.techlabs.shoppingcart.lineitem.LineItem;
import com.techlabs.shoppingcart.product.Product;

class OrderTest {

	@Test
	void testConstructorTwoParameters() {
		
		int expectedOrderId = 1;
		String expectedProduct2Name = "top";
		
		Product product1 = new Product(001, "shoes", 500.0);
		LineItem lineItem1 = new LineItem(1, 2, product1);
		
		Product product2 = new Product(002, "top", 400.0);
		LineItem lineItem2 = new LineItem(2, 3, product2);
		
		List<LineItem> lineItems = new ArrayList<LineItem>();
		lineItems.add(lineItem1);
		lineItems.add(lineItem2);
		
		Order order = new Order(lineItems);
		
		assertEquals(expectedOrderId, order.getOrderId());
		assertEquals(expectedProduct2Name, order.getLineItems().get(1).getProduct().getProductName());
				
	}

}
