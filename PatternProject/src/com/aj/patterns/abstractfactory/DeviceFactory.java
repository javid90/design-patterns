package com.aj.patterns.abstractfactory;

public class DeviceFactory extends AbstractFactory {
	public Game getGameFactory(String game) {
		return null;
	}

	@Override
	protected Device getDeviceFactory(String device) {
		
		switch(device) {
		
		case "PC":
			return new PC();
		}
		
		return null;
	}
}
