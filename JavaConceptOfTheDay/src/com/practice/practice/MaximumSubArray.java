package com.practice.practice;

import java.util.ArrayList;
import java.util.HashMap;

public class MaximumSubArray {
	public static void main(String[] args) {
		int ar[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < ar.length; i++) {
			sum = ar[i];
			String st = "" + sum;
			for (int j = i + 1; j < ar.length; j++) {
				sum = sum + ar[j];
				st = st + "," + ar[j];
				map.put(sum, st);
				list.add(sum);
			}

		}
		Integer max = list.stream().reduce(0, (a, b) -> a > b ? a : b);
		map.entrySet().stream().filter(i->i.getKey()==max).forEach(System.out::println);
	}
}
