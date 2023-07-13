package com.te.javaconceptoftheday;

public class HarshadNumber {

	// 111 is a harshad number 1+1+1=3 111/3=37
//21
	public static int getSum(int n) {
		int sum = 0;
		while (n != 0) {
			int d = n % 10;
			sum = sum + d;
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 21;
		int temp = n;
		int total = getSum(n);
		if (temp % total == 0) {
			System.out.println(temp + " is a Harshad Number");
		} else {
			System.out.println(temp + " is not a Harshad Number");

		}

	}

}
