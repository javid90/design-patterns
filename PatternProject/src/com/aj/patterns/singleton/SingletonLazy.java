package com.aj.patterns.singleton;

public class SingletonLazy {
	private static SingletonLazy sl = null;
	private SingletonLazy() { }
	
	public static SingletonLazy getInstance() {
		if (sl == null)
			sl = new SingletonLazy();
		return sl;
	}

}
