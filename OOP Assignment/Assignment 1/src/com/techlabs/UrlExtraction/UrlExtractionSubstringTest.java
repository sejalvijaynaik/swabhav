package com.techlabs.UrlExtraction;

public class UrlExtractionSubstringTest {
	public static void main(String[] args) {

		// String url = "www.swabhavtechlabs.com/?name=sejal";
		String url = "www.swabhavtechlabs.com/?name=sejal&role=developer";
		// String url = "www.swabhavtechlabs.com/?role=developer";
		// String url = "www.swabhavtechlabs.com";

		String companyName, name, role;

		int andIndex = 0,questionMarkIndex = 0;
		int equal1Index = 0, equal2Index = 0;

		int dot1Index = url.indexOf('.');
		int dot2Index = url.indexOf('.', dot1Index + 1);

		companyName = url.substring(dot1Index + 1, dot2Index);
		System.out.println("Company Name :" + companyName);

		equal1Index = url.indexOf('=');
		equal2Index = url.indexOf('=', equal1Index + 1);
		questionMarkIndex = url.indexOf('?');
		andIndex = url.indexOf('&');

		// System.out.println("equal 1 " + equal1Index);
		// System.out.println("equal 2 " + equal2Index);

		if (equal1Index != -1 && equal2Index != -1) {
			name = url.substring(equal1Index + 1, andIndex);
			role = url.substring(equal2Index + 1);
			System.out.println("Name :" + name);
			System.out.println("Role :" + role);
		}

		else if (equal1Index != -1 && equal2Index == -1) {
			if (url.substring(questionMarkIndex + 1, equal1Index).equals("name")) {
				name = url.substring(equal1Index + 1);
				System.out.println("Name :" + name);
			} else {
				role = url.substring(equal1Index + 1);
				System.out.println("Role :" + role);
			}
		}
	}
}
