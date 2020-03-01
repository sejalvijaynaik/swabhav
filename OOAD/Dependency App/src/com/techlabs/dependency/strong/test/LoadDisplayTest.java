package com.techlabs.dependency.strong.test;

import com.techlabs.dependency.strong.Display;
import com.techlabs.dependency.strong.LoaderFromFile;

public class LoadDisplayTest {
	
	public static void main(String[] args) {
		
		Display display = new Display();
		display.print(new LoaderFromFile());
	}
}
