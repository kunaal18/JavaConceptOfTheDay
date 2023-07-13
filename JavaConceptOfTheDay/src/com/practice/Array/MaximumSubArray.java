package com.practice.Array;

import java.util.ArrayList;
import java.util.HashMap;

public class MaximumSubArray {
	public static void main(String[] args) {
		int ar[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < ar.length; i++) {
			int sum = ar[i];
			String st = "" + sum;
			for (int j = i + 1; j < ar.length; j++) {
				sum = sum + ar[j];
				st = st + "," + ar[j];
				map.put(sum, st);
				list.add(sum);
			}
		}
		int max = list.stream().mapToInt(i -> i).summaryStatistics().getMax();

		map.entrySet().stream().filter(i -> i.getKey() == max).forEach(j -> {

			System.out.println(j.getKey() + "----> " + j.getValue());
		});
	}
}
