package com.practice.javaeight;

import java.util.stream.IntStream;

public class StreamVsParallelStream {
	public static void main(String[] args) {

//		ArrayList<Integer> list = new ArrayList<Integer>();
//		for (int i = 1; i <= 100; i++) {
//			list.stream().map(j -> list.add(j)).forEach(System.out::println);
//		}
		// System.out.println(list);

		long start = 0;
		long end = 0;
		start = System.currentTimeMillis();
		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		end = System.currentTimeMillis();

		System.out.println("Took time without parallel stream " + (end - start));

		start = System.currentTimeMillis();
		IntStream.rangeClosed(1, 10).parallel().forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("Took time without parallel stream " + (end - start));

	}
}
