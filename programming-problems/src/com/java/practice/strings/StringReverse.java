package com.java.practice.strings;

public class StringReverse {
	public static void main(String[] args) {
		System.out.println(reverseString("a%b$c"));
//		reverseString("a%b$c");
	}

	public static String reverseString(String str) {
		String temp = "";
		char[] chars = str.toCharArray();
		int i = 0, j = str.length() - 1;
		for (i = 0; i < j; i++) {
			boolean shouldBeReplaced = false;
			if ((chars[i] >= 'a' && chars[i] <= 'z')
					|| (chars[i] >= 'A' && chars[i] <= 'Z')) {
				shouldBeReplaced = true;
				while (shouldBeReplaced) {
					if ((chars[j] >= 'a' && chars[j] <= 'z')
							|| (chars[j] >= 'A' && chars[j] <= 'Z')) {
						char buffer = chars[i];
						chars[i] = chars[j];
						chars[j] = buffer;
						shouldBeReplaced = false;
					}
					j--;
				}
			}
		}
		for (int k = 0; k < chars.length; k++) {
			temp += chars[k];
		}
		return temp;
	}
}
