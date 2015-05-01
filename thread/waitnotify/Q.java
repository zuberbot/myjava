/**
 * Q
 */
package com.java.thread.waitnotify;

/**
 * 
 * @author Chuck
 *
 */
public class Q {

	private int n;
	private boolean valueSet = false;
	
	/**
	 * 
	 * @return
	 */
	synchronized int get() {
		while (!valueSet) {
			// If value is not set then wait and let the Producer put
			try { Thread.sleep(1000); wait(); } catch (InterruptedException e) { }
		}
	
		System.out.println("Got: " + n);
		valueSet = false;
		notify();
		return n;
	}
	
	/**
	 * 
	 * @param n
	 */
	synchronized void put(int n) {
		while (valueSet) {
			// If value is set then wait and let the Consumer get
			try { Thread.sleep(1000); wait(); } catch (InterruptedException e) { }			
		}
		
		this.n = n;
		valueSet = true;
		System.out.println("Put: " + n);
		notify();
	}
}
