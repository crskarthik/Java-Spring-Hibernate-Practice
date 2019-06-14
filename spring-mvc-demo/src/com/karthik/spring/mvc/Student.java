package com.karthik.spring.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.*;

import com.karthik.spring.mvc.validation.CourseCode;

public class Student {
	private String firstName;
	@NotNull(message="is required")
//	@NotBlank(message = "Cannot be empty")
	@Size(min=1, message = "is required")
	private String lastName;
	private String country;
	private LinkedHashMap<String , String>countryOptions;
	private String progLanguage;
	private String[] os;
	
	@NotNull(message = "is required")
	@Min(value = 1, message = "must be greater than or equal to one")
	@Max(value = 8, message = "must be less than or equal to 8")
	private Integer semester;
	
	@Pattern(regexp = "^[0-9]{5}", message="only 5 digits")
	private String zipCode;
	
	@NotNull(message="is required")
//	@CourseCode(value = "SEM",message = "must start with SEM")
//	@CourseCode
	@CourseCode(value = {"SEM","TRIME"},message="can be either SEM or TRIME")
	private String courseCode;
	
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Integer getSemester() {
		return semester;
	}

	public void setSemester(Integer semester) {
		this.semester = semester;
	}

	public String[] getOs() {
		return os;
	}

	public void setOs(String[] os) {
		this.os = os;
	}

	public String getProgLanguage() {
		return progLanguage;
	}

	public void setProgLanguage(String progLanguage) {
		this.progLanguage = progLanguage;
	}

	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("USA", "United States of America");
		countryOptions.put("IN", "India");
		countryOptions.put("DE", "Germany");
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
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
}
