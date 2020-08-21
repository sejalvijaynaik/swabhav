package com.techlabs.models;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String favLanguage;
	private LinkedHashMap<String, String> favLanguageOptions;
	private String[] opSystems;

	public Student() {
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("IN", "India");
		countryOptions.put("US", "USA");
		countryOptions.put("FR", "France");
		countryOptions.put("GR", "Germany");

		favLanguageOptions = new LinkedHashMap<String, String>();
		favLanguageOptions.put("Java", "Java");
		favLanguageOptions.put("JavaScript", "JavaScript");
		favLanguageOptions.put("C++", "C++");
		favLanguageOptions.put("C", "C");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavLanguage() {
		return favLanguage;
	}

	public void setFavLanguage(String favLanguage) {
		this.favLanguage = favLanguage;
	}

	public LinkedHashMap<String, String> getFavLanguageOptions() {
		return favLanguageOptions;
	}

	public String[] getOpSystems() {
		return opSystems;
	}

	public void setOpSystems(String[] opSystems) {
		this.opSystems = opSystems;
	}

}
