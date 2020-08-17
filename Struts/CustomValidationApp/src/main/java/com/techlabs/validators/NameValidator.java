package com.techlabs.validators;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class NameValidator extends FieldValidatorSupport {

	private String correctName;

	@Override
	public void validate(Object actionObject) throws ValidationException {

		System.out.println("Name validator called");

		String fieldName = getFieldName();
		String myName = (String) getFieldValue(fieldName, actionObject);

		if (!myName.equals(correctName)) {
			addFieldError(fieldName, actionObject);
		}
	}

	public String getCorrectName() {
		return correctName;
	}

	public void setCorrectName(String correctName) {
		this.correctName = correctName;
	}

}
