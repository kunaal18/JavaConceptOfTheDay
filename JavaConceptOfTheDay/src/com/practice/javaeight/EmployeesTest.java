package com.practice.javaeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EmployeesTest {

	public static Entry<String, Integer> getNthHighestSalary(int n, HashMap<String, Integer> map) {
		return map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toList()).get(n - 1);

	}

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		List<Employees> list = Arrays.asList(new Employees(1, "Kunal", 100000), new Employees(2, "Sushma", 200000),
				new Employees(3, "Manish", 400000), new Employees(4, "RavKi", 300000),
				new Employees(5, "kajol", 400000));

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Ram", 1200);
		map.put("Shyam", 1400);
		map.put("Krishna", 1500);
		map.put("Madhav", 1500);
		map.put("Danus", 1600);
		map.put("Kartik", 1100);

		System.out.println("\nWrite a code to find nth highest salary\n");

		int n = 2;
		Collection<Integer> values = map.values();
		List<Integer> list2 = new ArrayList<Integer>(values);
		Integer integer = list2.stream().sorted(Comparator.reverseOrder()).distinct().skip(n - 1).findFirst().get();

		System.out.println(n + " th highest salary " + integer);

		// second way which is correct way

		Entry<String, Integer> entry = map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toList()).get(n - 1);
		System.out.println(entry);
		// if salary is same then
		Map<Integer, List<String>> collect2 = map.entrySet().stream().collect(
				Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
		System.out.println("--------------------");

		System.out.println(collect2);

		System.out.println(getNthHighestSalary(n, map));

		Employees employees = list.stream().sorted(Comparator.comparing(Employees::getSalary).reversed()).skip(1)
				.findFirst().get();
		System.out.println(employees);

		List<String> collect = list.stream().filter(i -> i.getSalary() > 200000).map(Employees::getName)
				.map(i -> i.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect);

		list.stream().filter(i -> i.getSalary() > 100000).forEach(j -> {
			j.setSalary(j.getSalary() + j.getSalary() * 20 / 100);
		});
		System.out.println(list);

		System.out.println("\nFirst non repeated character in the given List<String> name\n");

		Entry<Character, Long> firstNonRepeatedCharacter = list.stream().map(Employees::getName)
				.collect(Collectors.toList()).stream().flatMap(i -> i.chars().mapToObj(j -> (char) j))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(i -> i.getValue() == 1).findFirst().get();

		System.out.println(firstNonRepeatedCharacter);

	}

}
