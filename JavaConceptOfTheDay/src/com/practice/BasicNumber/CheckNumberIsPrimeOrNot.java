package com.practice.BasicNumber;

public class CheckNumberIsPrimeOrNot {

	public static boolean isPrime(int n) {
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int n = 3;
		System.out.println(isPrime(n));
	}
}
