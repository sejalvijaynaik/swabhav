package com.techlabs.barkrecognizer;

import java.util.Iterator;
import java.util.List;

import com.techlabs.bark.Bark;
import com.techlabs.dogdoor.DogDoor;

public class BarkRecognizer {

	private DogDoor door;

	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}

	public void recognize(Bark bark) {
		System.out.println("Bark recognizer heard a " + bark.getSound());
		List<Bark> allowedBarks = door.getAllowedBarks();

		for (Iterator<Bark> i = allowedBarks.iterator(); i.hasNext();) {
			if (i.next().equals(bark)) {
				door.open();
				return;
			}
		}
		System.out.println("This dog is not allowed");
	}
}
