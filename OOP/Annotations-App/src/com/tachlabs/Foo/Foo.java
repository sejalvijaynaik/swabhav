package com.tachlabs.Foo;

import com.tachlabs.requiredrefactoring.RequiredRefactoring;

public class Foo {

	@RequiredRefactoring
	public void m1() {
		System.out.println("I am in m1");
	}

	@RequiredRefactoring
	public void m2() {
		System.out.println("I am in m2");
	}

	public void m3() {
		System.out.println("I am in m3");
	}
}
