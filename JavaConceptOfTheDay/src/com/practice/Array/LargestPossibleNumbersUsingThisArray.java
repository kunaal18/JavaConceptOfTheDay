package com.practice.Array;

import java.util.stream.IntStream;

public class LargestPossibleNumbersUsingThisArray {
	public static void main(String[] args) {
		int ar[] = { 8, 6, 0, 4, 6, 4, 2, 7 };

		IntStream.of(ar).boxed().sorted((i, j) -> j - i).forEach(i -> System.out.print(i));
		
		

	}
}
