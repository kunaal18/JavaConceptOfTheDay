package com.practice.InterviewQuestions;

import java.util.List;

public class Institute {
	public String name;
	public List<String> city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCity() {
		return city;
	}

	public void setCity(List<String> city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Institute [name=" + name + ", city=" + city + "]";
	}

	public Institute(String name, List<String> city) {
		super();
		this.name = name;
		this.city = city;
	}

	public Institute() {
		super();
		// TODO Auto-generated constructor stub
	}

}
