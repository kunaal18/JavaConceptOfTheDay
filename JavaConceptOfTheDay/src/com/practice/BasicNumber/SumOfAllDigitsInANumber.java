package com.practice.BasicNumber;

import java.util.stream.Stream;

public class SumOfAllDigitsInANumber {

	public static void name(int n1) {

		String st = n1 + "";
		String[] split = st.split(""); // ["9","7","8","6"]
		int sum = 0;
		for (String string : split) {
			int parseInt = Integer.parseInt(string);
			sum = sum + parseInt;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int n = 89127;
		int sum = 0;
		while (n != 0) {
			int d = n % 10;
			sum = sum + d;
			n = n / 10;

		}
		System.out.println(sum);

		int n1 = 9867;
		int sum2 = Stream.of(String.valueOf(n1).split("")).mapToInt(Integer::parseInt).sum();
		System.out.println(sum2);

		name(n1);
	}
}
