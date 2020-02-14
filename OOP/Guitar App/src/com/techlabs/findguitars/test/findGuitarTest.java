package com.techlabs.findguitars.test;

import com.techlabs.guitar.Builder;
import com.techlabs.guitar.Guitar;
import com.techlabs.guitar.Type;
import com.techlabs.guitar.Wood;
import com.techlabs.guitarspec.GuitarSpec;
import com.techlabs.inventory.Inventory;

public class findGuitarTest {
	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		GuitarSpec guitarForEric = new GuitarSpec(Builder.FENDER, "Efgh", Type.ELECTRIC, Wood.CIDAR, Wood.COCOBOLO, 10);
		Guitar[] matchingGuitars = inventory.searchGuitar(guitarForEric);

		if (matchingGuitars != null) {
			System.out.println("List of matching guitars\n");
			for (Guitar tempGuitar : matchingGuitars) {
				if (tempGuitar != null) {
					printGuitarInfo(tempGuitar);
				}
			}
		}
	}

	public static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("1", 23.89, Builder.COLLINGS, "abcd", Type.ACOUSTIC, Wood.ALDER, Wood.BRAZILIAN_ROSEWOOD, 9);
		inventory.addGuitar("2", 23.89, Builder.FENDER, "efgh", Type.ELECTRIC, Wood.CIDAR, Wood.COCOBOLO, 10);
		inventory.addGuitar("3", 23.89, Builder.GIBSON, "ijkl", Type.ELECTRIC, Wood.BRAZILIAN_ROSEWOOD,
				Wood.BRAZILIAN_ROSEWOOD, 9);
		inventory.addGuitar("4", 23.89, Builder.COLLINGS, "mnop", Type.ACOUSTIC, Wood.MAPLE, Wood.SITKA, 9);
		inventory.addGuitar("5", 33.89, Builder.FENDER, "efgh", Type.ELECTRIC, Wood.CIDAR, Wood.COCOBOLO, 10);
	}

	public static void printGuitarInfo(Guitar guitar) {
		System.out.println("----Guitar Info----");
		System.out.println("Serial number :" + guitar.getSerialNumber());
		System.out.println("Price :" + guitar.getPrice());
		System.out.println("Builder :" + guitar.getGuitarSpec().getBuilder());
		System.out.println("Type :" + guitar.getGuitarSpec().getType());
		System.out.println("Backwood :" + guitar.getGuitarSpec().getBackWood());
		System.out.println("Topwood :" + guitar.getGuitarSpec().getTopWood());
		System.out.println();
	}
}
