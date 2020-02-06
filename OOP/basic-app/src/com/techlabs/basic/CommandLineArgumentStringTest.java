package com.techlabs.basic;

public class CommandLineArgumentStringTest {
	public static void main(String[] args) {
//Sejal Tejashree Pawan Murtuza Jai Pawan Vinit Prasad Rishikesh
		normalForLoop(args);
		advancedForLoop(args);
		namesContainingA(args);
		maxLengthName(args);
		minLengthName(args);
		replaceAByO(args);
	}

	private static void normalForLoop(String[] names) {
		System.out.println("----Normal For:----");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println();
	}

	private static void advancedForLoop(String[] names) {
		System.out.println("----Advanced For:----");
		for (String tempName : names) {
			System.out.println(tempName);
		}
		System.out.println();
	}

	private static void namesContainingA(String[] names) {
		System.out.println("----Names containing 'a':----");
		for (String tempName : names) {
			if (tempName.contains("a") || (tempName.contains("A"))) {
				System.out.println(tempName);
			}
		}
		System.out.println();
	}

	private static void minLengthName(String[] names) {
		System.out.println("----Minimum length name:----");

		String minLengthName = names[0];
		int length = minLengthName.length();

		for (int i = 1; i < names.length; i++) {
			if (names[i].length() < length) {
				length = names[i].length();
				minLengthName = names[i];
			}
		}

		System.out.println("The name " + minLengthName + " has the minimum length of " + length);
		System.out.println();
	}
	private static void maxLengthName(String[] names) {
		System.out.println("----Maximum length name:----");

		String maxLengthName = names[0];
		int length = maxLengthName.length();

		for (int i = 1; i < names.length; i++) {
			if (names[i].length() > length) {
				length = names[i].length();
				maxLengthName = names[i];
			}
		}

		System.out.println("The name " + maxLengthName + " has the maximum length of " + length);
		System.out.println();
	}

	private static void replaceAByO(String[] names) {
		System.out.println("----Replace 'a' by 'o':----");
		for (String tempName : names) {
			tempName = tempName.replace('a', 'o');
			tempName = tempName.replace('A', 'O');

			System.out.println(tempName);
		}
		System.out.println();
	}
}
