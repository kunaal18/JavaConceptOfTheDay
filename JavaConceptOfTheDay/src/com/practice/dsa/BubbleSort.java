package com.practice.dsa;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int ar[] = { 3, 2, 6, 1, 8, 9 };
		for (int i = 0; i < ar.length; i++) {
			int flag = 0;
			for (int j = 0; j < ar.length - 1 - i; j++) {
				if (ar[j] > ar[j + 1]) {
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		System.out.println(Arrays.toString(ar));
	}
}
