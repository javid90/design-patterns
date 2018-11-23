package com.aj.patterns.abstractfactory;

public abstract class AbstractFactory {
	protected abstract Device getDeviceFactory(String device);
	protected abstract Game getGameFactory(String game);

}
