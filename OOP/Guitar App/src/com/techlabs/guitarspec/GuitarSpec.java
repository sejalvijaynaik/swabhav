package com.techlabs.guitarspec;

import com.techlabs.instrumentspec.Builder;
import com.techlabs.instrumentspec.InstrumentSpec;
import com.techlabs.instrumentspec.Type;
import com.techlabs.instrumentspec.Wood;

public class GuitarSpec extends InstrumentSpec {
	private int numStrings;
	
	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
		super(builder, model, type, backWood, topWood);
		this.numStrings = numStrings;
	}
	
	public int getNumStrings() {
		return numStrings;
	}

	@Override
	public boolean matches(InstrumentSpec otherSpec) {
		if(!super.matches(otherSpec)) 
			return false;
		if(!(otherSpec instanceof GuitarSpec))
				return false;
		GuitarSpec guitarSpec =(GuitarSpec)otherSpec;
		if(this.numStrings != guitarSpec.numStrings)
			return false;
		return true;
	}
}
