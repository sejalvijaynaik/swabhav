package com.techlabs.singleton.pattern.Singleton;

public class Singleton {
	
	private static Singleton singleton = null;
	public String words;
	
	private Singleton() {
		words = "This is a string";
	}
	
	public static Singleton getSingleton() {
		
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
