package com.techlabs.shoppingcart.analyzer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.techlabs.shoppingcart.customer.Customer;
import com.techlabs.shoppingcart.lineitem.LineItem;
import com.techlabs.shoppingcart.order.Order;
import com.techlabs.shoppingcart.product.Product;

public class ShoppingCartAnalyzer {

	public void addCustomer() {

		LineItem lineItem1 = new LineItem(1, 3, new Product(001, "Book", 120.0));
		lineItem1.calculateCartPrice();
		LineItem lineItem2 = new LineItem(2, 2, new Product(002, "Shoes", 250.0));
		lineItem2.calculateCartPrice();
		LineItem lineItem3 = new LineItem(3, 4, new Product(003, "Top", 300.0));
		lineItem3.calculateCartPrice();

		List<LineItem> lineItems1 = new ArrayList<LineItem>();
		lineItems1.add(lineItem1);
		lineItems1.add(lineItem2);
		lineItems1.add(lineItem3);

		Order order1 = new Order(lineItems1);
		order1.calculateTotalOrderPrice();

		LineItem lineItem4 = new LineItem(4, 2, new Product(004, "bag", 500.0));
		lineItem4.calculateCartPrice();
		LineItem lineItem5 = new LineItem(5, 3, new Product(005, "pen", 5.0));
		lineItem5.calculateCartPrice();
		LineItem lineItem6 = new LineItem(6, 3, new Product(006, "pant", 800.0));
		lineItem6.calculateCartPrice();

		List<LineItem> lineItems2 = new ArrayList<LineItem>();
		lineItems2.add(lineItem4);
		lineItems2.add(lineItem5);
		lineItems2.add(lineItem6);

		Order order2 = new Order(lineItems2);
		order2.calculateTotalOrderPrice();

		List<Order> orders = new ArrayList<Order>();
		orders.add(order1);
		orders.add(order2);

		Customer customer = new Customer("abc", orders, new Date());

		printCustomer(customer);
		changeQuantity(customer);

	}

	public void changeQuantity(Customer customer) {

		int quantity = 2;
		int orderId = 1;

		Product product = new Product(001, "Book", 120.0);
		Order order = new Order(orderId);

		for (int i = 0; i < customer.getOrders().size(); i++) {

			if (customer.getOrders().get(i).equals(order)) {

				for (int j = 0; j < customer.getOrders().get(i).getLineItems().size(); j++) {

					if (customer.getOrders().get(i).getLineItems().get(j).getProduct().equals(product)) {

						customer.getOrders().get(i).getLineItems().get(j).addQuantity(quantity);
						customer.getOrders().get(i).getLineItems().get(j).calculateCartPrice();
						customer.getOrders().get(i).calculateTotalOrderPrice();
						printCustomer(customer);
						return;
					}
				}
			}
		}
		LineItem lineItem = new LineItem(1, quantity, product);
		lineItem.calculateCartPrice();
		List<LineItem> lineItems = new ArrayList<LineItem>();
		lineItems.add(lineItem);
		Order order2 = new Order(lineItems);
		order2.calculateTotalOrderPrice();
		customer.addOrder(order2);

		printCustomer(customer);
		return;
	}

	public static void printLineItems(LineItem lineItem) {

		System.out.print("\nNo.: " + lineItem.getLineItemId());
		System.out.print("   Quantity :" + lineItem.getQuantity());
		System.out.print("   Total Price :" + lineItem.getCartPrice());
		System.out.print("   Product Id :" + lineItem.getProduct().getProductId());
		System.out.print("   Product name :" + lineItem.getProduct().getProductName());
		System.out.print("   Product price :" + lineItem.getProduct().getProductPrice());
		System.out.println();
	}

	public static void printOrders(Order order) {

		System.out.println("\n-----Order details-----");
		System.out.println("Order Id :" + order.getOrderId());
		for (LineItem tempLineItem : order.getLineItems()) {
			printLineItems(tempLineItem);
		}
		System.out.println();
		System.out.println("Total Order Price : " + order.getTotalOrderPrice());
	}

	public static void printCustomer(Customer customer) {

		System.out.println("\n-----Customer Details Order-----");
		System.out.print("Customer Id :" + customer.getCustomerId());
		System.out.print("   Name : " + customer.getName());
		System.out.println("   Date :" + customer.getDate());
		for (Order tempOrder : customer.getOrders()) {
			printOrders(tempOrder);
		}
	}
}
