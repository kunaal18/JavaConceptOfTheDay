package com.practice.mislleneous;

import java.util.Arrays;

public class ReverseArray {
	private static void getReverse(int[] ar, int start, int end) {
		while (start < end) {
			int temp = ar[start];
			ar[start] = ar[end];
			ar[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int ar[] = { 10, 34, 23, 56, 78, 89, 65 }; //
		int k = 3;

		// 23,34,10,65,89,78,56

		getReverse(ar, k, ar.length - 1);
		getReverse(ar, 0, k - 1);
		getReverse(ar, 0, ar.length - 1);
		System.out.println(Arrays.toString(ar));

	}

}
