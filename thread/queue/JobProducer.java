/**
 * JobProducer
 */
package com.java.thread.queue;

import java.util.Random;

/**
 * @author Chuck
 *
 */
public class JobProducer extends JobThread {

	public JobProducer(JobQueueManager jqm, String name) {
		super(jqm, name);
	}

	public void run() {
		// Let's arbitrarily create 5 jobs
		for (int i = 0; i < 5; i++) {
			Job job = jobFactoryCreator(i);
			this.jqm.addToQueue(job);
			
			// Tracking
			System.out.println(this.name + " job => queue: " + job.toString() + " QUEUE SIZE: " + this.jqm.jobs.size());
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	protected Job jobFactoryCreator(int i) {
		Random rand = new Random();
		int taskId = rand.nextInt(100);
		String id = i + name;
		String name = "JOB" + id;
		String task = "TASK" + taskId;
		Job job = new Job(id, name, task);
		return job;
	}
}
