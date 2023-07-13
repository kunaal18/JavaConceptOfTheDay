package com.practice.BasicNumber;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseAnInteger {
	private static void getReverse(int n) {
		int rev = 0;
		while (n > 0) {
			int d = n % 10;
			rev = rev * 10 + d;
			n = n / 10;
		}
		System.out.println(rev);

	}

	public static void main(String[] args) {
		int n = 3657;
		// getReverse(n);
		System.out.println("Second Way");

		String collect = Stream.of(String.valueOf(n)).map(i -> new StringBuffer(i).reverse())
				.collect(Collectors.joining());

		System.out.println(collect);
	}

}
