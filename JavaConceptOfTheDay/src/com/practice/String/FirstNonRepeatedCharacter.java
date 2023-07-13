package com.practice.String;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepeatedCharacter {
	public static void main(String[] args) {
		String input = "Java articles are jAwesome";

//		LinkedHashMap<Character, Long> collect = input.chars()
//				.mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))
//				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
//
//		Entry<Character, Long> entry = collect.entrySet().stream().filter(i -> i.getValue() == 1).findFirst().get();
//		System.out.println(entry.getKey());
		System.out.println("\nFind first non repeated character\n");
		LinkedHashMap<String, Long> collect = Stream.of(input.split("")).map(i -> i.toLowerCase())
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		Entry<String, Long> entry = collect.entrySet().stream().filter(i -> i.getValue() == 1).findFirst().get();
		System.out.println(entry.getKey());

		System.out.println("\nFind first repeated character\n");

		LinkedHashMap<String, Long> collect1 = Stream.of(input.split("")).map(i -> i.toLowerCase())
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		Entry<String, Long> entry1 = collect1.entrySet().stream().filter(i -> i.getValue() > 1).findFirst().get();
		System.out.println(entry1.getKey());

	}
}
