package com.practice.String;

public class Anagram {

	public static boolean isAnagram(String s1, String s2) {

		int count1[] = new int[128];
		for (int i = 0; i < s1.length(); i++) {
			count1[s1.charAt(i)]++;
		}

		int count2[] = new int[128];
		for (int i = 0; i < s2.length(); i++) {
			count2[s2.charAt(i)]++;
		}

		for (int i = 0; i < 128; i++) {
			if (count1[i] != count2[i])
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
