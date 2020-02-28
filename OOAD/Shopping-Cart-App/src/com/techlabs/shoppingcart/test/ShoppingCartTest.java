package com.techlabs.shoppingcart.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.techlabs.shoppingcart.customer.Customer;
import com.techlabs.shoppingcart.lineitem.LineItem;
import com.techlabs.shoppingcart.order.Order;
import com.techlabs.shoppingcart.product.Product;

public class ShoppingCartTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String orderNumberInString;
		String productName;
		String addSubtractOptionInString;
		String quantityChangeInString;

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

		LineItem lineItem4 = new LineItem(1, 2, new Product(004, "bag", 500.0));
		lineItem4.calculateCartPrice();
		LineItem lineItem5 = new LineItem(2, 3, new Product(005, "pen", 5.0));
		lineItem5.calculateCartPrice();
		LineItem lineItem6 = new LineItem(3, 3, new Product(006, "pant", 800.0));
		lineItem6.calculateCartPrice();

		List<LineItem> lineItems2 = new ArrayList<LineItem>();
		lineItems2.add(lineItem4);
		lineItems2.add(lineItem5);
		lineItems2.add(lineItem6);

		Order order2 = new Order(lineItems2);

		List<Order> orders = new ArrayList<Order>();
		orders.add(order1);
		orders.add(order2);

		Customer customer = new Customer("abc", orders);

		printCustomer(customer);

		System.out.println("\n Enter the order to be changed");
		orderNumberInString = input.nextLine();
		int orderNumber = Integer.parseInt(orderNumberInString);

		System.out.println("Enter the product whose quantity needs to be changed");
		productName = input.nextLine();

		System.out.println("1. Add quantity\n2. Subtract quantity");
		addSubtractOptionInString = input.nextLine();
		int addSubtrctOption = Integer.parseInt(addSubtractOptionInString);

		System.out.println("Enter the quantity to be added or subtracted");
		quantityChangeInString = input.nextLine();
		int quantityChange = Integer.parseInt(quantityChangeInString);

		/*
		 * for (Iterator<Order> iOrders = customer.getOrders().iterator();
		 * iOrders.hasNext();){ for(Iterator<LineItem> iLineItems =
		 * iOrders.next().getLineItems().iterator(); iLineItems.hasNext(); ) {
		 * if(iLineItems.next().getProduct().getProductName().equalsIgnoreCase("shoes"))
		 * { iLineItems.next().setQuantity(4); iLineItems.next().calculateCartPrice();
		 * break; } } }
		 */

		for (int i = 0; i < customer.getOrders().size(); i++) {
			if (customer.getOrders().get(i).getOrderId() == orderNumber) {
				for (int j = 0; j < customer.getOrders().get(i).getLineItems().size(); j++) {
					if (customer.getOrders().get(i).getLineItems().get(j).getProduct().getProductName()
							.equalsIgnoreCase(productName)) {
						if (addSubtrctOption == 1) {
							customer.getOrders().get(i).getLineItems().get(j).addQuantity(quantityChange);
							customer.getOrders().get(i).getLineItems().get(j).calculateCartPrice();
							break;
						}
						if (addSubtrctOption == 2) {
							customer.getOrders().get(i).getLineItems().get(j).subtractQuantity(8);
							customer.getOrders().get(i).getLineItems().get(j).calculateCartPrice();
							break;
						}
					}
				}
			}
		}

		System.out.println("Afetr modifying");

		printCustomer(customer);
	}

	public static void printLineItems(LineItem lineItem) {

		System.out.println("\nLineItem Detais-----");
		System.out.println("LineItem Number :" + lineItem.getLineItemId());
		System.out.println("LineItem quantity :" + lineItem.getQuantity());
		System.out.println("LinItem cartPrice :" + lineItem.getCartPrice());
		System.out.println("\nProduct details-----");
		System.out.println("Product Id :" + lineItem.getProduct().getProductId());
		System.out.println("Product name :" + lineItem.getProduct().getProductName());
		System.out.println("Product price :" + lineItem.getProduct().getProductPrice());
	}

	public static void printOrders(Order order) {

		System.out.println("\nOrder details-----");
		System.out.println("Order Id :" + order.getOrderId());
		for (LineItem tempLineItem : order.getLineItems()) {
			printLineItems(tempLineItem);
		}
	}

	public static void printCustomer(Customer customer) {

		System.out.println("Customer Details-----");
		System.out.println("Customer Id :" + customer.getCustomerId());
		System.out.println("Customer name : " + customer.getName());
		for (Order tempOrder : customer.getOrders()) {
			printOrders(tempOrder);
		}
	}
}
