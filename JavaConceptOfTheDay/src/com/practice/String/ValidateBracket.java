package com.practice.String;

import java.util.Stack;

public class ValidateBracket {

	public static boolean isValidate(String st) {

		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			// it match i will check what was the previous value if it is open bracket of
			// same type I will make stack empty

			if (ch == '}') {
				if (stack.peek() == '{') {
					stack.pop();
				} else {
					return false;
				}

			} else if (ch == ')') {
				if (stack.peek() == '(') {
					stack.pop();
				} else {
					return false;
				}

			} else if (ch == ']') {
				if (stack.peek() == '[') {
					stack.pop();

				} else {
					return false;
				}

			} else {
				stack.push(ch);
			}

		}
		if (stack.size() == 0) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		String st = "{()([]){}(())}";
		// open bracket must be closed by the same type of bracket
		// open brackets must be closed in the correct order
		System.out.println(isValidate(st));

	}
}
