package com.java.practice.hackerrank;

public class MaxDiffInArray {
public static void main(String[] args) {
	int[] arr = new int[] {6,5,2,1,0};
	int min = 0;
	int diff=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[min]>arr[i]) {
			min=i;
		}
		if(arr[i]-arr[min]>diff) {
			diff=arr[i]-arr[min];
		}
		
	}
	System.out.println(diff==0?-1:diff);
}
}
