package com.practice.javaeight;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTestComparator {
	public static void main(String[] args) {
		ArrayList<Student> listOfStudents = new ArrayList<Student>();
		listOfStudents.add(new Student(123, "Student1", 62));

		listOfStudents.add(new Student(231, "Student2", 81));

		listOfStudents.add(new Student(85, "Student3", 79));

		listOfStudents.add(new Student(478, "Student4", 94));

		listOfStudents.add(new Student(365, "Student5", 62));

		System.out.println("listOfStudents Before Sorting :");

		System.out.println(listOfStudents);
		Collections.sort(listOfStudents, new OrderByPercentage());
		Collections.sort(listOfStudents, (s1, s2) -> s1.id - s2.id);
		System.out.println(listOfStudents);

	}
}
