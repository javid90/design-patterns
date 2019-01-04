package com.aj.patterns.decorator;

import java.text.DecimalFormat;

public class TestDecoratorPattern {

	public static void main(String[] args) {
		DecimalFormat dformat = new DecimalFormat("#.##");
		Pizza pizza = new SimplyVegPizza();
		
		pizza = new Broccoli(pizza);
		pizza = new Cheese(pizza);
		pizza = new Chicken(pizza);
		
		System.out.println("Desc: " + pizza.getDesc());
		System.out.println("Price: " + dformat.format(pizza.getPrice()));

	}

}
