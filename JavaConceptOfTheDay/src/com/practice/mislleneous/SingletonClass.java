package com.practice.mislleneous;

public class SingletonClass {
	private static SingletonClass singletonClass;

	private SingletonClass() {

	}

	public static SingletonClass getInstance() {
		if (singletonClass == null) {
			singletonClass = new SingletonClass();
		}
		return singletonClass;
	}

	public static void main(String[] args) {
		int i1 = getInstance().hashCode();
		int i2 = getInstance().hashCode();
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i1 == i2);
	}
}
