package com.practice.javaeight;

import java.util.List;

public class Institute {
	private String name;
	private List<String> locations;

	@Override
	public String toString() {
		return "Institute [name=" + name + ", locations=" + locations + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getLocations() {
		return locations;
	}

	public void setLocations(List<String> locations) {
		this.locations = locations;
	}

	public Institute(String name, List<String> locations) {
		super();
		this.name = name;
		this.locations = locations;
	}

	public Institute() {
		super();
		// TODO Auto-generated constructor stub
	}

}
