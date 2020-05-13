package com.techlabs.beer.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.techlabs.beer.model.BeerExpert;

class BeerExpertTest {

	@Test
	void test() {
		BeerExpert beerExpert = new BeerExpert();
		List<String> resultBeer = beerExpert.getBrands("light");
		
		Iterator<String> it = resultBeer.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
