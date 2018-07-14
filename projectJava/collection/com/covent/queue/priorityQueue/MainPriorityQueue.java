package com.udemy.queue.priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

/*
 * add
 * peek
 * poll - retruieves and removes the head of the queue and returns null if the queue is empty
 */

class Person implements Comparable<Person>{
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Person: " + this.name + " - " + this.age;
	}

//	@Override
//	public int compareTo(Person otherPerson) {
//		
//		return Integer.compare(this.age, otherPerson.getAge());
//	}
	
//	@Override
//	public int compareTo(Person otherPerson) {
//		
//		return this.name.compareTo( otherPerson.getName());
//	}
	
	//rever order
	@Override
	public int compareTo(Person otherPerson) {
		
		return -this.name.compareTo( otherPerson.getName());
	}

}

public class MainPriorityQueue {

	public static void main(String[] args) {
		
		Queue<Person> queue = new PriorityQueue<>();
		
		queue.add(new Person("Kevin",23));
		queue.add(new Person("Joe",13));
		queue.add(new Person("Adam",33));
		queue.add(new Person("Anna",43));
		queue.add(new Person("Patrick",53));
		queue.add(new Person("Dybian",63));
		
		while(queue.peek() != null) {
			System.out.println(queue.poll());
		}

	}

}
