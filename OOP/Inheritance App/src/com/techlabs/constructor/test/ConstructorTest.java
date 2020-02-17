package com.techlabs.constructor.test;

import com.techlabs.constructor.child.Child;

public class ConstructorTest {

	public static void main(String[] args) {
		//Child c1 = new Child();
		//System.out.println(c1.getFoo());
		
		Child c2 = new Child(200);
		System.out.println(c2.getFoo());
	}
}
