/**
 * Job
 */
package com.java.thread.queue;

/**
 * @author Chuck
 *
 */
public class Job {

	private String id;
	private String name;
	private String task;
	
	public Job() {
		this.id = "";
		this.name = "";
		this.task = "";
	}

	public Job(String id, String name, String task) {
		super();
		this.id = id;
		this.name = name;
		this.task = task;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the task
	 */
	public String getTask() {
		return task;
	}

	/**
	 * @param task the task to set
	 */
	public void setTask(String task) {
		this.task = task;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Job [id=" + id + ", name=" + name + ", task=" + task + "]";
	}

}
