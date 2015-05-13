package com.java.singleton;

public class Singleton2 {
	public final static Singleton2 INSTANCE = new Singleton2();

	private Singleton2() { /* Defeat instantiation */ }
}

// Fast AND Thread safe
// Usage: Singleton2 singleton = Singleton2.INSTANCE;
