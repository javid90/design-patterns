package com.aj.patterns.abstractfactory;

public class GameFactory extends AbstractFactory {

	public Game getGameFactory(String game) {
		switch(game) {
			case "GTA5":
				return new GTA5();
		}
		return null;
	}

	@Override
	protected Device getDeviceFactory(String device) {
		return null;
	}
}
