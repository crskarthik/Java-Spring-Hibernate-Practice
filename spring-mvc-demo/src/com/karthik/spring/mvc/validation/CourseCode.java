package com.karthik.spring.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.*;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	public String[] value() default {"SEM","TEMP"};
	public String message() default "must start with SEM";
	public Class<?>[] groups() default{};
	public Class<? extends Payload>[] payload() default {};
}
