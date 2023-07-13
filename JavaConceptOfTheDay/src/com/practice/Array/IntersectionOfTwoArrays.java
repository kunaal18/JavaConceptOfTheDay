package com.practice.Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntersectionOfTwoArrays {
	public static void getIntersection(int a[], int b[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}

			}
		}

	}

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60 };
		int b[] = { 90, 70, 20, 40, 80 };

		int[] array = IntStream.of(a).filter(i -> IntStream.of(b).anyMatch(j -> j == i)).toArray();
		System.out.println(Arrays.toString(array));
		getIntersection(a, b);

	}
}
