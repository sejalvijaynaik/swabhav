package com.techlabs.beverage.test;

import com.techlabs.beverage.Beverage;
import com.techlabs.condamints.Mocha;
import com.techlabs.condamints.Soy;
import com.techlabs.condamints.Whip;
import com.techlabs.expresso.Expresso;
import com.techlabs.house.blend.coffee.HouseBlendCoffee;

public class BeverageTest {
	public static void main(String[] args) {
		
		Beverage beverage1 = new Mocha(new Whip(new Expresso()));
		System.out.println(beverage1.getDescription());
		System.out.println(beverage1.cost());
		
		Beverage beverage2 = new Soy(new Whip(new Mocha(new HouseBlendCoffee())));
		System.out.println(beverage2.getDescription());
		System.out.println(beverage2.cost());
	}

}
