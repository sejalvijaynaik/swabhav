package com.techlabs.basic;

public class EvenOddTest {
	public static void main(String[] args) {
		
		int[] numbers = new int[args.length];
		
		for(int i = 0; i < args.length; i++) {
			numbers[i] = Integer.parseInt(args[i]);
		}
		evenNumberTest(numbers);
		oddNumberTest(numbers);
	}

	private static void oddNumberTest(int[] numbers) {
		System.out.println("Odd Numbers :");
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i]%2 != 0) {
				System.out.println(numbers[i]);
			}
		}
		System.out.println();
	}

	private static void evenNumberTest(int[] numbers) {
		System.out.println("Even Numbers :");
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i]%2 == 0) {
				System.out.println(numbers[i]);
			}
		}
		System.out.println();
	}
}
