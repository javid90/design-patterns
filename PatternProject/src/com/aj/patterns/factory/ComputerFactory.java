package com.aj.patterns.factory;

public class ComputerFactory {

	public Computer getComputerInstance(String instance) {
		if (instance == null) return null;
		
		switch (instance) {
			case "PC":
				return new PC();
			case "Laptop":
				return new Laptop();
			default:
				return null;
		}
	}
}
