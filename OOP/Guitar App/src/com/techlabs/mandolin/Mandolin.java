package com.techlabs.mandolin;

import com.techlabs.instrument.Instrument;
import com.techlabs.mandolinspec.MandolinSpec;

public class Mandolin extends Instrument {

	public Mandolin(String serialNumber, double price, MandolinSpec mandolinspec) {
		super(serialNumber, price, mandolinspec);
	}
}
