package com.aj.patterns.singleton;

public class SingletonLazyDoubleCheck {
	private static SingletonLazyDoubleCheck sldc = null;
	
	private SingletonLazyDoubleCheck() { }
	
	public static SingletonLazyDoubleCheck getInstance() {
		if (sldc == null)
			synchronized(SingletonLazyDoubleCheck.class) {
				if (sldc == null)
					sldc = new SingletonLazyDoubleCheck();
			}
		return sldc;
	}
}
