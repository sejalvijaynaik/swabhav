package com.techlabs.dip.solution.logger.test;

import com.techlabs.dip.violation.logger.Logtype;
import com.techlabs.dip.violation.logger.TaxCalculator;

public class LoggerTest {
	
	public static void main(String[] args) {
		
		TaxCalculator taxCalculator = new TaxCalculator(Logtype.TXT);
		
		double tax = taxCalculator.calculator(1000, 5);
		
		System.out.println("Tax :" + tax);
	}
}
