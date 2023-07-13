package com.practice.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayLeaders {

	public static List<Integer> findLeaders(int ar[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (ar.length == 0) {
			return list;
		}
		int max = ar[ar.length - 1];
		list.add(max);
		for (int i = ar.length - 2; i >= 0; i--) {
			if (ar[i] > max) {
				max = ar[i];
				list.add(ar[i]);
			}
		}
		return list;

	}

	public static void main(String[] args) {
		int[] ar = { 16, 17, 4, 3, 5, 2 };
		List<Integer> leaders = findLeaders(ar);
		System.out.println("Leaders: " + leaders);
	}

}
