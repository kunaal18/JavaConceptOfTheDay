package com.practice.CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(23);
		list.add(45);
		list.add(21);

		Integer ar[] = new Integer[list.size()];

		Integer[] array = list.toArray(ar);

		System.out.println(Arrays.toString(array));
		
		
		

	}
}
