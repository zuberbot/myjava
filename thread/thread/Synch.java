/**
 * Synch
 */
package com.java.thread;

/**
 * @author Chuck
 *
 */
public class Synch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Callme target = new Callme();
		Caller ob1 = new Caller(target, "Hello");
		Caller ob2 = new Caller(target, "Synchronized");
		Caller ob3 = new Caller(target, "World");

		// join() waits for thread to end
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException ie) {
			System.out.println("Interrupted");
		}
	}

}
