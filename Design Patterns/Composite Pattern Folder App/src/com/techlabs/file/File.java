package com.techlabs.file;

import com.techlabs.istorable.IStorable;

public class File implements IStorable {

	private String name;
	private double size;
	private String extension;

	public File(String name, double size, String extension) {
		this.name = name;
		this.size = size;
		this.extension = extension;
	}

	public String getName() {
		return name;
	}

	public double getSize() {
		return size;
	}

	public String getExtension() {
		return extension;
	}

	@Override
	public void display(StringBuilder dashes) {
		StringBuilder dashesLocal = new StringBuilder(dashes);
		System.out.println(dashesLocal + name);
	}
}
