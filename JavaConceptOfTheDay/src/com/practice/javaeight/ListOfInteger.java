package com.practice.javaeight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListOfInteger {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 15, 10, 49, 25, 98, 25);

		// even
		list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
		System.out.println("\nfind out all the numbers starting with 1\n");

		list.stream().map(i -> i + " ").filter(j -> j.startsWith("1")).forEach(System.out::println);

		System.out.println("\nfind duplicate elements in a given integers\n");
		HashSet<Integer> set = new HashSet<Integer>();
		list.stream().filter(i -> !set.add(i)).forEach(System.out::println);

		System.out.println("\nfind first element\n");

		Integer integer = list.stream().findFirst().get();
		System.out.println(integer);

		// max
		Integer integer2 = list.stream().max(Integer::compareTo).get();
		System.out.println(integer2);

		// sort in descending order
		System.out.println();
		list.stream().sorted((i, j) -> j - i).forEach(System.out::println);

		
	}
}
