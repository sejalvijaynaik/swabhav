package com.techlabs.singleton.pattern.seingleton.test;

import com.techlabs.singleton.pattern.Singleton.Singleton;

public class SingletonTest {
	
	public static void main(String[] args) {
		Singleton singleton = Singleton.getSingleton();
		
		String words = singleton.words.toUpperCase();
		
		System.out.println(words);
	}
}
