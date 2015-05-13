package com.java.singleton;

public class Singleton {

	private static Singleton instance = null;

	protected Singleton() { /* defeat instantiation */ }

	public synchronized static Singleton getInstance() {
		if (instance == null) { instance = new Singleton(); }
		return instance;
	}
}
