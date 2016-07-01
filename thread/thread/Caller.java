/**
 * Caller
 */
package com.java.thread;

/**
 * @author Chuck
 *
 */
public class Caller implements Runnable {

	String msg;
	Callme target;
	Thread t;
	
	/**
	 * 
	 */
	public Caller(Callme target, String s) {
		this.target = target;
		msg = s;
		
		// Run this thread
		t = new Thread(this);
		t.start();
	}

	public void run() {
		// Each time this thread starts it wants to run call method
		target.call(msg);
	}
}
