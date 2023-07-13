package com.te.javaconceptoftheday;

public class PairOfCombination {
	public static void getPair(int ar[], int find) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] + ar[j] == find) {
					System.out.print("(" + ar[i] + "," + ar[j] + ")");
				}
			}
		}
	}

	public static void main(String[] args) {
		int ar[] = { 4, 5, 7, 11, 9, 13, 8, 12 };
		int find = 20;
		getPair(ar, find);
	}
}
