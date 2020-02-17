package com.techlabs.constructor.child;

import com.techlabs.constructor.parent.Parent;

public class Child extends Parent {

	public Child() {
		super(100);
		System.out.println("Child constructor");
	}
	public Child(int foo) {
		super(foo);
		System.out.println("Parameterized child constructor");
	}
}
