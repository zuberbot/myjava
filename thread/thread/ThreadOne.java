/**
 * ThreadOne
 */
package com.java.thread;

/**
 * @author Chuck
 *
 */
public class ThreadOne implements Runnable {

	A a;
	B b;
	
	public ThreadOne(A a, B b) {
		this.a = a;
		this.b = b;
	}
	
	public void run() {
		b.bar(a);
	}

}
