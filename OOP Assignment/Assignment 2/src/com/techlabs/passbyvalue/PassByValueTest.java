package com.techlabs.passbyvalue;

public class PassByValueTest {
	public static void main(String[] args)
	{
		int[] numbers = {10, 20, 30, 40};
		
		System.out.println("Before modifying in main method");
		for(int i=0; i<numbers.length;i++){
			System.out.println(numbers[i]);
		}
		
		mutableArrayValues(numbers);
		
		System.out.println("After modifying in main method");
		for(int i=0; i<numbers.length;i++){
			System.out.println(numbers[i]);
		}
	}

	private static void mutableArrayValues(int[] numbers) {
		
		System.out.println("After modifying in mutableArrayValues method");
		for(int i=0; i<numbers.length;i++) {
			numbers[i] = 0;
			System.out.println(numbers[i]);
		}
	}
}
