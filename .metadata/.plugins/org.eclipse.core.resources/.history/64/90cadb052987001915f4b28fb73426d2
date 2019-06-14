package com.java.practice.hackerrank;

public class MaxSumInArray {
	public static void main(String[] args) {
		int[] inp = new int[] { 5, 5, 10, 100, 10, 5 };
//		int[] oup = maxSum(inp);
//		for (int i = 0; i < oup.length; i++) {
//			System.out.print(oup[i] + " ");
//		}
		maxSumNum(inp);
	}

	public static int[] maxSum(int[] inp) {
		if (inp.length <= 3) {
			return new int[] { 0, 0 };
		}
		int[] maxSumArray = new int[2];
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < inp.length; i++) {
			int rightExtend = i == 0 ? inp.length - 1 : inp.length;
			int leftExtend = i == inp.length - 1 ? 1 : 0;
			for (int j = leftExtend; j < rightExtend && i != j && i + 1 != j
					&& i - 1 != j; j++) {
				if (maxSum < inp[i] + inp[j]) {
					maxSum = inp[i] + inp[j];
					maxSumArray[0] = inp[i];
					maxSumArray[1] = inp[j];
				}
			}
		}
		System.out.println("Max sum is:" + maxSum);
		return maxSumArray;
	}

	public static void maxSumNum(int[] inp) {
		if (inp.length <= 2) {
			System.out.println("Max sum is:" + 0);
		}
		int maxSum = Integer.MIN_VALUE;
		int sumPerIteration = Integer.MIN_VALUE;
		for (int i = 0; i < inp.length; i++) {
			int rightExtend = i == 0 ? inp.length - 1 : inp.length;
			int leftExtend = i == inp.length - 1 ? 1 : 0;
			sumPerIteration = inp[i];
			for (int j = leftExtend; j < rightExtend && i != j && i + 1 != j
					&& i - 1 != j; j++) {
				sumPerIteration += + inp[j];
			}
			maxSum = sumPerIteration > maxSum ? sumPerIteration : maxSum;
		}
		System.out.println("Max sum is:" + maxSum);
	}
}
