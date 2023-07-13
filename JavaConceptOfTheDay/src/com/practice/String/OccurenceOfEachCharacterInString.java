package com.practice.String;

import java.util.HashMap;

public class OccurenceOfEachCharacterInString {

	public static void getOccurence(String st) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		char[] ch = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (!map.containsKey(ch[i])) {

				map.put(ch[i], 1);
			} else {
				Integer inte = map.get(ch[i]);
				map.put(ch[i], inte + 1);
			}
		}
		System.out.println(map);

	}

	public static void main(String[] args) {
		String st = "butter bitter";

		int count[] = new int[128];
		for (int i = 0; i < st.length(); i++) {
			count[st.charAt(i)]++;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				System.out.println(count[i] + "  --> " + (char) i);
			}
		}
		getOccurence(st);
	}
}
