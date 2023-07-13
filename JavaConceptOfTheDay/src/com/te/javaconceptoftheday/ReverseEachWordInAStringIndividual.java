package com.te.javaconceptoftheday;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordInAStringIndividual {

	public static void getReverse(String st) {
		String[] split = st.split(" ");
		String reverseString = "";
		for (int i = 0; i < split.length; i++) {
			String reverseWord = "";
			String word = split[i];
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(i);
			}
			reverseString = reverseString + reverseWord + " ";
		}
		System.out.println(reverseString);
	}

	public static void main(String[] args) {
		String st = "java concept of the day";

		// Stream.of(st.split(" ")).reduce((i, j) -> j + " " +
		// i).ifPresent(System.out::println);
		// day the of concept java

		getReverse(st);
		System.out.println("------------------USING JAVA 8 FEATURES------------------");

		String collect = Stream.of(st.split(" ")).map(i -> new StringBuffer(i).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(collect);

	}
}
