package com.te.javaconceptoftheday;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindSmallestNumberLessThanAGivenNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();
		System.out.println("Enter any number between 0 to 9 : ");
		int unWanted = scanner.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<String> strings = new ArrayList<String>();

		for (int i = 0; i <= num; i++) {
			list.add(i);
			strings.add(i + "");
		}
		int index = 0;
		for (int i = 0; i < strings.size(); i++) {

			if (!strings.get(i).contains(unWanted + "")) {
				index = i;
			}
		}
		System.out.println(list.get(index));

		System.out.println("------------------USING JAVA 8 FEATURES------------------");
		System.out.println("The lest maximum number which doesn't contain " + unWanted + " is : "
				+ IntStream.rangeClosed(0, num).boxed().map(t -> t + "").filter(t -> !t.contains(unWanted + ""))
						.map(t -> Integer.parseInt(t)).collect(Collectors.summarizingInt(x -> x)).getMax());
	}
}
