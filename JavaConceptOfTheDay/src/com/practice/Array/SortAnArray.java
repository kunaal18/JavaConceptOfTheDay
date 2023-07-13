package com.practice.Array;

import java.util.Arrays;

public class SortAnArray {
	public static void main(String[] args) {
		int ar[] = { 4, 7, 1, 5, 2, 9, 7 };

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < ar[i + 1]) {
				int temp = ar[i + 1];
				ar[i + 1] = ar[i];
				ar[i] = temp;
			}
		}
		System.out.println(Arrays.toString(ar));

	}
}
