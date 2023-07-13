package com.practice.ArrayMatrix;

import java.util.Scanner;

public class InputFromUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows");
		int r = sc.nextInt();
		System.out.println("ENter Columns");
		int c = sc.nextInt();

		int ar[][] = new int[r][c];
		System.out.println("Enter the elements");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				ar[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(" " + ar[i][j] + " ");
			}
			System.out.println();
		}
	}
}
