package com.practice.mislleneous;

public class OccurenceOfNumbers {
	
	
	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 2, 5, 6, 2, 1, 9, 4, 5 };

		int count[] = new int[128];

		for (int i = 0; i < ar.length; i++) {
			count[ar[i]]++;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				System.out.println(count[i] + "-->" + i);
			}
		}
	}
}
