package com.java.practice.hackerrank;

public class RotateClass {

	public static void main(String[] args) {

		int n = 5;

		int d = 4;

		int[] a = new int[] { 1, 2, 3, 4, 5 };

		int temp = a[0];
		for (int i = 0; i < a.length && d > 0; i++) {
			if (i < a.length - 1) {
				a[i] = a[i + 1];
			} else {
				a[i] = temp;
				temp = a[0];
				i = 0;
				d--;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
