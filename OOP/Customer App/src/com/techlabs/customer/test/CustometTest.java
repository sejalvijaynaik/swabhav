package com.techlabs.customer.test;

import com.techlabs.customer.Customer;

public class CustometTest {
	public static void main(String[] args) {
	
		Customer c1 = new Customer("abc", "def");
		Customer c2 = new Customer("pqr", "stu");
		Customer c3 = new Customer("xyz", "mno");
		
		System.out.println("c1 id :" + c1.getId());
		System.out.println("c2 id :" + c2.getId());
		System.out.println("c3 id :" + c3.getId());
		System.out.println("c1 id :" + c1.getId());
	}
}
