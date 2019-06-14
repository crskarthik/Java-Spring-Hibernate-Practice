package com.karthik.spring_json_practice;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		try {
			ObjectMapper om = new ObjectMapper();

			Student student = om.readValue(new File("data/sample-full.json"),
					Student.class);
			System.out.println(student.getFirstName());
			System.out.println(student.getAddress().getCountry());
			System.out.println(student.getLanguages()[0]);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
