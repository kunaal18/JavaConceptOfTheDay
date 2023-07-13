package com.practice.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class HashMapIntoArrayList {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "java");
		map.put(2, "sql");
		map.put(4, "spring");
		map.put(3, "java Script");

		System.out.println("Collect Keys as List");

		Set<Integer> keySet = map.keySet();
		ArrayList<Integer> listOfKeys = new ArrayList<Integer>(keySet);
		System.out.println(listOfKeys);

		// Using java 8
		List<Integer> listOfKeysUsingJava8 = map.keySet().stream().collect(Collectors.toList());
		System.out.println(listOfKeysUsingJava8);

		System.out.println("Collect Values as List");

		Collection<String> values = map.values();
		ArrayList<String> listOfValues = new ArrayList<String>(values);
		System.out.println(listOfValues);

		// Using java 8
		List<String> listOfValuesUsingJava8 = map.values().stream().collect(Collectors.toList());
		System.out.println(listOfValuesUsingJava8);

		System.out.println("Collect Key Values Pair in ArrayList");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		ArrayList<Entry<Integer, String>> listOfKeyValuePair = new ArrayList<Map.Entry<Integer, String>>(entrySet);
		System.out.println(listOfKeyValuePair);

		// Using java 8
		List<Entry<Integer, String>> listOfKeyValuePairUsingJava8 = map.entrySet().stream()
				.collect(Collectors.toList());
		System.out.println(listOfKeyValuePairUsingJava8);

		System.out.println("Sort Map based on keys and find Max");
		Integer max = map.keySet().stream().max(Comparator.comparingInt(i -> i)).get();
		System.out.println(max);
		
		String string = map.get(max);
		System.out.println(string);

		String maxCharcaters = map.values().stream().reduce((a, b) -> a.length() > b.length() ? a : b).get();
		System.out.println(maxCharcaters);

	}
}
