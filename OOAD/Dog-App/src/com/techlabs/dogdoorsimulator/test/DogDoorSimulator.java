package com.techlabs.dogdoorsimulator.test;

import com.techlabs.bark.Bark;
import com.techlabs.barkrecognizer.BarkRecognizer;
import com.techlabs.dogdoor.DogDoor;
import com.techlabs.remote.Remote;

public class DogDoorSimulator {
	public static void main(String[] args) {

		DogDoor door = new DogDoor();
		door.addAllowedBark(new Bark("Woof"));
		door.addAllowedBark(new Bark("bhau bhau"));
		door.addAllowedBark(new Bark("woof woof"));

		BarkRecognizer barkRecognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);

		System.out.println("Dog barks");
		barkRecognizer.recognize(new Bark("Woof"));
		
		System.out.println("Dog goes out");
		
		try {
			Thread.currentThread().sleep(10000);
		}
		catch (InterruptedException e) {
		}
		
		System.out.println("Dog is done");
		System.out.println("Dog stuck outside");
		
		System.out.println("Different dog barks");
		barkRecognizer.recognize(new Bark("bhau"));
		try {
			Thread.currentThread().sleep(5000);
		}
		catch (InterruptedException e) {
		}
		System.out.println("Dog starts barking");
		
		barkRecognizer.recognize(new Bark("woof woof"));
		System.out.println("Dog is back inside");
	}
}
