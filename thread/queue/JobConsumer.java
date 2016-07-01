/**
 * JobConsumer
 */
package com.java.thread.queue;

/**
 * @author Chuck
 *
 */
public class JobConsumer extends JobThread {

	public JobConsumer(JobQueueManager jqm, String name) {
		super(jqm, name);
	}

	public void run() {
		while (!TestThreadQueue.producersAreDone) {
			// Keep trying to remove jobs until all producers are done
			Job job = this.jqm.removeFromQueue();
			
			if (job != null) {
				// Tracking
				System.out.println(this.name + " job <= queue: " + job.toString() + " QUEUE SIZE: " + this.jqm.jobs.size());
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
