package com.practice.Pattern;

import java.util.Scanner;

public class OneToNinePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k++;
				if (k > 9) {
					k = 1;
				}
			}
			System.out.println();
		}
	}
}
