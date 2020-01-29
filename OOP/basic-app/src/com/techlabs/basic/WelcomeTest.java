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

	private static void printInfo(String words) {
		System.out.println(words);
	}

	private static void printInfo(Double doubleNum) {
		System.out.println(doubleNum);
	}

	private static void printInfo(float floatNum) {
		System.out.println(floatNum);
	}

	private static void printInfo(boolean booleanOp) {
		System.out.println(booleanOp);
	}

	private static void printInfo(char charWord) {
		System.out.println(charWord);
	}

}
