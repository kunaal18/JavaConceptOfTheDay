package com.practice.Array;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteAnElement {

	public static void main(String[] args) {
		int ar[] = { 233, 54, 67, 89, 32, 12 };
		System.out.println("Enter Element to delete");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int newArray[] = new int[ar.length - 1];
		int newIndex = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != n) {
				newArray[newIndex] = ar[i];
				newIndex++;
			}
		}
		System.out.println(Arrays.toString(newArray));
	}
}
