package com.java.practice.hackerrank;

public class ArrayManipulation {
    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long sum=0;
        long[] arr = new long[n];
        // for(int i=0;i<queries.length;i++){
            int counter = 0;
    for(int j=queries[counter][0]-1;counter<queries.length&&j<queries[counter][1];j++){
                arr[j]+=queries[counter][2];
                if(arr[j]>sum){
                    sum=arr[j];
                }
                if(j==queries[counter][1]-1){
                counter++;
                j=queries[counter][0]-2;
                }
            }
        // }
        return sum;
    }
    public static void main(String[] args) {
		int[][] queries = new int[][] {{1,5,3},{4,8,7},{6,9,1}};
		System.out.println(arrayManipulation(10, queries));
	}
}
