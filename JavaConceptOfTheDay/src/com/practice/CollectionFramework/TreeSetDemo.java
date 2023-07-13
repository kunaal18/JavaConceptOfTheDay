package com.practice.CollectionFramework;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(45);
		treeSet.add(23);
		treeSet.add(9);
		treeSet.add(78);
		treeSet.add(45);
		System.out.println(treeSet);
	}
}
