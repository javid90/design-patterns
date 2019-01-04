package com.aj.patterns.decorator;

public class Chicken extends PizzaDecorator {
	private final Pizza pizza;

	public Chicken(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + ", Chicken (12.75)";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 9.25;
	}

}
