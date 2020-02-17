package com.techlabs.test;

import java.util.ArrayList;
import com.techlabs.intwrapper.IntWrapper;

public class BoxingTest {

	public static void main(String[] args) {
		ArrayList<IntWrapper> intNumbers = new ArrayList<>();
		intNumbers.add(new IntWrapper(10));
		System.out.println(intNumbers.get(0).getIntValue());
		
		ArrayList<Integer> intNumbersAuto = new ArrayList<>();
		intNumbersAuto.add(20);
		System.out.println(intNumbersAuto.get(0));
	}
}
