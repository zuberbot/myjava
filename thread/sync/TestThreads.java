/**
 * 
 */
package com.java.thread.sync;

/**
 * @author Chuck
 *
 */
public class TestThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyObject obj1 = new MyObject();
		//MyObject obj2 = new MyObject();
		
		MyThread thread1 = new MyThread(obj1, "1");
		MyThread thread2 = new MyThread(obj1, "2");
		
		thread1.start();
		thread2.start();

	}

}
