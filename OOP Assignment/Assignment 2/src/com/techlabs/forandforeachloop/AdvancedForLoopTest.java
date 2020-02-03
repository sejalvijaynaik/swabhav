package com.techlabs.forandforeachloop;

public class AdvancedForLoopTest {
	public static void main(String[] args)
	{
		String[] names = { "Sejal", "Tejashree", "Pawan", "Murtuza", "Jai", "Pawan", "Vinit", "Prasad", "Rishikesh" };
		System.out.println("Before replacing 'a' by 'o'");
		displayNames(names);
		
		for(String tempName : names)
		{
			tempName = tempName.replace('a', 'o');
			tempName = tempName.replace('A', 'O');
		}
		
		System.out.println("After replacing 'a' by 'o'");

		displayNames(names);
	}
	
	private static void displayNames(String[] names)
	{
		for(int i=0; i<names.length; i++)
		{
			System.out.println(names[i]);
		}
	}
}
