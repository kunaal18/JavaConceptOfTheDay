package com.practice.mislleneous;

public class StringOccurenct {
	public static void main(String[] args) {
		String st = "ProgrammPPing";

		int count[] = new int[128];
		char[] ch = st.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			count[st.charAt(i)]++;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				System.out.println(count[i] + "-->" + (char) i);
			}
		}
	}
}
