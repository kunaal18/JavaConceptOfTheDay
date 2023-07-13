package com.te.javaconceptoftheday;

public class IntersectionOfTwoArray {
	public static void main(String[] args) {
		int ar1[] = { 11, 76, 34, 22 };
		int ar2[] = { 22, 43, 56, 76 };

		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar2.length; j++) {
				if (ar1[i] == ar2[j] && i != j) {
					System.out.println(ar1[i]);
				}
			}
		}

	}
}
