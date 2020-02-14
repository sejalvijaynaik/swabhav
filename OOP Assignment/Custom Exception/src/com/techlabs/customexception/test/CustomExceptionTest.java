package com.techlabs.customexception.test;

import com.techlabs.customexception.CustomException;

public class CustomExceptionTest {
	public static void main(String[] args) {
		try {
			throw new CustomException("This is an exception");
		} catch (CustomException ce) {
			System.out.println("Custom Exception caught");
			System.out.println(ce.getMessage());
		}
	}
}
