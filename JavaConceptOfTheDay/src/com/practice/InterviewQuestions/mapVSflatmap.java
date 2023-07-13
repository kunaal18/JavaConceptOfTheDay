package com.practice.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class mapVSflatmap {

	public static void main(String[] args) {
		ArrayList<Institute> list = new ArrayList<Institute>();
		list.add(new Institute("IIt", Arrays.asList("Kanpur", "Agra", "Pune", "Mumbai")));
		list.add(new Institute("IIM", Arrays.asList("Nagpur", "Amritsar", "Mumbai")));
		
		//list.stream().map(Institute::getName).fo
		
		list.stream().map(Institute::getCity).distinct().forEach(System.out::println);

	}

}
