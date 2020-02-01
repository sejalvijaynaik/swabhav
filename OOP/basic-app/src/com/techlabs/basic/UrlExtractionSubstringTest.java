package com.techlabs.basic;

public class UrlExtractionSubstringTest {

	public static void main(String[] args) {

		String url = "www.swabhav.com/?name=sejal";
	//	String url = "www.swabhav.com/?name=sejal&role=developer";
	//	String url = "www.swabhav.com/?role=developer";

		String companyName, name, role;
		int  companyNameStart = 0, companyNameEnd = 0, nameStart = 0, roleStart = 0;
		int andIndex = 0, j=0, questionMarkIndex = 0;
		int[] equalCount = new int[2];
		
		for (int i = 0; i < url.length(); i++) {

			if(url.charAt(i) == '.') {
				companyNameStart = companyNameEnd;
				companyNameEnd = i;
			}

			else if (url.charAt(i) == '=') {
				equalCount[j] = i;
				j++;
			}
			else if (url.charAt(i) == '&') {
				andIndex = i;
			}
			else if (url.charAt(i) == '?') {
				questionMarkIndex = i;
			}
		}
		
		companyName = url.substring(companyNameStart + 1, companyNameEnd);
		System.out.println("Company Name :" + companyName);
		
			if(equalCount[0] != 0 && equalCount[1] != 0)
			{
				nameStart = equalCount[0];
				roleStart = equalCount[1];
				
				name = url.substring(equalCount[0] + 1, andIndex);
				role = url.substring(equalCount[1] + 1);
				
				System.out.println("Name :" + name);
				System.out.println("Role :" + role);
			}
			
			else if(equalCount[0] != 0 && equalCount[1]==0) {
				
				if(url.substring(questionMarkIndex + 1, equalCount[0]).equals("name")){
						name = url.substring(equalCount[0] + 1);
						System.out.println("Name :" + name);
					}
					else if(url.substring(questionMarkIndex + 1, equalCount[0]).equals("role")){
						role = url.substring(equalCount[0] + 1);
						System.out.println("Role :" + role);
					}
			}
	}
}
