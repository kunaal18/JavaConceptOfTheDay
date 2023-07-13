package com.te.javaconceptoftheday;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDublicateElementFromArrayList {
	public static void main(String[] args) {
		ArrayList<String> listWithDuplicateElements = new ArrayList<String>();

		listWithDuplicateElements.add("JAVA");

		listWithDuplicateElements.add("J2EE");

		listWithDuplicateElements.add("JSP");

		listWithDuplicateElements.add("SERVLETS");

		listWithDuplicateElements.add("JAVA");

		listWithDuplicateElements.add("STRUTS");

		listWithDuplicateElements.add("JSP");

		HashSet<String> set = new HashSet<String>(listWithDuplicateElements);
		System.out.println(set);

		System.out.println("------------------USING JAVA 8 FEATURES------------------");
		listWithDuplicateElements.stream().distinct().forEach(System.out::println);
	}
}
