package com.te.javaconceptoftheday;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OccurenceOfEachCharacterInString {

	public static void getOccurence(String st) {
		int count[] = new int[128];
		char[] ch = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			count[st.charAt(i)]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				System.out.println(count[i] + "-->" + (char) i);
			}
		}

	}

	public static void main(String[] args) {
		String st = "Better Butter";
		getOccurence(st);
		System.out.println("------------------USING JAVA 8 FEATURES------------------");

		Stream.of(st.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()

				.forEach(i -> System.out.println(i.getKey() + " --> " + i.getValue()));

	}
}
