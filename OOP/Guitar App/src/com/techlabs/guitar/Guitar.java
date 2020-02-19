package com.techlabs.guitar;

import com.techlabs.guitarspec.GuitarSpec;
import com.techlabs.instrument.Instrument;

public class Guitar extends Instrument {

	public Guitar(String serialNumber, double price, GuitarSpec guitarSpec) {
		super(serialNumber, price, guitarSpec);
	}
	
}
