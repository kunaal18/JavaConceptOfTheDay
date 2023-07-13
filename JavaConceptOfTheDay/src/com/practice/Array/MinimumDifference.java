package com.practice.Array;

import java.util.ArrayList;

public class MinimumDifference {
	public static void main(String[] args) {
		int ar[] = { 5, -3, 7, -2 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < ar.length; i++) {
			int diff = ar[i];
			for (int j = i + 1; j < ar.length; j++) {
				diff = ar[i] - ar[j];
				list.add(diff);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < 0) {
				Integer integer = list.get(i) * (-1);
				System.out.println(list.get(i));
			}
		}
		
		
		//list.stream().forEach(System.out::println);
	}
}
