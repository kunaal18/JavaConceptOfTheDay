package com.practice.String;

public class RemoveVowelsFromAString {
public static void main(String[] args) {
	String st ="Pirates of the carribian";
	System.out.println(st.replaceAll("[AEIOUaeiou]", ""));
}
}
