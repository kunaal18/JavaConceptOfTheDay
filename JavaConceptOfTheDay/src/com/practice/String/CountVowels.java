package com.practice.String;

public class CountVowels {

	public static int countVowels(String st) {
		int count = 0;

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') || (ch == 'A') || (ch == 'E')
					|| (ch == 'I') || (ch == 'O') || (ch == 'U')) {
				count++;
			}

		}
		return count;

	}

	public static void main(String[] args) {
		String st = "Apple";
		System.out.println(countVowels(st));
	}
}
