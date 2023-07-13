package com.practice.InterviewQuestions;

public class SingletonDemo {
//private constructor
	private SingletonDemo() {

	}

	private static SingletonDemo singletonDemo;

// private static method which will return Singleton Object
	private static SingletonDemo getInstance() {
		if (singletonDemo == null) {
			singletonDemo = new SingletonDemo();
		}
		return singletonDemo;

	}

	public static void main(String[] args) {
		SingletonDemo obj1 = getInstance();
		SingletonDemo obj2 = getInstance();

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		// System.out.println(clone.hashCode());
	}

}
