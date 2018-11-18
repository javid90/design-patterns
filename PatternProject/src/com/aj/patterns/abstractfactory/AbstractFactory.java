package com.aj.patterns.abstractfactory;

public abstract class AbstractFactory {
	protected abstract Device getDevice(String device);
	protected abstract Game getGame(String game);

}
