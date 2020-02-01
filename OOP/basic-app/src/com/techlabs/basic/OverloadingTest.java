package com.techlabs.basic;

public class WelcomeTest {

	public static void main(String[] args) {

		System.out.println("Hello");
		System.out.println(2);
		System.out.println('c');
		System.out.println(2.2);
		System.out.println(true);
		System.out.println(3.3);

		printInfo("Hello");
		printInfo(2.2);
		printInfo(2.2f);
		printInfo(true);
		printInfo('c');
	}

	private static void printInfo(String stringVar) {
		System.out.println(stringVar);
	}

	private static void printInfo(Double doubleVar) {
		System.out.println(doubleVar);
	}

	private static void printInfo(float floatVar) {
		System.out.println(floatVar);
	}

	private static void printInfo(boolean booleanVar) {
		System.out.println(booleanVar);
	}

	private static void printInfo(char charVar) {
		System.out.println(charVar);
	}

}
