package com.practice.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareTwoStringsExtractCommonWords {
	public static void main(String[] args) {
		String string1 = "This is the first string";
		String string2 = "This is the second string";

		String[] words1 = string1.split(" ");
		String[] words2 = string2.split(" ");

		ArrayList<String> commonWords = new ArrayList<String>();

		for (String word : words1) {
			if (Arrays.asList(words2).contains(word)) {
				commonWords.add(word);
			}
		}
		// String collect =
		// commonWords.stream().sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.joining("
		// "));

		Collections.sort(commonWords);
		System.out.println("Common words in ascending order:");
		for (String word : commonWords) {
			System.out.println(word);
		}

	}
}
