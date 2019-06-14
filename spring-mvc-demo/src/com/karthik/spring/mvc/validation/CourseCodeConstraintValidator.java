package com.karthik.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String[] coursePrefix;

	@Override
	public void initialize(CourseCode constraintAnnotation) {
		coursePrefix = constraintAnnotation.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext arg1) {
		boolean result = false;
		if (theCode != null) {
			for (String tempPrefix : coursePrefix) {
				result = theCode.startsWith(tempPrefix);
				if (result) {
					break;
				}
			}
		} else {
			return true;
		}
		return result;
	}

}
