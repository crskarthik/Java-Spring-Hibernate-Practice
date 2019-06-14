package com.karthik.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {
		String jdbcURL = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimeZone=UTC";
		String user="hbstudent";
		String password="hbstudent";
		try {
			Connection myconn = DriverManager.getConnection(jdbcURL,user,password);
			System.out.println("Successful");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
