package com.practice.javaeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatMap {

	public static List<Integer> findPrimeFactors(int number) {
		List<Integer> primeFactors = new ArrayList<>();

		for (int i = 2; i <= number; i++) {
			while (number % i == 0) {
				primeFactors.add(i);
				number /= i;
			}
		}

		return primeFactors;
	}

	public static void main(String[] args) {

		List<Institute> instituteList = new ArrayList<>();

		instituteList.add(new Institute("IIM", Arrays.asList("Bangalore", "Ahmedabad", "Kozhikode", "Lucknow")));
		instituteList.add(new Institute("IIT", Arrays.asList("Delhi", "Mumbai", "Kharagpur")));
		instituteList.add(new Institute("NIFT", Arrays.asList("Hyderabad", "Mumbai", "Patna", "Bangalore")));

		// Java 8 Map() : Get names of all institutes

		List<String> names = instituteList.stream().map(Institute::getName).collect(Collectors.toList());
		System.out.println(names);

		// Java 8 FlatMap() : Get unique locations of all institutes

		List<String> collect = instituteList.stream().flatMap(i -> i.getLocations().stream()).distinct()
				.collect(Collectors.toList());
		System.out.println(collect);
		List<String> asList = Arrays.asList("India", "Argentina", "Chez Republic", "Australia", "China");

		List<String> asList2 = Arrays.asList("bangalore", "ahmedabad", "kozhikode", "lucknow", "pune");

		System.out.println(
				"\nGiven a list of strings, write a program to convert each string to uppercase using the map operation.\n");

		asList2.stream().map(i -> i.toUpperCase()).forEach(System.out::println);

		System.out.println(
				"\nImplement a program to find the square of each element in a list of integers using the map operation\n");

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		list.stream().map(i -> i * i).forEach(System.out::println);

		System.out.println(
				"\nWrite a program to extract all the unique characters from a list of strings using the flatMap operation.\n");

		asList.stream().flatMap(i -> i.chars().mapToObj(j -> (char) j)).distinct()
				.forEach(k -> System.out.print(k + ""));

		System.out.println(
				"\nGiven a list of strings, write a program to split each string into words and create a list of all the words using the flatMap operation\n");
		List<String> stringList = Arrays.asList("Hello World", "Java Programming", "FlatMap Example");
		List<String> collect3 = stringList.stream().flatMap(i -> Stream.of(i.split(" "))).collect(Collectors.toList());
		System.out.println(collect3);

		System.out.println(
				"\nImplement a program to flatten a list of lists of integers into a single list using the flatMap operation\n");
		List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5),
				Arrays.asList(6, 7, 8, 9));

		System.out.println(listOfLists);

		List<Integer> collect2 = listOfLists.stream().flatMap(i -> i.stream()).collect(Collectors.toList());
		System.out.println(collect2);

		System.out.println(
				"\nWrite a program to convert a list of strings into a list of their respective lengths using the map operation\n");

		List<Integer> collect4 = asList.stream().map(String::length).collect(Collectors.toList());
		System.out.println(collect4);

		System.out.println(
				"\nGiven a list of integers, write a program to find the prime factors of each number and create a list of lists using the flatMap operation\n");
		List<Integer> numbers = Arrays.asList(12, 20, 35, 42, 50);

		List<List<Integer>> primeFactorsList = numbers.stream().map(MapVsFlatMap::findPrimeFactors)
				.collect(Collectors.toList());
		System.out.println(primeFactorsList);

		System.out.println(
				"\nImplement a program to convert a list of strings into a list of characters using the flatMap operation.\n");

		List<String> asList3 = Arrays.asList("Hello", "Hii", "Bye");
		List<Character> collect5 = asList3.stream().flatMap(str -> str.chars().mapToObj(ch -> (char) ch))
				.collect(Collectors.toList());
		System.out.println(collect5);

		System.out.println(
				"\nWrite a program to extract all the distinct words from a list of sentences using the flatMap operation.\n");

		System.out.println(
				"\nGiven a list of integers, write a program to find the square root of each number and create a list of optional results using the map operation\n");

	}

}
