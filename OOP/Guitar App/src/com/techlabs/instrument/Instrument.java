package com.techlabs.instrument;

import com.techlabs.instrumentspec.InstrumentSpec;

public class Instrument {
	private String serialNumber;
	private double price;
	private InstrumentSpec instrumentSpec;

	public Instrument(String serialNumber, double price, InstrumentSpec instrumentSpec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.instrumentSpec = instrumentSpec;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public InstrumentSpec getInstrumentSpec() {
		return instrumentSpec;
	}
}
