package com.practice.String;

import java.util.Stack;

public class ValidParenthesis {

	public static boolean isValid(String st) {
//peek() allows you to retrieve the top element of the stack without removing it
//pop() is used to remove and return the top element from the stack
		Stack<Character> stack = new Stack<Character>();

		for (char ch : st.toCharArray()) {

			if (ch == '(' || ch == '[' || ch == '{') {
				stack.add(ch);

			} else {
				if (stack.isEmpty())
					return false;
				if (ch == ')' && stack.peek() != '(')
					return false;
				if (ch == ']' && stack.peek() != '[')
					return false;
				if (ch == '}' && stack.peek() != '{')
					return false;
				stack.pop();

			}

		}

		return stack.isEmpty();

	}

	public static void main(String[] args) {
		String st = "{()([]){}(())}";
		System.out.println(isValid(st));
	}
}
