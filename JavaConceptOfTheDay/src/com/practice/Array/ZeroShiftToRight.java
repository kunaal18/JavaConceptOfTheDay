package com.practice.Array;

import java.util.Arrays;

public class ZeroShiftToRight {
	public static void main(String[] args) {
		int ar[] = { 2, 5, 0, 3, 0, 2, 0, 6 };

		int newArray[] = new int[ar.length];
		int count = 0;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != 0) {
				newArray[count] = ar[i];
				count++;
			}
		}
		System.out.println(Arrays.toString(newArray));
	}
}
