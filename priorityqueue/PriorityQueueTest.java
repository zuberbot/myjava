package com.java.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	static class PQsort implements Comparator<Integer> {

		public int compare(Integer one, Integer two) {
			return two - one;
		}
	}

	public static void main(String... args) {
		
		int[] ia = { 1, 10, 5, 3, 4, 7, 6, 9, 8 };

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(10, new PQsort());

		for (int x : ia) {
			pq.offer(x);
		}

		System.out.println("pq: " + pq);

		System.out.println("size: " + pq.size());
		
		// Highest priority element in queue without removing it
		System.out.println("peek: " + pq.peek());

		System.out.println("size: " + pq.size());
		
		// Highest priority element and remove it from the queue
		System.out.println("poll: " + pq.poll());

		System.out.println("size: " + pq.size());

		System.out.print("pq: " + pq);

	}
}
