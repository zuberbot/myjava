/**
 * ThreadTwo
 */
package com.java.thread;

/**
 * @author Chuck
 *
 */
public class ThreadTwo implements Runnable {

	A a;
	B b;

	public ThreadTwo(A a, B b) {
		this.a = a;
		this.b = b;
	}
	
	public void run() {
		a.foo(b);
	}
}
