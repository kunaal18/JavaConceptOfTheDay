package com.practice.String;

import java.util.Scanner;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter input string to be cleaned from white spaces...!");

		String inputString = sc.nextLine();

		String stringWithoutSpaces = inputString.replaceAll("\\s+", "");

		System.out.println("Input String : " + inputString);

		System.out.println("Input String Without Spaces : " + stringWithoutSpaces);
//trim() method trims the given string i.e it removes the white spaces at the beginning and at the end of a string, not between the words
		sc.close();
	}
}
