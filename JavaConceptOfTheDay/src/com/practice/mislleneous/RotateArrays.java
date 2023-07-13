package com.practice.mislleneous;

import java.util.Arrays;

public class RotateArrays {

	public static void reverse(int ar[], int start, int end) {

		while (start < end) {
			int temp = ar[start];
			ar[start] = ar[end];
			ar[end] = temp;
			start++;
			end--;
		}

	}

	public static void rotateArray(int ar[], int k) {
		reverse(ar, k, k);

	}

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5 };
		rotateArray(ar, 3);
		System.out.println(Arrays.toString(ar));
		System.out.println('j'+'a'+'v'+'a');
	}
}
