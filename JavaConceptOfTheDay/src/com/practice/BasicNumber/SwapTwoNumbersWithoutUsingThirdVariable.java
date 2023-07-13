package com.practice.BasicNumber;

public class SwapTwoNumbersWithoutUsingThirdVariable {

	public static void main(String[] args) {
		int a = 10;
		int b = 100;

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a " + a);
		System.out.println("b " + b);

	}
}
