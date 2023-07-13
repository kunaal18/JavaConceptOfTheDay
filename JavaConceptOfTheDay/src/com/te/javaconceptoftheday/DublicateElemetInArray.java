package com.te.javaconceptoftheday;

import java.util.HashSet;
import java.util.stream.IntStream;

public class DublicateElemetInArray {
	public static void main(String[] args) {
		int ar[] = { 12, 34, 56, 3, 2, 45, 6, 34, 90, 12, 56, 12, 3, 3, 2, 5, 77, 66, 44 };
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					set.add(ar[i]);
				}
			}
		}
		System.out.println(set);
		// -----------------------------------------------------------------------------

		IntStream.of(ar).boxed().filter(i -> !set.add(i)).sorted().distinct().forEach(System.out::println);
	}
}
