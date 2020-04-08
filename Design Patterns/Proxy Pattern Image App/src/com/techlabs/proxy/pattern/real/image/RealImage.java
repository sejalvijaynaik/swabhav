package com.techlabs.proxy.pattern.real.image;

import com.techlabs.proxy.pattern.image.Image;

public class RealImage implements Image {

	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromFile(fileName);
	}

	private void loadFromFile(String fileName) {
		System.out.println("Loading " + fileName + ".....");
	}

	@Override
	public void display() {
		System.out.println("Displaying " + fileName);
	}
}
