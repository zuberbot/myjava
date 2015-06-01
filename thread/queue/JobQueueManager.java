/**
 * JobQueueManager
 */
package com.java.thread.queue;

import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * @author Chuck
 *
 */
public class JobQueueManager {

	// Resource
	Queue<Job> jobs;
	
	public JobQueueManager() {
		// Limit the maximum capacity of our queue to 10
		jobs = new LimitedQueue<Job>(10);
	}

	/**
	 * Add a job to the queue.
	 * 
	 * @param job
	 */
	synchronized void addToQueue(Job job) {
		boolean added = this.jobs.add(job);
		
		if (added) {
			// Let's give other threads a shot at the resource
			notifyAll();
		}
		else {
			try {
				// Let's wait until more jobs are consumed
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Remove a job from the queue.
	 * 
	 * @return
	 */
	synchronized Job removeFromQueue() {
		Job job = null;
		
		if (this.jobs.isEmpty()) {
			try {
				// Let's wait until more jobs are added
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		else {
			try {
				job = this.jobs.remove();
				// Let's let other threads have a shot at the queue
				notifyAll();		
			}
			catch (NoSuchElementException nsee) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}				
			}
		}
		
		return job;
	}
}
