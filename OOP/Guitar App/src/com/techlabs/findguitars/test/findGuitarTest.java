package com.techlabs.findguitars.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.techlabs.enums.Builder;
import com.techlabs.enums.InstrumrntType;
import com.techlabs.enums.Type;
import com.techlabs.enums.Wood;
import com.techlabs.instrument.Instrument;
import com.techlabs.instrumentspec.InstrumentSpec;
import com.techlabs.inventory.Inventory;

public class findGuitarTest {
	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		Map properties = new HashMap();

		properties.put("builder", Builder.GIBSON);
		properties.put("sideWood", Wood.MAPLE);
		InstrumentSpec specForRick = new InstrumentSpec(properties);

		List<Instrument> matchingInstruments = inventory.searchInstrument(specForRick);

		for (Instrument tempInstrument : matchingInstruments) {
			printInstrumentInfo(tempInstrument);
		}

	}

	public static void initializeInventory(Inventory inventory) {

		Map properties = new HashMap();
		properties.put("instrumentType", InstrumrntType.GUITAR);
		properties.put("builder", Builder.COLLINGS);
		properties.put("model", "CJ");
		properties.put("type", Type.ACOUSTIC);
		properties.put("numStrings", 6);
		properties.put("topWood", Wood.INDIAN_ROSEWOOD);
		properties.put("backWood", Wood.SITKA);
		inventory.addInstrument("1122", 23.78, new InstrumentSpec(properties));

		properties.clear();

		properties.put("instrumentType", InstrumrntType.BANJO);
		properties.put("builder", Builder.GIBSON);
		properties.put("model", "G5G");
		properties.put("type", Type.ACOUSTIC);
		properties.put("topWood", Wood.MAPLE);
		properties.put("sideWood", Wood.MAPLE);
		inventory.addInstrument("2345", 67.98, new InstrumentSpec(properties));

		properties.clear();
		
		properties.put("instrumentType", InstrumrntType.BANJO);
		properties.put("builder", Builder.GIBSON);
		properties.put("model", "G5G");
		properties.put("type", Type.ELECTRIC);
		properties.put("topWood", Wood.MAPLE);
		properties.put("sideWood", Wood.MAPLE);
		inventory.addInstrument("3875", 675.98, new InstrumentSpec(properties));
	}

	public static void printInstrumentInfo(Instrument instrument) {

		Map properties = instrument.getInstrumentSpec().getProperties();

		System.out.println("Instrument serial number :" + instrument.getSerialNumber());
		System.out.println("Instrument price : " + instrument.getPrice());
		if (properties != null) {
			for (Iterator i = properties.keySet().iterator(); i.hasNext();) {
				String propertyName = (String) i.next();
				System.out.println(propertyName + ":" + properties.get(propertyName));
			}
		}
	}
}
