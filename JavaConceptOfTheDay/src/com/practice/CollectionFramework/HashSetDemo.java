package com.practice.CollectionFramework;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(1);
		hashSet.add(null);
		hashSet.add(12);
		hashSet.add(null);
		hashSet.add(121);

		System.out.println(hashSet);
	}
}
