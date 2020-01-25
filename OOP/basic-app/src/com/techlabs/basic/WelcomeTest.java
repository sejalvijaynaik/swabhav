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

	public static void printInfo(String words) {
		System.out.println(words);
	}

	public static void printInfo(Double doubleNum) {
		System.out.println(doubleNum);
	}

	public static void printInfo(float floatNum) {
		System.out.println(floatNum);
	}

	public static void printInfo(boolean booleanOp) {
		System.out.println(booleanOp);
	}

	public static void printInfo(char charWord) {
		System.out.println(charWord);
	}

}
