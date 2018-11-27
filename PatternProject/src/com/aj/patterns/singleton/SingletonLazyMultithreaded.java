package com.aj.patterns.singleton;

public class SingletonLazyMultithreaded {
	private static SingletonLazyMultithreaded slm = null;
	
	private SingletonLazyMultithreaded() { }
	
	public static synchronized SingletonLazyMultithreaded getInstance() {
		if (slm == null)
			slm = new SingletonLazyMultithreaded();
		
		return slm;
	}
}
