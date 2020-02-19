package com.techlabs.findguitars.test;

import java.util.ArrayList;

import com.techlabs.guitar.Guitar;
import com.techlabs.guitarspec.GuitarSpec;
import com.techlabs.instrument.Instrument;
import com.techlabs.instrumentspec.Builder;
import com.techlabs.instrumentspec.Type;
import com.techlabs.instrumentspec.Wood;
import com.techlabs.inventory.Inventory;
import com.techlabs.mandolin.Mandolin;
import com.techlabs.mandolinspec.MandolinSpec;
import com.techlabs.mandolinspec.Style;

public class findGuitarTest {
	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		GuitarSpec guitarForEric = new GuitarSpec(Builder.FENDER, "Efgh", Type.ELECTRIC, Wood.CIDAR, Wood.COCOBOLO, 10);
		ArrayList<Guitar> matchingGuitars = inventory.searchInstrument(guitarForEric);

		if (matchingGuitars == null) {
			System.out.println("Sorry we dont have such a guitar");
			return;
		}
		System.out.println("List of matching guitars\n");
		for (Guitar tempGuitar : matchingGuitars) {
			if (tempGuitar != null) {
				printInstrumentInfo(tempGuitar);
			}
		}
		
		MandolinSpec mandolinForEric = new MandolinSpec(Builder.GIBSON, "xyz", Type.ELECTRIC, Wood.BRAZILIAN_ROSEWOOD, Wood.CIDAR, Style.A);
		ArrayList<Mandolin> matchingMandolins = inventory.searchInstrument(mandolinForEric);
		
		if (matchingMandolins == null) {
			System.out.println("Sorry we dont have such a mandolin");
			return;
		}
		System.out.println("List of matching mandolins\n");
		for (Mandolin tempMandolin : matchingMandolins) {
			if (tempMandolin != null) {
				printInstrumentInfo(tempMandolin);
			}
		}
	}

	public static void initializeInventory(Inventory inventory) {

		inventory.addInstrument("1", 23.89,
				new GuitarSpec(Builder.COLLINGS, "abcd", Type.ACOUSTIC, Wood.ALDER, Wood.BRAZILIAN_ROSEWOOD, 9));
		inventory.addInstrument("2", 23.89,
				new GuitarSpec(Builder.FENDER, "efgh", Type.ELECTRIC, Wood.CIDAR, Wood.COCOBOLO, 10));
		inventory.addInstrument("3", 23.89, new GuitarSpec(Builder.GIBSON, "ijkl", Type.ELECTRIC,
				Wood.BRAZILIAN_ROSEWOOD, Wood.BRAZILIAN_ROSEWOOD, 9));
		inventory.addInstrument("4", 23.89,
				new GuitarSpec(Builder.COLLINGS, "mnop", Type.ACOUSTIC, Wood.MAPLE, Wood.SITKA, 9));
		inventory.addInstrument("5", 33.89,
				new GuitarSpec(Builder.FENDER, "efgh", Type.ELECTRIC, Wood.CIDAR, Wood.COCOBOLO, 10));
		inventory.addInstrument("6", 66.90,
				new MandolinSpec(Builder.GIBSON, "xyz", Type.ELECTRIC, Wood.BRAZILIAN_ROSEWOOD, Wood.CIDAR, Style.A));
	}

	public static void printInstrumentInfo(Instrument instrument) {
		System.out.println("----" + instrument.getClass().getName() + "----");
		System.out.println("Serial number :" + instrument.getSerialNumber());
		System.out.println("Price :" + instrument.getPrice());
		System.out.println("Builder :" + instrument.getSpec().getBuilder());
		System.out.println("Type :" + instrument.getSpec().getType());
		System.out.println("Backwood :" + instrument.getSpec().getBackWood());
		System.out.println("Topwood :" + instrument.getSpec().getTopWood());
		if(instrument instanceof Guitar) {
			Guitar guitar = (Guitar)instrument;
			GuitarSpec guitarSpec = (GuitarSpec)guitar.getSpec();
			System.out.println("Number of strings :" + guitarSpec.getNumStrings());
		}
		if(instrument instanceof Mandolin) {
			Mandolin mandolin = (Mandolin)instrument;
			MandolinSpec mandolinSpec = (MandolinSpec) mandolin.getSpec();
			System.out.println("Style :" + mandolinSpec.getStyle());
		}
		System.out.println();
	}
}
