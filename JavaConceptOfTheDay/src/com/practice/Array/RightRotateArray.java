package com.practice.Array;

import java.util.Arrays;

public class RightRotateArray {

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
		int ar[] = { 12, 45, 76, 23, 81, 55 };
		
		getReverse(ar, 0, ar.length-1-2);
		getReverse(ar, ar.length-1-1, ar.length-1);
		getReverse(ar, 0, ar.length-1);
		System.out.println(Arrays.toString(ar));

		// {81,55,12,45,76,23}
		
		

	}
}
