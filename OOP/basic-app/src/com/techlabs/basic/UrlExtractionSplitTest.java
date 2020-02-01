package com.techlabs.basic;

public class UrlExtractionSplitTest {

	public static void main(String[] args) {

	//	String url = "www.swabhav.com/?name=sejal";
		String url = "www.swabhav.com/?name=sejal&role=developer";
	//	String url = "www.swabhav.com/?role=developer";
		String[] splitString = url.split("\\.");
		String companyName, name , role;
		
		companyName = splitString[1];	
		System.out.println("Company name :" + companyName);

		for (int i = 0; i <  splitString[2].length(); i++) {
		
			if(splitString[2].charAt(i) == '?'){
				String[] splitString2 = splitString[2].split("\\?");
				
				String[] splitString3 = splitString2[1].split("\\=");
				
				
				if(splitString3.length == 3) {
					
					String[] splitString4 = splitString3[1].split("\\&");
					
					name = splitString4[0];
					role = splitString3[2];
					System.out.println("Name :" + name);
					System.out.println("Role :" + role);

				}
				else if (splitString3.length == 2) {
					if(splitString3[0].equals("name")) {
						name = splitString3[1];
						System.out.println("Name :" + name);
						
					}
					else if (splitString3[0].equals("role")) {
						role = splitString3[1];
						System.out.println("Role :" + role);
					}
				}
				
			}
		}
	}
}
