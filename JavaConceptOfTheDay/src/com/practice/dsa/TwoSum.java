package com.practice.dsa;

import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args) {
		int ar[] = { 2, 5, 7, 3 };
		int target = 8;
// fill hashmap
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < ar.length; i++) {

			map.put(ar[i], i);
		}
		// searching

		for (int i = 0; i < ar.length; i++) {
			int num = ar[i]; // 2,5,7,3
			int req = target - num;

		}

	}
}
