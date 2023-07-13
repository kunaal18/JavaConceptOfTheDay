package com.practice.CollectionFramework;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
		hashtable.put(18, "Virat Kohli");
		hashtable.put(333, "Chris Gayle");
		hashtable.put(17, "ABD");
		hashtable.put(7, "MSD");
		hashtable.put(7, "Surya");
		// hashtable.put(null, "Null value");

		// null key and values are not allowed
		System.out.println(hashtable);
		System.out.println(hashtable.get(17));
		// System.out.println(hashtable.get(null)); java.lang.NullPointerException:

	}
}
