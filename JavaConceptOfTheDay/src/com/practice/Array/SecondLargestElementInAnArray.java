package com.practice.Array;

import java.util.Scanner;

public class SecondLargestElementInAnArray {
	public static void getSecondMax(int ar[], int n) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] < ar[j]) {
					int temp = ar[j];
					ar[j] = ar[i];
					ar[i] = temp;
				}
			}
		}

		for (int i = 0; i < ar.length; i++) {
			if (i == n - 1) {
				System.out.println(ar[i]);
			}
		}
	}

	public static void main(String[] args) {
		int ar[] = { 12, 76, 11, 87, 93, 45, 64 };
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		getSecondMax(ar, n);

		// System.out.println("------------------USING JAVA 8
		// FEATURES------------------");
//		Integer integer = IntStream.of(ar).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//		System.out.println(integer);
	}
}
