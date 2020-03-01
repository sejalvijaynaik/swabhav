package com.techlabs.dependency.weak;

public class Display {
	
	public void print(ILoadable iLoadable) {
		
		String loadedFrom = iLoadable.load();
		System.out.println("Loaded from :" + loadedFrom);
	}
}
