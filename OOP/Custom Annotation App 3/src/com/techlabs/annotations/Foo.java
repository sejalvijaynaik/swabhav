package com.techlabs.annotations;

public class Foo {
	@Test(methodName = "m1", methodNumber = 1)
	public boolean m1() {
		return true;
	}
	
	@Test(methodName = "m2", methodNumber = 2)
	public boolean m2() {
		return false;
	}
	
	@Test(methodName = "m3", methodNumber = 3)
	public boolean m3() {
		return false;
	}
	
	@Test(methodName = "m4", methodNumber = 4)
	public boolean m4() {
		return false;
	}
}
