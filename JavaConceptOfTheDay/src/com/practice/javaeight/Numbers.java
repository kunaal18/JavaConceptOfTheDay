package com.practice.javaeight;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Numbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(23, 56, 1, 2, 8, 67, 9);

		List<String> collect1 = list.stream().map(Integer::toBinaryString).collect(Collectors.toList());
		System.out.println(collect1);

		List<Integer> asList = Arrays.asList(2, 3, 56, 1, 2, 8, 6, 6, 1, 2);

		HashSet<Integer> set = new HashSet<Integer>();

		Set<Integer> collect = asList.stream().filter(i -> !set.add(i)).collect(Collectors.toSet());
		System.out.println(collect);

		int i, j;
		String a = "abcd";
		char[] ch1 = a.toCharArray();
		String b = "abcde";
		char[] ch2 = b.toCharArray();
		for (i = 0; i < ch1.length; i++) {
			for (j = 0; j < ch2.length; j++) {
				if (ch1[i] != ch2[j]) {

				}

			}

		}
		System.out.print(ch2[i]);

	}
}
