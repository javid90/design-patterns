package com.aj.patterns.factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ComputerFactory computerFactory = new ComputerFactory();
		Computer computer = computerFactory.getComputerInstance("Laptop");
		//Laptop laptop = (Laptop) computer;
		computer.setName("ASUS SCAR edition");
		System.out.println(computer.getName());

	}

}
