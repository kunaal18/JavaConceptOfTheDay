package com.practice.CollectionFramework;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> treeMap = new TreeMap<Integer,String>();
		treeMap.put(6000, "Hii");
		treeMap.put(2000, "Bye");
		treeMap.put(4000, "Hello");
		treeMap.put(3000, "No");
		treeMap.put(5000, null);
		
		System.out.println(treeMap);
		
		
		System.out.println(treeMap.headMap(4000));
		System.out.println(treeMap.tailMap(4000));

	}
}
