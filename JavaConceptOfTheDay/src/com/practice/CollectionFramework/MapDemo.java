package com.practice.CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Hii");
		map.put(2, "Hello");
		map.put(1, "Bye");
		map.put(4, "hey");
//		1. for-each loop

		for (Integer key : map.keySet()) {
			System.out.println(key + " " + map.get(key));

		}

//		2. keyset() iterator

		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {

			Integer next = iterator.next();
			System.out.println(next + " " + map.get(next));
		}

//		3. entrySet() and for loop
//		4. entrySet() and java iterator

	}
}
