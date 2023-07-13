package com.practice.mislleneous;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaximumFrequencyNumber {
	public static void main(String[] args) {
		int a[] = { 3, 3, 5, 5, 5, 5, 5, 7, 8, 8, 8, 8, 8, 9, 0 };
		Map<Integer, Long> collect = IntStream.of(a).boxed()
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));


		Collection<Long> values = collect.values();
		Long maxValue = Collections.max(values);

		collect.entrySet().stream().filter(i -> i.getValue() == maxValue).forEach(System.out::println);

	}
}
