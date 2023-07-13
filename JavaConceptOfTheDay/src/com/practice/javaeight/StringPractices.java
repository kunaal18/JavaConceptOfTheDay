package com.practice.javaeight;

import java.util.Arrays;
import java.util.List;

public class StringPractices {

	public static boolean isPalindrome(String st) {
		String reverse = new StringBuffer(st).reverse().toString();
		return st.equalsIgnoreCase(reverse);
	}

	public static void main(String[] args) {
		List<String> asList = Arrays.asList("SaaS", "Matrix", "pop", "Saas");
		// output: [Palindrome, Not Palindrome, Palindrome, Palindrome]
		Object[] array = asList.stream().map(i->isPalindrome(i)?"palindrome":"not palindrome").toArray();
		
		System.out.println(Arrays.toString(array));
	}
}
