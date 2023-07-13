package com.practice.InterviewQuestions;

public class RemoveParticularCharacterFromAString {

	public static String getRemove(String st, char ch) {

		String finalString = "";
		int l = st.length();
		for (int i = 0; i < l; i++) {
			if (st.charAt(i) != ch) {
				finalString = finalString + st.charAt(i);
			}

		}
		return finalString;

	}

	public static void main(String[] args) {
		String st = "Cloud Computing";
		char ch = 'C';

		System.out.println(getRemove(st, ch));
	}
}
