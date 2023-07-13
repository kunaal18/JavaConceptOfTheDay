package com.practice.javaeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReduceMethod {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(11, 20, 33, 45, 52);
		int res = numbers.stream().filter(n -> n % 4 == 0).map(n -> n * 2).reduce(0, Integer::sum);
		System.out.println(res);

		// Sum of list
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		// Old Approach
		int sum = 0;
		for (Integer integer : list) {
			sum = sum + integer;
		}
		System.out.println(sum);

		// New Approach

		int sum2 = list.stream().mapToInt(i -> i).sum();
		System.out.println(sum2);

		Integer reduce = list.stream().reduce(0, (a, b) -> a + b);
		System.out.println(reduce);

		Optional<Integer> reduce2 = list.stream().reduce(Integer::sum);
		System.out.println(reduce2.get());

		System.out.println("\nMultiply all list of integer\n");
		Integer mulitply = list.stream().reduce(1, (a, b) -> a * b);
		System.out.println(mulitply);
		System.out.println("\n Biggest value fromm all list of integer\n");
		Integer reduce3 = list.stream().reduce(0, (a, b) -> a > b ? a : b);
		System.out.println(reduce3);

		List<String> list2 = Arrays.asList("India", "Pakistan", "Afghanistan", "Nepal", "Srilanka", "Bhutan");

		System.out.println(
				"\nImplement a program to find the longest word in a list of strings using the reduce operation.\n");

		String string4 = list2.stream().reduce((a, b) -> a.length() > b.length() ? a : b).get();
		System.out.println(string4);

		String string = list2.stream().reduce((a, b) -> a.length() > b.length() ? a : b).get();
		System.out.println(
				"\nGiven a list of strings, write a program to concatenate all the strings into a single string using the reduce operation\n");

		String string2 = list2.stream().reduce((a, b) -> a.concat(b)).get();
		System.out.println(string2);

		System.out.println(
				"\nGiven a list of strings, write a program to find the shortest string using  the reduce operation\n");

		String string3 = list2.stream().reduce((a, b) -> a.length() < b.length() ? a : b).get();
		System.out.println(string3);

		System.out.println(
				"\nImplement a program to count the number of occurrences of a specific character in a list of strings using the reduce operation\n");

		List<String> stringList = Arrays.asList("Hello", "World", "OpenAI", "ChatGPT");
		char character = 'o';

		int reduce4 = stringList.stream().mapToInt(i -> (int) i.chars().filter(j -> j == character).count()).reduce(0,
				Integer::sum);
		System.out.println(reduce4);

		String st = "Programmimmng";
		char ch = 'm';

		long count = st.chars().filter(i -> i == ch).count();
		System.out.println(count);

		System.out.println(
				"\nWrite a program to find the average of all elements in a list of floating-point numbers using the reduce operation\n");

		ArrayList<Float> arrayList = new ArrayList<Float>();
		arrayList.add(23.9f);
		arrayList.add(12f);
		arrayList.add(25.7f);
		arrayList.add(23.9f);

		double average = arrayList.stream().mapToDouble(i -> i).summaryStatistics().getAverage();
		System.out.println(average);

		Float float1 = arrayList.stream().reduce((a, b) -> a + b).get();
		System.out.println(float1 / arrayList.size());

		System.out.println(
				"\nGiven a list of integers, write a program to find the factorial of each number using the reduce operation\n");

		List<Integer> asList = Arrays.asList(3, 5, 6, 2);
		asList.stream().forEach(i -> {
			int reduce5 = IntStream.rangeClosed(1, i).reduce(1, (a, b) -> a * b);
			System.out.println(reduce5);
		});

		System.out.println(
				"\nWrite a program to check if all elements in a list of booleans are true using the reduce operation\n");

		List<Boolean> asList2 = Arrays.asList(true, true, true, false);
		Boolean reduce5 = asList2.stream().reduce(true, (a, b) -> a && b);
		System.out.println(reduce5);

	}
}
