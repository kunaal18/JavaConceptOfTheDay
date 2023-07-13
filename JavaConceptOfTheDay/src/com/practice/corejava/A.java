package com.practice.corejava;

public interface A {
	
	void work();
	
	default void m1() {
		System.out.println("I'm Implementation of A interface");
	}
}
