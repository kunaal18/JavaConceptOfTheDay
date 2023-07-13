package com.practice.dsa;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDifference {

	public static void main(String[] args) {
		String st1 = "abcd";
		String st2 = "abcde";

		// output : e
		List<String> collect3 = Stream.of(st1.split("")).collect(Collectors.toList());
		List<String> collect4 = Stream.of(st2.split("")).collect(Collectors.toList());

		collect4.stream().filter(i -> !collect3.stream().anyMatch(j -> j.equals(i))).forEach(System.out::println);

		List<Character> collect1 = st1.chars().mapToObj(i -> (char) i).collect(Collectors.toList());
		List<Character> collect2 = st2.chars().mapToObj(i -> (char) i).collect(Collectors.toList());

		for (Character character : collect2) {
			if (!collect1.contains(character)) {
				System.out.println(character);
			}
		}

	}
}
