package com.techlabs.inventory;

import java.util.ArrayList;
import java.util.Iterator;

import com.techlabs.guitar.Guitar;
import com.techlabs.guitarspec.GuitarSpec;
import com.techlabs.instrument.Instrument;
import com.techlabs.instrumentspec.Builder;
import com.techlabs.instrumentspec.InstrumentSpec;
import com.techlabs.instrumentspec.Type;
import com.techlabs.instrumentspec.Wood;
import com.techlabs.mandolin.Mandolin;
import com.techlabs.mandolinspec.MandolinSpec;

public class Inventory {

	private ArrayList<Instrument> instruments;

	public Inventory() {
		instruments = new ArrayList<>();
	}

	public void addInstrument(String serialNumber, double price, InstrumentSpec instrumentSpec) {
		Instrument instrument = null;
		if (instrumentSpec instanceof GuitarSpec) {
			instrument = new Guitar(serialNumber, price, (GuitarSpec) instrumentSpec);
		} else if (instrumentSpec instanceof MandolinSpec) {
			instrument = new Mandolin(serialNumber, price, (MandolinSpec) instrumentSpec);
		}
		instruments.add(instrument);
	}

	public Instrument getInstrument(String serialNumber) {
		for (Iterator<Instrument> i = instruments.iterator(); i.hasNext();) {
			if (serialNumber == i.next().getSerialNumber()) {
				return i.next();
			}
		}
		return null;
	}

	public ArrayList<Guitar> searchInstrument(GuitarSpec guitarSpec) {
		ArrayList<Guitar> matchingGuitars = new ArrayList<>();
		for (Iterator<Instrument> i = instruments.iterator(); i.hasNext();) {
			if ((i.next().getSpec() instanceof GuitarSpec) && (i.next().getSpec().matches(guitarSpec))) {
				Guitar guitar = (Guitar) i.next();
				matchingGuitars.add(guitar);
			}
		}
		return matchingGuitars;
	}
	public ArrayList<Mandolin> searchInstrument(MandolinSpec mandolinSpec) {
		ArrayList<Mandolin> matchingMandolins = new ArrayList<>();
		for (Iterator<Instrument> i = instruments.iterator(); i.hasNext();) {
			if ((i.next().getSpec() instanceof GuitarSpec) && (i.next().getSpec().matches(mandolinSpec))) {
				Mandolin mandolin = (Mandolin) i.next();
				matchingMandolins.add(mandolin);
			}
		}
		return matchingMandolins;
	}
}
