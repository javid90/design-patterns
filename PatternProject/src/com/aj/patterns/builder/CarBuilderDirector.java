package com.aj.patterns.builder;

public class CarBuilderDirector {
	private CarBuilder builder;

    public CarBuilderDirector(final CarBuilder builder) {
        this.builder = builder;
    }
    
    public Car constructCar() {
		return builder.getCar();
	}
}
