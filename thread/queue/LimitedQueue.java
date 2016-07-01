/**
 * 
 */
package com.java.thread.queue;

import java.util.LinkedList;

/**
 * @author Chuck
 *
 */
public class LimitedQueue<E> extends LinkedList<E> {

	private static final long serialVersionUID = -1421248563170925689L;
	
	private int limit;

    public LimitedQueue(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean add(E o) {
    	if (size() < limit) {
    		super.add(o);
    		return true;
    	}

        return false;
    }
}
