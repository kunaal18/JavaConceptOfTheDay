package com.te.javaconceptoftheday;

public class Anagram {

	public static boolean isAnagram(String s1, String s2) {

		int c1[] = new int[128];
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {

		}

		int c2[] = new int[128];
		for (int i = 0; i < s2.length(); i++) {
			c2[s2.charAt(i)]++;
		}

		for (int i = 0; i <= 128; i++) {
			if (s1.charAt(i) != s2.charAt(i))
				return false;
		}

		return true;

	}

	public static void main(String[] args) {
		String s1 = "Hii";
		String s2 = "Hii";
		System.out.println(isAnagram(s1, s2));
	}
}
