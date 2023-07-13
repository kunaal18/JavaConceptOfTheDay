package com.practice.mislleneous;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		// 4,5,1,2,3
		rotate(a, 3);
		// rotate(a, 4);

		System.out.println(Arrays.toString(a));
	}

	private static void rotate(int[] a, int k) {

//		k = k % a.length;
//		if (k < 0) {
//			k = k + a.length;
//		}
		// left
//		reverse(a,0,k-1);
//		reverse(a,k,a.length-1);
//		reverse(a,0,a.length-1);
		
		reverse(a, k, a.length-1);
		reverse(a, 0, k-1);
		reverse(a, a.length-1, 0);

		// right
//		reverse(a, 0, a.length - 1); // 5,4,3,2,1
//		reverse(a, 0, k - 1); // 3,4,5,2,1
//		reverse(a, k, a.length - 1);

//		reverse(a, a.length - k, a.length - 1);
//		reverse(a, 0, a.length - k - 1);
//		reverse(a, 0, a.length - 1);

	}

	private static void reverse(int[] a, int start, int end) {

		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}
}
