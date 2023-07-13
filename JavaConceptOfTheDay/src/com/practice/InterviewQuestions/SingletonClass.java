package com.practice.InterviewQuestions;

public class SingletonClass extends MyClone {
	private static SingletonClass singletonClass;

	private SingletonClass() {

	}

	private static SingletonClass getInstane() {
		if (singletonClass == null) {
			singletonClass = new SingletonClass();
		}
		return singletonClass;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		SingletonClass instane = getInstane();
		SingletonClass instane2 = getInstane();
		Object clone = getInstane().clone();
		System.out.println(instane2.hashCode());
		System.out.println(instane.hashCode());
		System.out.println(clone.hashCode());
	}

}
