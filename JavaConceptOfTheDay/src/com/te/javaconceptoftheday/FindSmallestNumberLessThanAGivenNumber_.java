package com.te.javaconceptoftheday;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindSmallestNumberLessThanAGivenNumber_ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();

		System.out.println("Enter any digit : ");
		int unWanted = scanner.nextInt();

		int max = IntStream.rangeClosed(0, num).boxed().map(t -> t + "").filter(t -> !t.contains(unWanted + ""))
				.map(t -> Integer.parseInt(t)).collect(Collectors.summarizingInt(x -> x)).getMax();

		System.out.println(max);

		for (int i = num; i >= 0; i--) {

			String value = i + ""; // Integer.toString(i)
			String find = unWanted + "";
			if (!value.contains(find)) {
				System.out.println(value);
				break;
			}

		}

	}
}
