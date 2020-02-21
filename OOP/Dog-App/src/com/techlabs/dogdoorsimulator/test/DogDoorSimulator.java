package com.techlabs.dogdoorsimulator.test;

import com.techlabs.dogdoor.DogDoor;
import com.techlabs.remote.Remote;

public class DogDoorSimulator {
	public static void main(String[] args) {
		
		Remote remote = new Remote(new DogDoor());
		
		System.out.println("Dog barks");
		System.out.println("Remote button pressed");
		remote.pressButton();
		syso
	}

}
