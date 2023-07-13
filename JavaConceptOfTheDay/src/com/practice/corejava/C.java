package com.practice.corejava;

public class C implements A, B {

	@Override
	public void work() {
		System.out.println("I'm doing work");

	}



	@Override
	public void m1() {
		// TODO Auto-generated method stub
		B.super.m1();
	}



	public static void main(String[] args) {
		C c = new C();
//		c.m1();
//		c.m2();
		c.work();
		c.m1();
	}

}
