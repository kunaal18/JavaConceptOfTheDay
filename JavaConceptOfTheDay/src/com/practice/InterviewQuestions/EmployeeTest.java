package com.practice.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {
	public static void main(String[] args) {

		List<Employee1> list = Arrays.asList(new Employee1(1, "kunal", "A", 96000.50),
				new Employee1(2, "ayush", "B", 56000.45), new Employee1(3, "masoom", "C", 72000.23),
				new Employee1(4, "tannu", "A", 99000.52));
// Average salary of the employes whoes Grade is A
		Double collect = list.stream().filter(i -> i.getGrade().equalsIgnoreCase("A"))
				.collect(Collectors.averagingDouble(Employee1::getSalary));
		System.out.println(collect);

		double asDouble = list.stream().filter(i -> i.getGrade().equalsIgnoreCase("A")).map(j -> j.getSalary())
				.mapToDouble(k -> k).average().getAsDouble();
		System.out.println(asDouble);
	}
}
