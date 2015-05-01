/**
 * Consumer
 */
package com.java.thread.waitnotify;

/**
 * 
 * @author Chuck
 *
 */
public class Consumer extends Thread {

	private Q q;
	
	/**
	 * 
	 * @param q
	 */
	Consumer(Q q) {
		this.q = q;
	}
	
	/**
	 * 
	 */
	public void run() {
		while (true) { q.get(); }
	}
}
