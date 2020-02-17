package com.techlabs.test;

import java.util.ArrayList;
import com.techlabs.intwrapper.IntWrapper;

public class BoxingTest {

	public static void main(String[] args) {
		/*ArrayList<IntWrapper> intNumbers = new ArrayList<>();
		intNumbers.add(new IntWrapper(10));
		System.out.println(intNumbers.get(0).getIntValue());
		
		ArrayList<Integer> intNumbersAuto = new ArrayList<>();
		intNumbersAuto.add(20);
		System.out.println(intNumbersAuto.get(0));*/
		
		int intNum = 10;
		Integer intObj = new Integer(intNum);
		
		System.out.println("Value of integer object :" + intObj);
		System.out.println("Class of integer object :" + intObj.getClass());
		System.out.println("Value of integer object through method :" + intObj.intValue());
		
		Object obj = 10;
		System.out.println("Class of obj :" + obj.getClass());
		System.out.println("Value of obj :" + obj);
		
		Object objNum = new IntWrapper(20);
		System.out.println("Class of objNum :" + objNum.getClass());
		System.out.println("Value of objNum is :" + objNum);
	}
}
