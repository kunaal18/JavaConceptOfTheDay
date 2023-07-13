package com.practice.InterviewQuestions;

import java.util.Arrays;

public class CompareTwoArray {
	public static boolean get(int ar1[], int ar2[]) {
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		int n = ar1.length;
		int m = ar2.length;

		if (n != m) {
			return false;
		}

		for (int i = 0; i < n; i++) {
			if (ar1[i] != ar2[i])
				return false;

		}
		return true;
	}

	public static void main(String[] args) {
		int ar1[] = { 1, 2, 3, 4, 5 };
		int ar2[] = { 3, 1, 2, 5, 4 };
		System.out.println(get(ar1, ar2));

	}
}
