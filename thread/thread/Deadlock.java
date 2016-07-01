/**
 * Deadlock Example
 * 
 * T1 owns the monitor on b, while it is waiting for the monitor on a.  
 * T2 owns the monitor on a, and it is waiting to get b. This program will 
 * never complete.  If your multithreaded program locks up occasionally 
 * deadlock is on the first conditions that you should check for.
 */
package com.java.thread;

/**
 * @author Chuck
 *
 */
public class Deadlock {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		A a = new A();
		B b = new B();

		Thread t1 = new Thread(new ThreadOne(a, b), "T1");
		Thread t2 = new Thread(new ThreadTwo(a, b), "T2");

		System.out.println("Begin running the threads");
		
		t1.start();
		t2.start();
		
		// T1 has a lock on resource b via its run method
		// T2 has a lock on resource a via its run method
		// T1 trying to call a.last <but it's locked by T2>
		// T2 trying to call b.last <but it's locked by T1>
	}

}
