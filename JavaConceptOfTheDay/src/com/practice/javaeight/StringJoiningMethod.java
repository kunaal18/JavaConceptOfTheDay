package com.practice.javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoiningMethod {
	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

		String collect3 = listOfStrings.stream().collect(Collectors.joining());
		System.out.println(collect3);

		String collect = listOfStrings.stream().collect(Collectors.joining(","));
		System.out.println(collect);

		String collect2 = listOfStrings.stream().collect(Collectors.joining(" , ", "[", "]"));
		System.out.println(collect2);
		
		
		//String.join
		
		String join = String.join("|", "Hii","Bye","Hello");
		System.out.println(join);
		
		
		StringJoiner stringJoiner = new StringJoiner("|");
		stringJoiner.add("Hii");
		stringJoiner.add("bye");
		System.out.println(stringJoiner);
	}
}
