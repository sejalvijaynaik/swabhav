package com.techlabs.basic;

import java.util.Scanner;

public class WebsiteTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the url");

		String url = sc.nextLine();

		String companyName, name, role;

		int dot1 = 0, dot2 = 0, equal1 = 0, equal2 = 0, and1 = 0;

		for (int i = 0; i < url.length(); i++) {

			if (url.charAt(i) == '.') {
				dot1 = dot2;
				dot2 = i;
			}

			if (url.charAt(i) == '=') {
				equal1 = equal2;
				equal2 = i;
			}
			if (url.charAt(i) == '&') {
				and1 = i;
			}
		}

		companyName = url.substring(dot1 + 1, dot2);
		name = url.substring(equal1 + 1, and1);
		role = url.substring(equal2 + 1, url.length());

		System.out.println("Company Name :" + companyName);
		System.out.println("Name :" + name);
		System.out.println("Role :" + role);
		
		sc.close();
	}

}
