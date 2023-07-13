package com.practice.String;

public class Palindrome {

	public static boolean name(String st) {
		int i = 0;
		int j = st.length() - 1;
		while (i < j) {
			if (st.charAt(i) != st.charAt(j)) {

				return false;
			}
			i++;
			j--;

		}
		return true;
	}

	public static void main(String[] args) {
		String st = "Saa4S";
		System.out.println(name(st));
	}
}
