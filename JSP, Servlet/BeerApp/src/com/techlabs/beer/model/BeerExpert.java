package com.techlabs.beer.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {	
	public List<String> getBrands(String color) {
		List<String> brands = new ArrayList<String>();
		if(color.equals("amber")) {
			brands.add("Jack amber");
			brands.add("Red Moose");
		}
		else {
			brands.add("Jail Ale Pale");
			brands.add("Gout Scout");
		}
		return brands;
	}
}
