package com.te.javaconceptoftheday;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStringIndividual {
	public static void main(String[] args) {
		String st = "Happy day";
		// yppaH yad
		String[] split = st.split(" ");

		for (int i = 0; i < split.length; i++) {
			String string = split[i];
			String collect = Stream.of(string).map(j -> new StringBuffer(j).reverse()).collect(Collectors.joining());
			System.out.print(collect + " ");
		}

	}
}
