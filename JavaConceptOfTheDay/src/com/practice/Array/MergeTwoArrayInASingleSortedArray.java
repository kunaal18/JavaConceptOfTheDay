package com.practice.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeTwoArrayInASingleSortedArray {

	public static void mergeTwoArray(int ar1[], int ar2[]) {
		int merge[] = new int[ar1.length + ar2.length];

		int i = 0;
		int k = 0;
		int j = 0;

		while (i < ar1.length) {
			merge[k] = ar1[i];
			i++;
			k++;
		}

		while (j < ar2.length) {
			merge[k] = ar2[j];
			k++;
			j++;
		}

		HashSet<Integer> setWithNoDublicate = new HashSet<Integer>();
		for (int l = 0; l < merge.length; l++) {
			setWithNoDublicate.add(merge[l]);
		}

		Iterator<Integer> iterator = setWithNoDublicate.iterator();
		int mergeArrayWithNoDublicates[] = new int[setWithNoDublicate.size()];

		int n = 0;
		while (iterator.hasNext()) {
			mergeArrayWithNoDublicates[n] = iterator.next();
			n++;
		}

		System.out.println(Arrays.toString(mergeArrayWithNoDublicates));

	}

	public static void main(String[] args) {
		int ar1[] = { 3, 8, 6, 4 };
		int ar2[] = { 8, 5, 1, 7 };

		mergeTwoArray(ar1, ar2);

		System.out.println("------------------USING JAVA 8 FEATURES------------------");
		List<Integer> collect = IntStream.concat(IntStream.of(ar1), IntStream.of(ar2)).sorted().boxed().distinct()
				.collect(Collectors.toList());
		System.out.println(collect);
	}
}
