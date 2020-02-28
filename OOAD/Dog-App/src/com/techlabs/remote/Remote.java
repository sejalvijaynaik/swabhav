package com.techlabs.remote;

import com.techlabs.dogdoor.DogDoor;

public class Remote {
	private DogDoor door;

	public Remote(DogDoor door) {
		this.door = door;
	}

	public void pressButton() {
		if (door.isOpen()) {
			door.close();
			return;
		}
		door.open();
	}
}
