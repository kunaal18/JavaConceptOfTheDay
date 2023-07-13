package com.practice.Array;

import java.util.Arrays;

public class ReverseAnArrayWithoutUsingInbuitMethod {

	public static void getReverse(int a[]) {
		int i = 0;
		int j = a.length - 1;
		while (i < j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(a));

	}

	public static void main(String[] args) {
		int ar[] = { 23, 12, 56, 78, 32, 90 };
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		for (int i = 0; i < ar.length / 2; i++) {
			int temp = ar[i];
			ar[i] = ar[ar.length - 1 - i];
			ar[ar.length - 1 - i] = temp;
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		getReverse(a);

	}
}
