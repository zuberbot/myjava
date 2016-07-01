/**
 * B
 */
package com.java.thread;

/**
 * @author Chuck
 *
 */
public class B {

	synchronized void bar(A a) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered B.bar");
		System.out.println(name + " trying to call A.last()");
		a.last(); // locked by other thread
	}
	
	synchronized void last() {
		System.out.println("Inside B.last");
	}

}
