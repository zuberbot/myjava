/**
 * A
 */
package com.java.thread;

/**
 * @author Chuck
 *
 */
public class A {

	synchronized void foo(B b) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered A.foo");
		System.out.println(name + " trying to call B.last()");
		b.last(); // locked by other thread
	}
	
	synchronized void last() {
		System.out.println("Inside A.last");
	}
}
