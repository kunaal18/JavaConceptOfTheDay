package com.practice.BasicNumber;

public class ReverseAndAddUntilYouGetAPalindrome {
// method to reverse A number
	public static int getReverse(int n) {
		int rev = 0;
		while (n != 0) {
			int d = n % 10;
			rev = rev * 10 + d;
			n = n / 10;
		}
		return rev;
	}

	public static boolean isPalindrome(int n) {
		int temp = n;
		int reverse = getReverse(n);

		if (reverse == temp) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int n = 1441;

		if (isPalindrome(n)) {
			System.out.println("Given Number is already a Palindrome");
		} else {
			while (!isPalindrome(n)) {
				int reverse = getReverse(n);
				int sum = n + reverse;
				System.out.println(n + " + " + reverse + " = " + sum);
				n = sum;
			}
		}

	}
}
