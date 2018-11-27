package com.aj.patterns.singleton;

public class SingletonEager {
	private static SingletonEager se = new SingletonEager();
	
	private SingletonEager() { }
	
	public static SingletonEager getInstance() {
		return se;
	}
}
