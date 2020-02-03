package com.techlabs.basic;

public class StringArrayForLoopTest {
	public static void main(String[] args) {
		
		String[] names = { "Sejal", "Tejashree", "Pawan", "Murtuza", "Jai", "Pawan", "Vinit", "Prasad", "Rishikesh" };
		
		normalForLoop(names);
		advancedForLoop(names);
		namesContainingA(names);
		maxLengthName(names);
		replaceAByO(names);
	}
	
	private static void normalForLoop(String[] names)
	{
		for(int i=0; i<names.length; i++)
		{
			System.out.println(names[i]);
		}
	}
	
	private static void advancedForLoop(String[] names)
	{
		for(String tempName : names)
		{
			System.out.println(tempName);
		}
	}
	
	private static void namesContainingA(String[] names)
	{
		for(String tempName : names)
		{
			if (tempName.contains("a") || (tempName.contains("A")))
			{
				System.out.println(tempName);
			}
		}
	}
	
	private static void maxLengthName(String[] names)
	{
		String maxLengthName = names[0];
		int length = maxLengthName.length();
		
		for (int i=1; i<names.length; i++)
		{
			if (names[i].length()>length)
			{
				length = names[i].length();
				maxLengthName = names[i];
			}
		}
		
		System.out.println("The name " + maxLengthName + " has the maximum length of " + length);
	}
	
	private static void replaceAByO(String[ ]names)
	{
		for (String tempName : names)
		{
			tempName = tempName.replace('a', 'o');
			tempName = tempName.replace('A', 'O');

			System.out.println(tempName);
		}
	}

}
