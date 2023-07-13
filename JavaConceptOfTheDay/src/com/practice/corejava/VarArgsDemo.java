package com.practice.corejava;

public class VarArgsDemo {

	public void m1(int a, int b) {
		System.out.println(a + b);
	}

	public void varArgsm1(int... num) {
		System.out.println("I'm in vararg");
	}

	public int getSum(int... ar) {
		int sum = 0;
		for (int i : ar) {
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		VarArgsDemo demo = new VarArgsDemo();
		demo.m1(12, 3);
		demo.varArgsm1(45, 0, 781);
		System.out.println(demo.getSum(7, 8, 9, 5, 3, 0, 9));

	}
}
