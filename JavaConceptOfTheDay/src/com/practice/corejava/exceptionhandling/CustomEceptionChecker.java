package com.practice.corejava.exceptionhandling;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomEceptionChecker {

	  ArrayList<String> listOfLanguage = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));

	public void checkLanguage(String language) throws CustomException {

		if (listOfLanguage.contains(language)) {
			throw new CustomException(language + " is already present");

		} else {
			listOfLanguage.add(language);
			System.out.println(language + " is added to the ArrayList");

		}

	}

	public static void main(String[] args) {

		CustomEceptionChecker checker = new CustomEceptionChecker();

			try {
				checker.checkLanguage("React");
				checker.checkLanguage("Java");
			} catch (CustomException e) {
			      System.out.println("[" + e + "] Exception Occured");

			}

	}
}
