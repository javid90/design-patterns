package com.aj.patterns;

import com.aj.patterns.factory.Computer;
import com.aj.patterns.factory.ComputerFactory;
import com.aj.patterns.factory.Laptop;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ComputerFactory computerFactory = new ComputerFactory();
		Computer computer = computerFactory.getComputerInstance("Laptop");
		//Laptop laptop = (Laptop) computer;
		computer.setName("ASUS SCAR edition");
		System.out.println(computer.getName());

	}

}
