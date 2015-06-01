/**
 * JobThread
 */
package com.java.thread.queue;

/**
 * @author Chuck
 *
 */
public class JobThread extends Thread {

	JobQueueManager jqm;
	String name;
	
	public JobThread() {
		this.jqm = new JobQueueManager();
		this.name = new String();
	}

	public JobThread(JobQueueManager jqm, String name) {
		this.jqm = jqm;
		this.name = name;
	}

}
