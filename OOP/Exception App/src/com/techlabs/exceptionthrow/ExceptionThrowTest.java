package com.techlabs.exceptionthrow;

public class ExceptionThrowTest {
	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a/b;
		
		//throw new ArithmeticException("Arithmetic exception thrown");
		//throw new ArrayIndexOutOfBoundsException("Array out of bounds exception thrown");
		throw new NumberFormatException("Number format exception");
	}
}
