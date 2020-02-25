package com.techlabs.shoppingcart.customer;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.techlabs.shoppingcart.lineitem.LineItem;
import com.techlabs.shoppingcart.order.Order;
import com.techlabs.shoppingcart.product.Product;

class CustomerTest {

	@Test
	void test() {

		int expectedCustomerId = 1;
		String expectedCustometName = "sejal";
		String expectedProduct2Name = "top";
		
		Product product1 = new Product(001, "shoes", 500.0);
		LineItem lineItem1 = new LineItem(1, 2, product1);
		
		Product product2 = new Product(002, "top", 400.0);
		LineItem lineItem2 = new LineItem(2, 3, product2);
		
		List<LineItem> lineItems1 = new ArrayList<LineItem>();
		lineItems1.add(lineItem1);
		lineItems1.add(lineItem2);
		
		Order order1 = new Order(lineItems1);
		
		Product product3 = new Product(003, "pant", 600.0);
		LineItem lineItem3 = new LineItem(1, 3, product3);
		
		Product product4 = new Product(004, "bag", 200.0);
		LineItem lineItem4 = new LineItem(2, 2, product4);
		
		List<LineItem> lineItems2 = new ArrayList<LineItem>();
		lineItems2.add(lineItem3);
		lineItems2.add(lineItem4);
		
		Order order2 = new Order(lineItems1);
		
		List<Order> orders = new ArrayList<Order>();
		orders.add(order1);
		orders.add(order2);
		
		Customer customer = new Customer("sejal", orders);
		
		assertEquals(expectedCustomerId, customer.getCustomerId());
		assertEquals(expectedCustometName, customer.getName());
		assertEquals(expectedProduct2Name, customer.getOrders().get(0).getLineItems().get(1).getProduct().getProductName());
	}
}
