package com.practice.InterviewQuestions;

public class FindingSpecialCharacterInTheStringTCS {
	public static void main(String[] args) {
		String st = "&Ja%^va";

		for (int i = 0; i < st.length(); i++) {

			if (!Character.isAlphabetic(st.charAt(i)) && !Character.isDigit(st.charAt(i)) && st.charAt(i) != ' ') {
				System.out.println(st.charAt(i));
			}

		}
	}
}
