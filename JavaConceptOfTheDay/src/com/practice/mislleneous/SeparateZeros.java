package com.practice.mislleneous;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SeparateZeros {

	public static void leftSeperateZeros(int ar[]) {
		int temp = ar.length - 1;
		int left[] = new int[ar.length];
		for (int i = ar.length - 1; i >= 0; i--) {
			if (ar[i] != 0) {
				left[temp] = ar[i];
				temp--;
			}
		}
		System.out.println(Arrays.toString(left));

	}

	public static void rightSeperateZeros(int ar[]) {
		int right[] = new int[ar.length];
		int temp = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != 0) {
				right[temp] = ar[i];
				temp++;
			}
		}

		System.out.println(Arrays.toString(right));
	}

	public static void rightSeperateUsingStream(int ar[]) {
		List<Integer> list = Arrays.stream(ar).boxed().collect(Collectors.toList());
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 0) {
				list.remove(i);
				list.add(0);
			}
		}
		list.forEach(j -> System.out.print(j + " "));
	}

	public static void leftSeperateUsingStream(int ar[]) {
		List<Integer> list = Arrays.stream(ar).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 0) {
				list.remove(i);
				list.add(0);
			}
		}
		list.stream().forEach(i -> System.out.print(i + " "));
	}

	public static void main(String[] args) {
		int ar[] = { 14, 0, 5, 2, 0, 3, 0, 4 };
		rightSeperateZeros(ar);
		leftSeperateZeros(ar);
		rightSeperateUsingStream(ar);
		System.out.println();
		leftSeperateUsingStream(ar);

	}

}
