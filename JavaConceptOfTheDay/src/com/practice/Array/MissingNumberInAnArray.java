package com.practice.Array;

import java.util.stream.IntStream;

public class MissingNumberInAnArray {

	public static void getMissing(int ar[]) {

	}

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };

		Integer sumOfOneToTen = IntStream.range(1, 11).boxed().reduce(0, (a, b) -> a + b);
		// System.out.println(sumOfOneToTen); // 1+2+3+4+5+6+7+8+9+10 =55
		int actualSumOfarray = 0;
		for (int i = 0; i < ar.length; i++) {
			actualSumOfarray = actualSumOfarray + ar[i]; // 1+2+3+4+6+7+8+9+10=50
		}

		int missing = sumOfOneToTen - actualSumOfarray;
		System.out.println(missing + " is missing");

	}
}
