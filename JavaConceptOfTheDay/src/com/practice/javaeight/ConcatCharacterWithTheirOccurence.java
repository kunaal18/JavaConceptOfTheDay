package com.practice.javaeight;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatCharacterWithTheirOccurence {
	public static void main(String[] args) {
		String st = "aaabbcd";

		String collect = Stream.of(st.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.map(i -> i.getValue() + i.getKey()).collect(Collectors.joining());
		System.out.println(collect);

	}

}
