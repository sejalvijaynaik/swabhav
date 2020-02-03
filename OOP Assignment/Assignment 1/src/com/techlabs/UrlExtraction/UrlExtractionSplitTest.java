package com.techlabs.UrlExtraction;

public class UrlExtractionSplitTest {

	public static void main(String[] args) {

		// String url = "www.swabhavtechlabs.com/?name=sejal";
		String url = "www.swabhavtechlabs.com/?name=sejal&role=developer";
		// String url = "www.swabhavtechlabs.com/?role=developer";
		// String url = "www.swabhavtechlabs.com";

		String companyName, name, role;
		int questionMarkIndex = 0;
		questionMarkIndex = url.indexOf('?');
		
		String[] splitString = url.split("\\.");
		companyName = splitString[1];
		System.out.println("Company name :" + companyName);

		if (questionMarkIndex != -1) {
			String[] splitString2 = splitString[2].split("\\?");

			String[] splitString3 = splitString2[1].split("\\=");

			if (splitString3.length == 3) {

				String[] splitString4 = splitString3[1].split("\\&");

				name = splitString4[0];
				role = splitString3[2];
				System.out.println("Name :" + name);
				System.out.println("Role :" + role);

			} else if (splitString3.length == 2) {
				if (splitString3[0].equals("name")) {
					name = splitString3[1];
					System.out.println("Name :" + name);

				} else  {
					role = splitString3[1];
					System.out.println("Role :" + role);
				}
			}

		}

	}
}
