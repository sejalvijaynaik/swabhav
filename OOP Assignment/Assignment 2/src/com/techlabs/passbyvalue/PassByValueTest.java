package com.techlabs.passbyvalue;

public class PassByValueTest {
	public static void main(String[] args)
	{
		int number = 10;
		System.out.println("The value of number before passing is :" + number);
		
		changeNumverValue(number);
		
		System.out.println("The value of number after passing is :" + number);
		System.out.println("The value of number does not change since only the value is passed and not the address of the number");
	}

	private static void changeNumverValue(int number) {
		
		number = number + 10;
		System.out.println("The value of number after modifying inside the method is :" + number);
	}

}
