package com.practice.javaeight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DublicateCharacterInStringAndStringSorter {
	public static void main(String[] args) {
		String str = "programming";
		Stream.of(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().filter(i -> i.getValue() > 1).forEach(System.out::println);

		HashSet<Character> set = new HashSet<Character>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (!set.add(ch)) {
				System.out.println(ch);
			}
		}

		// using java 8
		str.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(k -> k.getValue() > 1).forEach(l -> {
					System.out.print(l.getKey() + " ");
				});
		System.out.println();

		// print all things only one time
		Stream.of(str.split("")).distinct().forEach(i -> System.out.print(i + " "));
		// str.chars().mapToObj(i -> (char) i).distinct().forEach(n ->
		// System.out.print(n + " "));
		// reverse string with no dublicates characters
		// n i m a g o r p r p o n m i g a
		System.out.println("-----------------");
		Stream.of(str.split("")).distinct().sorted(Comparator.reverseOrder()).forEach(i -> System.out.print(i + " "));

		System.out
				.println("\nreverse string with no dublicates characters order should be maintained n i m a g o r p\n");

		List<Character> collect = str.chars().mapToObj(i -> (char) i).distinct().collect(Collectors.toList());

		for (int i = collect.size() - 1; i >= 0; i--) {
			System.out.print(collect.get(i) + " ");
		}

		System.out.println(
				"\n\nWrite a program to sort a list of strings in descending order of length using Java 8 features.");
		List<String> asList = Arrays.asList("India", "Argentina", "Chez Republic", "Australia", "China");
		String string = asList.stream().sorted(Comparator.comparingInt(String::length).reversed()).findFirst().get();
		System.out.println(string);

		System.out.println("\nUsing faltMap give me unique character from a list of String\n");
		asList.stream().flatMap(i -> i.chars().mapToObj(j -> (char) j)).distinct()
				.forEach(i -> System.out.print(i + " "));
	}
}
