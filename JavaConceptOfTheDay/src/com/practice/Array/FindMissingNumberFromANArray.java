package com.practice.Array;

import java.util.stream.IntStream;

public class FindMissingNumberFromANArray {
	public static void main(String[] args) {
		int ar[] = { 1, 4, 2, 3, 7, 8, 6 };
		int realSum = 0;

		long actualSum = IntStream.of(ar).summaryStatistics().getSum();

		int max = IntStream.of(ar).summaryStatistics().getMax();
		for (int i = 0; i <= max; i++) {
			realSum = realSum + i;
		}

		long missing = realSum - actualSum;
		System.out.println(missing);

	}
}
