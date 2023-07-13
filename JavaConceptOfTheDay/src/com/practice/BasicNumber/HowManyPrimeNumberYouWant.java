package com.practice.BasicNumber;

import java.util.Scanner;

public class HowManyPrimeNumberYouWant {

	public static boolean isPrime(int n) {
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("How many u want prime ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = n * n;

		for (int i = 1; i <= k; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}
}
