/**
 * Producer
 */
package com.java.thread.waitnotify;

/**
 * 
 * @author Chuck
 *
 */
public class Producer extends Thread {

	private Q q;
	
	/**
	 * 
	 * @param q
	 */
	Producer(Q q) {
		this.q = q;
	}
	
	/**
	 * 
	 */
	public void run() {
		int i = 0;
		while (true) { q.put(i++); }
	}
}
