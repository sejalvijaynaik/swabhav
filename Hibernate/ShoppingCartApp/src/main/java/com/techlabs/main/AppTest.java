package com.techlabs.main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.sound.sampled.LineListener;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.techlabs.entity.Customer;
import com.techlabs.entity.LineItem;
import com.techlabs.entity.Order;
import com.techlabs.entity.Product;

public class AppTest {

	public static void main(String[] args) {

		Product pant = new Product(1, "pant", 700.00f);
		Product shirt = new Product(2, "shirt", 800.00f);

		Customer sejal = new Customer();
		sejal.setId(1);
		sejal.setName("sejal");

		LineItem lineItem1 = new LineItem();
		lineItem1.setId(1);
		lineItem1.setQuantity(2);
		lineItem1.setProduct(pant);

		LineItem lineItem2 = new LineItem();
		lineItem2.setId(2);
		lineItem2.setQuantity(3);
		lineItem2.setProduct(shirt);

		LineItem lineItem3 = new LineItem();
		lineItem3.setId(3);
		lineItem3.setQuantity(3);
		lineItem3.setProduct(pant);

		Order order1 = new Order();
		order1.setId(1);
		order1.setCustomer(sejal);

		Order order2 = new Order();
		order2.setId(2);
		order2.setCustomer(sejal);

		lineItem1.setOrder(order1);
		lineItem2.setOrder(order2);
		lineItem3.setOrder(order2);

		Set<LineItem> lineItems1 = new HashSet<LineItem>();
		lineItems1.add(lineItem1);

		Set<LineItem> lineItems2 = new HashSet<LineItem>();
		lineItems2.add(lineItem2);
		lineItems2.add(lineItem3);

		order1.setLineItmes(lineItems1);
		order1.setLineItmes(lineItems2);

		Set<Order> orders = new HashSet<Order>();
		orders.add(order1);
		orders.add(order2);

		sejal.setOrders(orders);

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

	public static void printDepartments(Session session) {

		Criteria criteria = session.createCriteria(LineItem.class);
		List<LineItem> lineItems = criteria.list();

		for (LineItem lineItem : lineItems) {
			System.out.println(lineItem);
		}
	}
}
