package com.techlabs.dependency.strong;

public class Display {
	
	public void print(LoaderFromFile loaderFromFile) {
		
		String loadedFrom = loaderFromFile.loadFile();
		System.out.println("Loaded from :" + loadedFrom);
	}

}
