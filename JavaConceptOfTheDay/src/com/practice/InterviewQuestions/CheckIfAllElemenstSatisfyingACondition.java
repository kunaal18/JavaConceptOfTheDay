package com.practice.InterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class CheckIfAllElemenstSatisfyingACondition {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(10, 2, 34, 50, 6, 90);

		boolean allMatch = asList.stream().allMatch(i -> i % 2 == 0);
		if (allMatch) {
			System.out.println("Even");
		} else {
			System.out.println("odd");
		}

	}
}
