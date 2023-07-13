package com.practice.BasicNumber;

public class HarshadNumber {

	public static void main(String[] args) {
		int n = 120;
		int r, sum = 0;
		int c = n;
		while (n > 0) {
			r = n % 10;
			sum = sum + r;
			n = n / 10;
		}

		if (c % sum == 0) {
			System.out.println("its a harshad nummber:");
		} else {
			System.out.println("its not harshad number:");
		}

	}
}
