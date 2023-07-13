package com.practice.String;

public class RemoveWhiteSpaces1 {
	public static void main(String[] args) {
		String st = "Ku  nal   si  n    gh ";
		char[] ch = st.toCharArray();
		String noWhiteSpace = "";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ') {
				noWhiteSpace = noWhiteSpace + ch[i];
			}
		}
		System.out.println(noWhiteSpace);
	}
}
