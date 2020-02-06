package com.techlabs.basic;

public class CommandLineArgumentIntTest {
	public static void main(String[] args) {

		int[] numbers = new int[args.length];
		
		System.out.println("Before sort :");
		for (int i = 0; i < args.length; i++) {
			numbers[i] = Integer.parseInt(args[i]);
			System.out.println(numbers[i]);
		}
		System.out.println();

		numbers = sort(numbers);
		
		System.out.println("After sort :");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	public static int[] sort(int[] numbers) {
		int[] tempArray = new int[numbers.length];
		int length = numbers.length -1;
		for (int i=0; i<numbers.length; i++) {
			if(numbers[i] == 0) {
				tempArray[i] = tempArray[i];
			}
			
			else {
				tempArray[length] = numbers[i];
				length --;
			}
		}
		return tempArray;
	}
}
