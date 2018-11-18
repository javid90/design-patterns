package com.aj.patterns.factory;

public class Laptop extends Computer {

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public String getName() {
		return this.name;
	}

}
