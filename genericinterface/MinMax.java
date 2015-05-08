/**
 * 
 */
package com.java.genericinterface;

/**
 * Collections has a max min.
 * 
 * 
 * @author Chuck
 *
 */
public interface MinMax <T extends Comparable<T>> {
	
	public T min();
	public T max();

}
