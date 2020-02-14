package com.techlabs.person;

import java.io.Serializable;

public class Person implements Serializable {
	private final String name;
	private final int age;
	private final GenderType gender;
	private float height;
	private float weight;
	private String bmiStatus;
	private static int count;
	static {
		count = 0;
		//System.out.println("Static count");
	}

	public Person(String name, int age, GenderType gender, float height, float weight) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		
		count++;
		//System.out.println("Constructor count");
	}
	
	public Person(String name, int age) {
		this(name, age, GenderType.FEMALE, 150, 50);
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public GenderType getGender() {
		return gender;
	}
	
	public float getHeight() {
		return height;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public String getBmiStatus() {
		return bmiStatus;
	}
	
	public static int headCount() {
		return count;
	}
	
	public void workout() {
		weight = weight - (0.05f*weight);
	}
	
	public void eat() {
		weight = (weight + (0.1f)*weight);
		height = height + (0.01f*height);
	}
	
	public void BmiCalculator() {
		double bmi = weight/(Math.pow((height/100f),2f));
		if(bmi < 18.5)
			bmiStatus = "Underweight";
		if(bmi >= 18.5 && bmi < 24.9)
			bmiStatus = "Healthy";
		if(bmi >=24.9 && bmi >30)
			bmiStatus = "Overweight";
		if(bmi >= 30)
			bmiStatus = "Obese";
	}
	@Override
	public String toString() {
		String superToString = super.toString();
		return superToString + "\nName :" + this.name + " Age :" + this.age;
		
	}
	
	@Override
	public boolean equals(Object object) {
		Person person = (Person)object;
		if ((this.name.equalsIgnoreCase(person.name)) && (this.age == person.age))
			return true;
		return false;
	}
}
