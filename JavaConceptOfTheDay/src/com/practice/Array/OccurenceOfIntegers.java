package com.practice.Array;

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OccurenceOfIntegers {

	public static void getUsingMap(int ar[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < ar.length; i++) {
			if (map.containsKey(ar[i])) {
				Integer integer = map.get(ar[i]);
				map.put(ar[i], integer + 1);

			} else {
				map.put(ar[i], 1);
			}

		}
		System.out.println(map);
	}

	public static void getUsingStreams(int ar[]) {
		IntStream.of(ar).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet().stream()
				.filter(i -> i.getKey() != 0).forEach(k -> {
					System.out.println(k.getKey() + " --> " + k.getValue() + " times ");
				});

	}

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 2, 5, 6, 2, 1, 9, 4, 5 };

		int count[] = new int[128];

		for (int i = 0; i < ar.length; i++) {
			count[ar[i]]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				System.out.println(i + " --> " + count[i]);
			}
		}
		System.out.println();
		System.out.println("------------------USING JAVA 8 FEATURES------------------");

		getUsingStreams(ar);
		System.out.println("Using Map");
		getUsingMap(ar);
	}
}
