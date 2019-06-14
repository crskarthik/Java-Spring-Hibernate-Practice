package com.java.practice.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindElementInArrayOfArrays {
	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		int numOfTestCases = Integer.parseInt(br.readLine());
		while (numOfTestCases > 0) {
			System.out.println("numOfTestCases"+numOfTestCases);
			// Scan array dimensions

			String[] dim = br.readLine().split(" ");
			int m = Integer.parseInt(dim[0]);
			int n = Integer.parseInt(dim[1]);
			
			String[] inpString = br.readLine().split(" ");
			int[][] inp = new int[m][n];
			int stringCounter = 0;
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					inp[i][j] = Integer.parseInt(inpString[stringCounter]);
					stringCounter++;
				}
			}
			int target = Integer.parseInt(br.readLine());
			System.out.println(helper(inp, target,m,n));
			numOfTestCases--;
		}
	}

	public static int helper(int[][] inp, int target,int m,int n) {
		
		int i=0,j=0;
		while(i<m&&j<n) {
		System.out.println("i: "+i+" j:"+j);
			if(inp[i][j]==target) {
				return 1;
			}
			if(j<n) {
				j++;
			}
			if(j>=n) {
				j=0;
				i++;
			}else if(inp[i][j]>target) {
				j=0;i++;
			}

			
		}
		return 0;
	}
}
