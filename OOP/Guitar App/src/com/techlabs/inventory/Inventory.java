package com.techlabs.inventory;

import com.techlabs.guitar.Builder;
import com.techlabs.guitar.Guitar;
import com.techlabs.guitar.Type;
import com.techlabs.guitar.Wood;
import com.techlabs.guitarspec.GuitarSpec;

public class Inventory {

	private Guitar[] guitars = new Guitar[20];
	private static int guitarCount = 0;
	
	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood, int numStrings) {
		GuitarSpec guitarSpec = new GuitarSpec(builder, model, type, backWood, topWood, numStrings);
		Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
		guitars[guitarCount] = guitar;
		guitarCount++;
	}

	public Guitar getGuitar(String serialNumber) {
		for (Guitar tempGuitar : guitars) {
			if (tempGuitar.getSerialNumber().equalsIgnoreCase(serialNumber)) {
				return tempGuitar;
			}
		}
		return null;
	}

	public Guitar[] searchGuitar(GuitarSpec guitarSpec) {
		Guitar[] matchingGuitars = new Guitar[20];
		int index = 0;
		for (int i = 0; i<guitarCount; i++) {
			if(guitars[i].getGuitarSpec().matches(guitarSpec))
			matchingGuitars[index] = guitars[i];
			index++;
		}
		return matchingGuitars;
	}
}
