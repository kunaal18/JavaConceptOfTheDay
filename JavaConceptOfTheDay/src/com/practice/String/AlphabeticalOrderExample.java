package com.practice.String;

import java.util.stream.Stream;

public class AlphabeticalOrderExample {
	public static void main(String[] args) {
		String str = "OpeaanAI";

		// Sort the string in alphabetical order

		Stream.of(str.split("")).sorted(String.CASE_INSENSITIVE_ORDER).forEach(i -> System.out.print(i));

	}
}
