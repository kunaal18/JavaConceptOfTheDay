package com.te.javaconceptoftheday;

import java.util.Scanner;

public class UserInputIsNumberOrNot {

	public static boolean isNumberOrNot(String st) {

		try {
			Integer.parseInt(st);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;

	}

	public static void main(String[] args) {
		System.out.println("Enter valid Input");
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		if (isNumberOrNot(st)) {
			System.out.println("Input is valid");
		} else {
			System.out.println("Input is not valid");
		}
	}
}
