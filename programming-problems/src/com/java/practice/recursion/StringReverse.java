package com.java.practice.recursion;

public class StringReverse {

	public static void main(String[] args) {
		String str="abcd";
		System.out.println(stringReverse(str, str.length()-1));
	}

	public static String stringReverse(String str, int n) {
		if (n < 0) {
			return "";
		}
		return str.charAt(n) + stringReverse(str, n - 1);
	}
}