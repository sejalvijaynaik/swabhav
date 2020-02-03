package com.techlabs.stringimmutable;

public class StringImmutableTest {
	public static void main(String[] args)
	{
		String name = "sejal";
		
		System.out.println("Before modifying name is :" + name);
		
		name.replace('s', 't');
		
		System.out.println("After modifying name is :" + name);
		
		String name2 = name.replace('s', 't');
		
		System.out.println("After modifying and assigning a new reference name is:" + name);
		System.out.println("After modifying and assigning a new reference name2 is:" + name2);

		
	}

}
