package com.covent.list.linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * LinkedList
 * implement list, queue, deque
 * 
 * 34 --> 106 --> -1 --> 4 single linked list
 * 
 * 34 <--> 106 <--> -1 <--> 4 double-linked list
 * - no random
 * - no synchronized
 * - we can remove items very efficiently when removing from
 *   the begining and ending
 * 
 */
public class MainListLinkedList {

	public static void main(String[] args) {
		List<Integer> lista = new LinkedList<>();
		
		lista.add(5);
		lista.add(10);
		lista.add(20);
		lista.add(59);
		
		
		for(Integer name: lista)
			System.out.println(name);
		
		System.out.println();
		for(int i=0; i<lista.size(); i++) {
			if(lista.isEmpty()) {
				System.out.println("The list is empty");
			}else {
				lista.remove(0);
				System.out.println(lista.get(i));
			}
			
		}
		
				
		System.out.println();
		Object[] object = lista.toArray();
		for(Object o: object)
			System.out.println(o);

		//converte la lista in array
//		Arrays.asList(lista);
		System.out.println(Arrays.asList(lista));
	}

}
