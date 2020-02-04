package com.techlabs.stringimmutable;

public class StringImmutable2Test {
	public static void main(String[] args) {
		
		String str1 = new String("Hello"), str2 = new String("Hello");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		System.out.println("str1 :" + str1);
		System.out.println("str2 :" + str2);
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
	//	str1 = str2;
	//	System.out.println("str1 :" + str1);
	//	System.out.println("str2 :" + str2);
	//	System.out.println(str1 == str2);
	//	System.out.println(str1.equals(str2));

	//	str2 = str1;
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println("str1 :" + str1);
		System.out.println("str2 :" + str2);
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}

}
