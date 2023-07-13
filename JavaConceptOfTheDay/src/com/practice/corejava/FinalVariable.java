package com.practice.corejava;

public class FinalVariable {

	final int i;

	{
		i = 90;

	}

	public static void main(String[] args) {
		FinalVariable finalVariable = new FinalVariable();
		System.out.println(finalVariable.i);
	}
}
