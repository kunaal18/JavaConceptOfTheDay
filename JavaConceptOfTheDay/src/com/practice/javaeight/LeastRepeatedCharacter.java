package com.practice.javaeight;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LeastRepeatedCharacter {
	public static void main(String[] args) {
		String st = "Software System Solution";
		// least repeated character which is coming first in String
		Entry<String, Long> entry = Stream.of(st.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(i -> i.getValue() == 1).findFirst().get();

		System.out.println(entry);

	}
}
