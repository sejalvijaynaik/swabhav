package com.exception;

public class TryCatchTest {
	public static void main(String[] args) {
		try {
			int i = 1/0;
			System.out.println(i);
		}
		catch(Exception e) {
			System.out.println("Divide by zerp not allowed");
		}
		System.out.println("Out of catch block");
	}
}
