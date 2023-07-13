package com.practice.dsa;

public class SelectionSort {
	public static void selectionSort(int ar[]) {
		int temp = 0;
		int pos = 0;
		for (int i = 0; i < ar.length; i++) {
			pos = i;
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[j] < ar[pos]) {

				}
			}
		}
	}

	public static void main(String[] args) {
		int ar[] = { 45, 32, 12, 67, 10 };
	}
}
