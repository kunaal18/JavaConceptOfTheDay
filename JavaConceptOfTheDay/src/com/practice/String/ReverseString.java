package com.practice.String;

public class ReverseString {
	public static void main(String[] args) {
		String st = "Happy Day";
		
		for(int i=st.length()-1;i>=0;i--) {
			System.out.print(st.charAt(i));
		}
System.out.println();
		String rev = "";
		for (int i = st.length() - 1; i >= 0; i--) {
			rev = rev + st.charAt(i);
		}
		System.out.println(rev);

		// Using String buffer class
		System.out.println("Using String buffer class");

		StringBuffer reverse = new StringBuffer(st).reverse();
		System.out.println(reverse);
		
		System.out.println("Using Array class");

		char[] charArray = st.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
	}

}
