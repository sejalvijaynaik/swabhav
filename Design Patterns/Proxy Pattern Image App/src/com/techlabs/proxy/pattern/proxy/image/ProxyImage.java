package com.techlabs.proxy.pattern.proxy.image;

import com.techlabs.proxy.pattern.image.Image;
import com.techlabs.proxy.pattern.real.image.RealImage;

public class ProxyImage implements Image {

	private String fileName;
	private RealImage realImage;
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		
		if(realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}
}
