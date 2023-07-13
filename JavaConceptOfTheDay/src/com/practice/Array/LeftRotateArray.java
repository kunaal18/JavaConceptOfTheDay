package com.practice.Array;

import java.util.Arrays;

public class LeftRotateArray {
	public static void reversed(int ar[], int start, int end) {

		while (start < end) {
			int temp = ar[start];
			ar[start] = ar[end];
			ar[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int ar[] = { 3, 6, 7, 2, 8, 9 };
		// left rotate 2
//		{7,2,8,9,3,6}
		int k = 2;

		reversed(ar, 0, k - 1);
		
		reversed(ar, k, ar.length - 1);

		reversed(ar, 0, ar.length - 1);
		System.out.println(Arrays.toString(ar));
	}
}
