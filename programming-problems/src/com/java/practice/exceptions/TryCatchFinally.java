package com.java.practice.exceptions;

public class TryCatchFinally {
	public static void main(String[] args) {
		try {
			System.out.println("Try one");
			System.exit(0);
			int i = 10 / 0;
			System.out.println("Try two");
		} catch (Exception e) {
			System.out.println("Catch block");
//		} catch (ArithmeticException ae) {
//			System.out.println("ArithmeticException Catch block");
		} finally {
			System.out.println("Finally");
		}
	}
}
