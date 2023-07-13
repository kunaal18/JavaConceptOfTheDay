package com.practice.Array;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MoveNegativeInTheBeginningOfAnArray {
	public static void main(String[] args) {
		int a[] = { 6, 4, -1, -6, 8, -3, 9, 4 };

		List<Integer> collect3 = IntStream.of(a).boxed().filter(x -> x < 0).collect(Collectors.toList());
		collect3.addAll(IntStream.of(a).boxed().filter(x -> x >= 0).collect(Collectors.toList()));
		System.out.println(collect3);

	}
}
