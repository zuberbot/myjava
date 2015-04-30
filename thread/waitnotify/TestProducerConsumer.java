/**
 * TestProducerConsumer
 */
package com.java.thread.waitnotify;

/**
 * 
 * @author Chuck
 *
 */
public class TestProducerConsumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Q q = new Q();
		Thread t1 = new Producer(q);
		Thread t2 = new Consumer(q);
		t1.start();
		t2.start();
	}
}
