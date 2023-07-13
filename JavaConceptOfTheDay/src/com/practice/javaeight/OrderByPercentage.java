package com.practice.javaeight;

import java.util.Comparator;

public class OrderByPercentage implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.percentage - o2.percentage;
	}

}
