package com.java.practice.walmart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class SortValuesBeforeXIntoLinkedList {
	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);

		int numOfElements = Integer.parseInt(br.readLine());
		LinkedList<Integer> ll = new LinkedList<>();
		while (numOfElements > 0) {
			numOfElements--;
			ll.addLast(Integer.parseInt(br.readLine()));
		}
		ArrayList<Integer> al = new ArrayList<>();
		int x=6;
		int xIndex=ll.indexOf(x);
		for (int i = xIndex; i < ll.size(); i++) {
			if (ll.get(i) < x) {
				al.add(ll.remove(i));
				i--;
			}
		}
		for (Integer integer : al) {
			IntStream.range(0, ll.size()).filter(j -> ll.get(j) > integer)
					.findFirst().ifPresent(j -> ll.add(j, integer));
		}
		System.out.println("-----------------");
		ll.forEach(System.out::println);

	}
}
