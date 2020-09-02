package com.techlabs.main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.entity.Customer;
import com.techlabs.entity.LineItem;
import com.techlabs.entity.OrderItem;
import com.techlabs.entity.Product;

public class AppTest {

	public static void main(String[] args) {

		Customer sejal = new Customer();
		sejal.setId(1);
		sejal.setName("sejal");

		Product pant = new Product(1, "pant", 500.00f);
		Product shirt = new Product(2, "shirt", 700.00f);
		Product top = new Product(3, "top", 600.00f);

		OrderItem order1 = new OrderItem();
		order1.setId(1);
		order1.setCustomer(sejal);

		OrderItem order2 = new OrderItem();
		order2.setId(2);
		order2.setCustomer(sejal);

		LineItem lineItem1 = new LineItem();
		lineItem1.setId(1);
		lineItem1.setQuantity(2);
		lineItem1.setOrderItem(order1);
		lineItem1.setProduct(pant);

		LineItem lineItem2 = new LineItem();
		lineItem2.setId(2);
		lineItem2.setQuantity(3);
		lineItem2.setOrderItem(order1);
		lineItem2.setProduct(top);

		LineItem lineItem3 = new LineItem();
		lineItem3.setId(3);
		lineItem3.setQuantity(4);
		lineItem3.setOrderItem(order2);
		lineItem3.setProduct(pant);

		LineItem lineItem4 = new LineItem();
		lineItem4.setId(4);
		lineItem4.setQuantity(5);
		lineItem4.setOrderItem(order2);
		lineItem4.setProduct(shirt);

		Set<LineItem> lineItems1 = new HashSet<LineItem>();
		lineItems1.add(lineItem1);
		lineItems1.add(lineItem2);

		Set<LineItem> lineItems2 = new HashSet<LineItem>();
		lineItems2.add(lineItem3);
		lineItems2.add(lineItem4);

		order1.setLineItems(lineItems1);
		order2.setLineItems(lineItems2);

		Set<OrderItem> orderItems = new HashSet<OrderItem>();
		orderItems.add(order1);
		orderItems.add(order2);

		sejal.setOrderItems(orderItems);

		Configuration configConfiguration = new Configuration();
		SessionFactory sessionFactory = configConfiguration.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		try {

			transaction = session.beginTransaction();
			session.save(sejal);
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}

}
