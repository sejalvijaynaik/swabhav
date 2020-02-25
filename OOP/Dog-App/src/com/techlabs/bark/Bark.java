package com.techlabs.bark;

public class Bark {
	private String sound;

	public Bark(String sound) {
		this.sound = sound;
	}

	public String getSound() {
		return sound;
	}

	@Override
	public boolean equals(Object obj) {
		Bark bark = (Bark)obj;
		if(this.sound.equalsIgnoreCase(bark.sound))
			return true;
		return false;
	}
}
