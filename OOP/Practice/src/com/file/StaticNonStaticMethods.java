package com.file;

public class StaticNonStaticMethods {
	public static void main(String[] args) {
		System.out.println("Hi I am a static method");
		StaticNonStaticMethods s = new StaticNonStaticMethods();
		s.iAmNonStaticMethod();
	}

	public void iAmNonStaticMethod() {
		System.out.println("Hi I am a non static method");
	}
}
