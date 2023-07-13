package com.practice.String;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DublicateCharacterInAString {
	public static void main(String[] args) {
		String st = "Butter bitter";
		HashSet<Character> hashSet = new HashSet<Character>();
		char[] ch = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j] && ch[i] != ' ') {
					hashSet.add(ch[i]);
				}
			}
		}
		System.out.println(hashSet);

		System.out.println("------------------USING JAVA 8 FEATURES------------------");

		Stream.of(st.split("")).collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet().stream()
				.filter(i -> i.getValue() > 1).forEach(i -> {
					System.out.println(i.getKey() + " -> " + i.getValue());
				});

	}

}
