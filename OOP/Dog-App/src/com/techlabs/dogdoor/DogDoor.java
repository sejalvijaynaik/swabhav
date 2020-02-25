package com.techlabs.dogdoor;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import com.techlabs.bark.Bark;

public class DogDoor {

	private boolean open;
	private List<Bark> allowedBarks;

	public DogDoor() {
		this.open = false;
		allowedBarks = new ArrayList<Bark>();
	}

	public void addAllowedBark(Bark bark) {
		allowedBarks.add(bark);
	}

	public List<Bark> getAllowedBarks() {
		return allowedBarks;
	}

	public void open() {
		open = true;

		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				close();
				timer.cancel();
			}
		}, 5000);
	}

	public void close() {
		open = false;
	}

	public boolean isOpen() {
		return open;
	}
}
