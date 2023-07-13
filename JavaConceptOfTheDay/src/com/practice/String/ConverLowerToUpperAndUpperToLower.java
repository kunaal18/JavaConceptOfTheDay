package com.practice.String;

public class ConverLowerToUpperAndUpperToLower {
	public static void lowerToUpper(String st) {

		for (int i = 0; i < st.length(); i++) {
			int ch = st.charAt(i);
			if (ch > 96 && ch < 123) {
				ch = ch - 32;
				System.out.println((char) ch);
			}
		}

	}

	public static void main(String[] args) {
		String st = "MaiNlaNd INDia";
		lowerToUpper(st);

	}
}
