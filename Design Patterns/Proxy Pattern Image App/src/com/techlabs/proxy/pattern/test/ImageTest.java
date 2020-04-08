package com.techlabs.proxy.pattern.test;

import com.techlabs.proxy.pattern.image.Image;
import com.techlabs.proxy.pattern.proxy.image.ProxyImage;

public class ImageTest {
	
	public static void main(String[] args) {
		
		Image image = new ProxyImage("image.jpg");
		image.display();
		image.display();
	}
}
