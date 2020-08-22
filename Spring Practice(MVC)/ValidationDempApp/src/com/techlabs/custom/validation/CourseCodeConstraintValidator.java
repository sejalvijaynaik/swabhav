package com.techlabs.custom.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	public String coursePrefix;

	@Override
	public void initialize(CourseCode courseCode) {
		coursePrefix = courseCode.value();
	}

	@Override
	public boolean isValid(String userCourseCode, ConstraintValidatorContext arg1) {

		boolean result;

		if (userCourseCode != null) {
			result = userCourseCode.startsWith(coursePrefix);
		} else {
			result = true;
		}
		return result;
	}
}
