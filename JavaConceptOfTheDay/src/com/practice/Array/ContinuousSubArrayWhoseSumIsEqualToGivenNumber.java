package com.practice.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContinuousSubArrayWhoseSumIsEqualToGivenNumber {
	public static void getContinuousArray(int ar[], int find) {
		List<Integer> list = new ArrayList<>();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < ar.length; i++) {
			int sum = ar[i];
			String st = " " + ar[i];
			for (int j = i + 1; j < ar.length; j++) {
				sum = sum + ar[j];
				st = st + "," + ar[j];
				map.put(sum, st);

				list.add(sum);
			}
		}
		map.entrySet().forEach(i -> {
			if (i.getKey().equals(find)) {
				System.out.println("{" + i.getValue() + "}");
			}
		});
	}

	public static void main(String[] args) {
		int ar[] = { 12, 5, 31, 9, 21, 8,1,3,100,50,25,25,100 };
		int find = 17;
		getContinuousArray(ar, find);

	}
}
