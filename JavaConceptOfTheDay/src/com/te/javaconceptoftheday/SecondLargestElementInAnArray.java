package com.te.javaconceptoftheday;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.IntStream;

public class SecondLargestElementInAnArray {
	public static void getSecondMax(int ar[]) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] < ar[j]) {
					int temp = ar[j];
					ar[j] = ar[i];
					ar[i] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(ar));
		System.out.println(ar[1]);
	}

	public static void main(String[] args) {
		int ar[] = { 12, 76, 11, 87, 93, 45, 64 };
		getSecondMax(ar);
		System.out.println("------------------USING JAVA 8 FEATURES------------------");
		Integer integer = IntStream.of(ar).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(integer);
	}
}
