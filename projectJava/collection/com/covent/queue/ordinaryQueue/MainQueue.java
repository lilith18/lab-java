package com.covent.queue.ordinaryQueue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * FIFO
 * add
 * element() like peek
 * remove
 */
public class MainQueue {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.add("Adam");
		queue.add("Joe");
		queue.add("Nick");
		queue.add("Miklos");
		queue.add("Patrick");
		
		
		System.out.println(queue.element());
		System.out.println(queue.size());
		
		System.out.println(queue.remove());
		System.out.println(queue.size());
		
		for(String name: queue)
			System.out.println(name);

	}

}
