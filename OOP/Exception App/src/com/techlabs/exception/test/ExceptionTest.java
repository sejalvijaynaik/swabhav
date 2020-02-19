package com.techlabs.exception.test;

public class ExceptionTest {
	public static void main(String[] args) throws Exception {
		
		m1();
		m2();
		m3();
		System.out.println("End of the program");
	}
	
	public static void m1() {
		System.out.println("M1 is running");
	}
	public static void m2() {
		System.out.println("M2 is running");
	}
	
	public static void m3() throws Exception {
		//throw new Exception("exception thrown");
		throw new RuntimeException("Runtime exception thrown");
	}
}
