package com.techlabs.constructor.parent;

public class Parent {
	private int foo;
	
	public Parent(int foo) {
		this.foo = foo;
		System.out.println("Parent parameterized constuctor");
	}
	
	public int getFoo() {
		return foo;
	}
}
