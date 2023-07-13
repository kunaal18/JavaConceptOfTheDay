package com.practice.javaeight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringPractice {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("India", "Pakistan", "Afghanistan", "Nepal", "Srilanka", "Bhutan");

		double average = list.stream().map(i -> i.length()).mapToInt(j -> j).summaryStatistics().getAverage();
		System.out.println(average);

		List<String> list1 = Arrays.asList("komal", "swara", "roja", "archana", "trupti", "sushanka");
		double average1 = list1.stream().map(e -> e.length()).mapToInt(e -> e).summaryStatistics().getAverage();
		System.out.println(average1);

//      List of Strings in descending order
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//
//		for (String st : list1) {  // list1 is List<String> list1 = Arrays.asList("komal", "swara", "roja", "archana", "trupti", "sushanka");
//			map.put(st, st.length());
//		}
//
//		LinkedHashMap<String, Integer> collect = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
//				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o, n) -> o, LinkedHashMap::new));
//
//		Set<String> keySet = collect.keySet();
//		List<String> listOfKeysInDescendingOrder = new ArrayList<>(keySet);
//		Collections.reverse(listOfKeysInDescendingOrder);
//		System.out.println(listOfKeysInDescendingOrder);

		List<String> collect = list.stream().sorted(Comparator.comparing(String::length).reversed())
				.collect(Collectors.toList());
		System.out.println(collect);
// find who is palindrome and who is not
		List<String> input = Arrays.asList("Brunda", "SaaS", "SaaS", "saraS");

		// [Not a Palindrome String, Palindrome String, Palindrome String, Palindrome
		// String]

		Object[] array = input.stream().map(StringPractice::checkPalindrome).toArray();
		System.out.println(Arrays.toString(array));

	}

	public static String checkPalindrome(String st) {
		int i = 0;
		int j = st.length() - 1;
		while (i < j) {
			if (st.charAt(i) != st.charAt(j)) {

				return "Not a Palindrome String";
			}
			i++;
			j--;

		}
		return "Palindrome String";
	}
}
