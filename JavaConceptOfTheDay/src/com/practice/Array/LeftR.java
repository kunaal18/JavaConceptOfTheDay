package com.practice.Array;

import java.util.Arrays;

public class LeftR {

	public static void getReverse(int ar[], int start, int end) {

		while (start < end) {
			int temp = ar[start];
			ar[start] = ar[end];
			ar[end] = temp;
			start++;
			end--;
		}

	}

	public static void main(String[] args) {
		int ar[] = { 3, 6, 8, 1, 4, 5 };
		int k = 3;
		// 8,1,4,5,3,6

		getReverse(ar, 0, k - 1);
		System.out.println(Arrays.toString(ar));

		
		getReverse(ar, k, ar.length - 1);
		System.out.println(Arrays.toString(ar));

		getReverse(ar, 0, ar.length - 1);
		System.out.println(Arrays.toString(ar));

	}
}
