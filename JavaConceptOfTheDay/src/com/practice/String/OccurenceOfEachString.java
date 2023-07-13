package com.practice.String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class OccurenceOfEachString {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		List<String> list = Arrays.asList("a", "b", "c", "a", "b", "d");

		for (String str : list) {
			if (!map.containsKey(str)) {
				map.put(str, 1);
			} else {
				map.put(str, map.get(str) + 1);
			}
		}
		
		System.out.println(map);
	}
}
