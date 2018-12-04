package com.aj.patterns.builder;

public class BuilderDemo {

	public static void main(String[] args) {
		CarBuilder carBuilder = new SedanCarBuilder();
		CarBuilderDirector director = new CarBuilderDirector(carBuilder);
		Car car = carBuilder.getCar();
		System.out.println(car);

	}

}
