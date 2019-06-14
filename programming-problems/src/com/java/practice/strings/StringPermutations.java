package com.java.practice.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringPermutations {
	public static void main(String[] args) {
		for (String s : stringcombinations("abc")) {
//			System.out.println(s);
		}
	}

	public static Set<String> stringcombinations(String s) {
		Set<String> combinations = new HashSet<>();
		ArrayList<String> chars = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			chars.add(s.charAt(i) + "");
		}

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				System.out.println("i: "+i+" j:"+j);
//				combinations.add(swapChar(s, i, j));
				System.out.println(getString(chars));
				String temp = chars.get(i);
				chars.set(i, chars.get(j));
				chars.set(j, temp);
				System.out.println(getString(chars));
				combinations.add(getString(chars));
			}
		}
		return combinations;
	}

	public static String swapChar(String s, int i, int j) {
		char[] chars = s.toCharArray();
		char temp = chars[i];
		chars[i] = chars[j];
		chars[j] = temp;
		return new String(chars);
	}

	public static String getString(ArrayList<String> ch) {
		String s = "";
		for (String s1 : ch) {
			s += s1;
		}
		return s;
	}

}
