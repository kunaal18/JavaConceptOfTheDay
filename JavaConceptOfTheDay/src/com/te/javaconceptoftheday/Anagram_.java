package com.te.javaconceptoftheday;

import java.util.Arrays;

public class Anagram_ {
	public static boolean getAnagram(String s1, String s2) {

		char[] ar1 = s1.toCharArray();
		Arrays.sort(ar1);

		char[] ar2 = s2.toCharArray();
		Arrays.sort(ar2);

		if (Arrays.equals(ar1, ar2)) {

			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		String s1 = "race";
		String s2 = "care";
		System.out.println(getAnagram(s1, s2));
	}
}
