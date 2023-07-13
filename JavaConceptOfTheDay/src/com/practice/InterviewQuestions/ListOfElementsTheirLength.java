package com.practice.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListOfElementsTheirLength {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "grape", "pear");
		// output: 4=[pear],5=[apple,grape],6-[banana]
		Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(collect);

		List<String> asList = Arrays.asList("Hello", " ", "world", "!");
		// Output : Hello world!

		String collect2 = asList.stream().collect(Collectors.joining());
		System.out.println(collect2);
	}
}
