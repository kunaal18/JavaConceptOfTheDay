package com.practice.String;

public class SwapTwoStringsWithoutUsingThirdVariable {
	public static void main(String[] args) {
		String st1 = "Happy";
		String st2 = "Life";

		st1 = st1 + st2; // st1=HappyLife
		st2 = st1.substring(0, st1.length() - st2.length()); // st2= Happy
		st1 = st1.substring(st2.length());
		System.out.println("st1 " + st1);
		System.out.println("st2 " + st2);

	}
}
