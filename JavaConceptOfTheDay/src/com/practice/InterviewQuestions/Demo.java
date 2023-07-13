package com.practice.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Kevin", "87643457", "6789975", "567789", "peterson");

		List<String> collect = list.stream().filter(i -> i.chars().allMatch(Character::isDigit))
				.collect(Collectors.toList());
		System.out.println(collect);
		
		String st = "opkap8976il7";
		st.chars();
		
		//char[] ch = st.toCharArray();
		
		
	}
}
