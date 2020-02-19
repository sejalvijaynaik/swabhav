package com.techlabs.mandolinspec;

import com.techlabs.instrumentspec.Builder;
import com.techlabs.instrumentspec.InstrumentSpec;
import com.techlabs.instrumentspec.Type;
import com.techlabs.instrumentspec.Wood;

public class MandolinSpec extends InstrumentSpec {
	private Style style;

	public MandolinSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, Style style) {
		super(builder, model, type, backWood, topWood);
		this.style = style;
	}

	public Style getStyle() {
		return style;
	}

	@Override
	public boolean matches(InstrumentSpec otherSpec) {
		if (!super.matches(otherSpec))
			return false;
		if (!(otherSpec instanceof MandolinSpec))
			return false;
		MandolinSpec mandolinSpec = (MandolinSpec) otherSpec;
		if (this.style != mandolinSpec.style)
			return false;
		return true;
	}
}
