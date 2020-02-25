package com.techlabs.inventory;

import java.util.ArrayList;
import java.util.Iterator;

import com.techlabs.instrument.Instrument;
import com.techlabs.instrumentspec.InstrumentSpec;

public class Inventory {

	private ArrayList<Instrument> instruments;

	public Inventory() {
		instruments = new ArrayList<>();
	}

	public void addInstrument(String serialNumber, double price, InstrumentSpec instrumentSpec) {
		Instrument instrument = new Instrument(serialNumber, price, instrumentSpec);
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

	public ArrayList<Instrument> searchInstrument(InstrumentSpec instrumentSpec) {
		ArrayList<Instrument> matchingInstruments = new ArrayList<>();
		for (Instrument tempInstrument : instruments) {
			if(tempInstrument.getInstrumentSpec().matches(instrumentSpec)) {
				matchingInstruments.add(tempInstrument);
			}
		}
		return matchingInstruments;
	}
}
