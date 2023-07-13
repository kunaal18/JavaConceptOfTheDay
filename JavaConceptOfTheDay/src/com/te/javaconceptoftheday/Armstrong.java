package com.te.javaconceptoftheday;

public class Armstrong {
	// 153,1634
	private static int getCount(int n) {

		int count = 0;
		while (n != 0) {
			int d = n % 10;
			n = n / 10;
			count++;
		}
		return count;
	}

	public static int getPower(int k, int count) {

		int p = 1;
		for (int i = 1; i <= count; i++) {
			p = p * k;
		}
		return p;

	}

	public static void main(String[] args) {
		int n = 125;
		int temp = n;
		int count = getCount(n);
		int sum = 0;
		while (n != 0) {
			int d = n % 10;
			int power = getPower(d, count);
			sum = sum + power;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("Number is Armstrong");
		} else {
			System.out.println("Number is not Armstrong");
		}
	}

}
