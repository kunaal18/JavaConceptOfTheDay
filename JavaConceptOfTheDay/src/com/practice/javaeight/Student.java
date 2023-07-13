package com.practice.javaeight;

public class Student implements Comparable<Student> {
	int id;

	String name;

	int percentage;

	public Student(int id, String name, int percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.percentage - o.percentage;
	}

}
