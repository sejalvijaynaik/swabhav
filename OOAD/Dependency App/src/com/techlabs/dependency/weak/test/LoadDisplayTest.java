package com.techlabs.dependency.weak.test;

import com.techlabs.dependency.weak.Display;
import com.techlabs.dependency.weak.LoadFromUrl;
import com.techlabs.dependency.weak.LoaderFromFile;

public class LoadDisplayTest {
	
	public static void main(String[] args) {
		
		Display display = new Display();
		
		display.print(new LoaderFromFile());
		display.print(new LoadFromUrl());
	}
}
