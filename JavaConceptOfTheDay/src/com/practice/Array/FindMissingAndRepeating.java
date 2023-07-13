package com.practice.Array;

import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingAndRepeating {

	public static int getRepeating(int ar[]) {

		Entry<Integer, Long> entry = IntStream.of(ar).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(i -> i.getValue() > 1).findFirst().get();
		return entry.getKey();
	}

	public static void main(String[] args) {
		int ar[] = { 4, 3, 6, 2, 1, 1 };

		int repeating = getRepeating(ar);
		System.out.println("Repeated :" + repeating);

		long realSum = IntStream.rangeClosed(1, 6).boxed().mapToInt(i -> i).summaryStatistics().getSum();

		long actualSum = IntStream.of(ar).boxed().mapToInt(i -> i).summaryStatistics().getSum();

		long missing = realSum - (actualSum - repeating);

		System.out.println("Missing :" + missing);

	}
}
