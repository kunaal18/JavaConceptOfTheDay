package com.practice.javaeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SeperatIntegerAndStrings {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Kevin", "87643457", "6789975", "567789", "peterson");

		ArrayList<Integer> intList = new ArrayList<Integer>();

		ArrayList<String> stringList = new ArrayList<String>();

		for (int i = 0; i < list.size(); i++) {
			String string = list.get(i);

		}
//
//		List<String> listOfNumbers = list.stream().filter(i -> i.matches("\\d+")).collect(Collectors.toList());
//		System.out.println(listOfNumbers);
//
//		List<String> listOfStings = list.stream().filter(i -> !i.matches("\\d+")).collect(Collectors.toList());
//		System.out.println(listOfStings);

	}
}
