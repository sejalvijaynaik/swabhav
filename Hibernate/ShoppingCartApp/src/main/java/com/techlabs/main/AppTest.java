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
import com.techlabs.entity.Order;
import com.techlabs.entity.Product;

public class AppTest {

	public static void main(String[] args) {

		Customer sejal = new Customer();
		sejal.setId(1);
		sejal.setName("sejal");

		Customer rachel = new Customer();
		rachel.setId(2);
		rachel.setName("rachel");

		Order order1 = new Order();
		order1.setId(1);
		order1.setCustomer(sejal);

		Order order2 = new Order();
		order2.setId(2);
		order2.setCustomer(sejal);

		Order order3 = new Order();
		order3.setId(3);
		order3.setCustomer(rachel);

		Order order4 = new Order();
		order4.setId(4);
		order4.setCustomer(rachel);

		Product pant = new Product(1, "pant", 500.00f);
		Product top = new Product(2, "top", 400.00f);
		Product shirt = new Product(3, "shirt", 600.00f);
		Product jeans = new Product(4, "jeans", 300.00f);
		Product cap = new Product(5, "cap", 700.00f);
		Product belt = new Product(6, "belt", 800.00f);

		LineItem lineItem1 = new LineItem();
		lineItem1.setId(1);
		lineItem1.setQuantity(1);
		lineItem1.setProduct(pant);

		LineItem lineItem2 = new LineItem();
		lineItem2.setId(2);
		lineItem2.setQuantity(2);
		lineItem2.setProduct(top);

		LineItem lineItem3 = new LineItem();
		lineItem3.setId(3);
		lineItem3.setQuantity(3);
		lineItem3.setProduct(top);

		LineItem lineItem4 = new LineItem();
		lineItem4.setId(4);
		lineItem4.setQuantity(4);
		lineItem4.setProduct(shirt);

		LineItem lineItem5 = new LineItem();
		lineItem5.setId(5);
		lineItem5.setQuantity(5);
		lineItem5.setProduct(jeans);

		LineItem lineItem6 = new LineItem();
		lineItem6.setId(6);
		lineItem6.setQuantity(6);
		lineItem6.setProduct(cap);

		LineItem lineItem7 = new LineItem();
		lineItem7.setId(7);
		lineItem7.setQuantity(7);
		lineItem7.setProduct(belt);

		LineItem lineItem8 = new LineItem();
		lineItem8.setId(8);
		lineItem8.setQuantity(8);
		lineItem8.setProduct(shirt);

		lineItem1.setOrder(order1);
		lineItem2.setOrder(order1);
		lineItem3.setOrder(order2);
		lineItem4.setOrder(order2);
		lineItem5.setOrder(order3);
		lineItem6.setOrder(order3);
		lineItem7.setOrder(order4);
		lineItem8.setOrder(order4);

		Set<LineItem> lineItems1 = new HashSet<LineItem>();
		lineItems1.add(lineItem1);
		lineItems1.add(lineItem2);

		Set<LineItem> lineItems2 = new HashSet<LineItem>();
		lineItems2.add(lineItem3);
		lineItems2.add(lineItem4);

		Set<LineItem> lineItems3 = new HashSet<LineItem>();
		lineItems3.add(lineItem5);
		lineItems3.add(lineItem6);

		Set<LineItem> lineItems4 = new HashSet<LineItem>();
		lineItems4.add(lineItem7);
		lineItems4.add(lineItem8);

		order1.setLineItmes(lineItems1);
		order2.setLineItmes(lineItems2);
		order3.setLineItmes(lineItems3);
		order4.setLineItmes(lineItems4);

		Set<Order> orders1 = new HashSet<Order>();
		orders1.add(order1);
		orders1.add(order2);

		Set<Order> orders2 = new HashSet<Order>();
		orders2.add(order3);
		orders2.add(order4);

		sejal.setOrders(orders1);
		rachel.setOrders(orders2);

		Configuration configConfiguration = new Configuration();
		SessionFactory sessionFactory = configConfiguration.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		try {

			transaction = session.beginTransaction();
			session.save(pant);
			session.save(top);
			session.save(shirt);
			session.save(jeans);
			session.save(cap);
			session.save(belt);
			session.save(sejal);
			session.save(rachel);

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
