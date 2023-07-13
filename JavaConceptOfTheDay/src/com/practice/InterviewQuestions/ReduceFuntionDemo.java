package com.practice.InterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class ReduceFuntionDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		List<String> listOfStrings = Arrays.asList("first", "second", "third", "fourth", "fifth");

		Integer sum = list.stream().reduce(0, (a, b) -> a + b);
		System.out.println("Sum : " + sum);

		Integer multiply = list.stream().reduce(1, (a, b) -> a * b);
		System.out.println("Multiply : " + multiply);

		Integer max = list.stream().reduce(0, (a, b) -> a > b ? a : b);
		Integer max1 = list.stream().reduce(Integer::max).get();
		System.out.println("Max : " + max);

		// longest string
		String longestString = listOfStrings.stream().reduce((a, b) -> a.length() > b.length() ? a : b).get();
		System.out.println("Longest String : " + longestString);

	}
}
