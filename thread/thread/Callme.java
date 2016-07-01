/**
 * Callme
 */
package com.java.thread;

/**
 * @author Chuck
 *
 */
public class Callme {

	/**
	 * Remove comment synchronized to see difference
	 */
	/*synchronized*/ void call(String msg) {
		System.out.print("[" + msg);

		try {
			Thread.sleep(500);
		} catch (InterruptedException ie) {
			System.out.println("Interrupted");
		}
		
		System.out.print("]\n");
	}
}
