package com.practice.Array;

import java.util.Arrays;

public class RemoveDublicateElementFromAnArray {

	public static void removeDublicate(int ar[]) {
		int temp[] = new int[1];
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < temp.length; j++) {
				if (ar[i] != ar[j]) {
					temp[count] = ar[j];
					count++;
				}

			}
		}
		System.out.println(Arrays.toString(temp));

	}

	public static void main(String[] args) {
		int[] ar = { 4, 3, 2, 4, 9, 2 };
		removeDublicate(ar);
	}
}
