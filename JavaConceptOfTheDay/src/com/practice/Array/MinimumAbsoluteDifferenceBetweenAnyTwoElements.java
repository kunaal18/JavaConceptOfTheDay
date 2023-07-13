package com.practice.Array;

import java.util.ArrayList;
import java.util.HashMap;

public class MinimumAbsoluteDifferenceBetweenAnyTwoElements {

	public static void main(String[] args) {
		int ar[] = { 5, -3, 7, -2 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < ar.length; i++) {
			int res = ar[i];
			for (int j = i + 1; j < ar.length; j++) {
				int diff = ar[i] - ar[j];
				list.add(diff);
				map.put(ar[i] + " " + ar[j], diff);
			}
		}
//		for (int j = ar.length - 1; j >= 0; j--) {
//			int rs = ar[j];
//			for (int k = ar.length - 2; k <= 0; k--) {
//				rs = rs + ar[k];
//				int dif = ar[j] - ar[k];
//				map.put(ar[j] + " " + ar[k], dif);
//			}
//		}
		Integer min = list.stream().min(Integer::compareTo).get();
		map.entrySet().stream().filter(i -> i.getValue() == min).forEach(l -> {
			System.out.println(l.getValue() + "-->" + l.getKey());
		});

	}
}
