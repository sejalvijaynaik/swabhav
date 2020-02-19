package com.techlabs.error.test;

public class ErrorTest {
	
	public static void main(String[] args) {
		m1();
	}
	
	public static void m1() {
		System.out.println("M1 is running");
		m2();
	}
	public static void m2() {
		System.out.println("M2 is running");
		String[] args = {"abc", "xyz"};
		main(args);
	}
	
	

}
