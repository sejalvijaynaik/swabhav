package com.techlabs.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

	@NotNull(message = "First name is required")
	@Size(min = 1, message = "First name is required")
	private String firstName;

	private String lastName;

	@Min(value = 0, message = "must be greater than or equal to 0")
	@Max(value = 10, message = "must be lesser than or equal to 10")
	@NotNull(message = "This field is required")
	private Integer freePasses;

	@Pattern(regexp = "^[a-zA-Z0-9]{6}", message = "only 6 characters allowed")
	private String pincode;

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

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
