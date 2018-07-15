package com.covent.list.vector;

import java.util.List;
import java.util.Vector;

/* vector are sincronization */
public class MainVector {

	public static void main(String[] args) {
		List<Integer> vector = new Vector<>();
		
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);
		
		vector.remove(0);
		
		for(Integer i: vector)
			System.out.println(i);
	}

}
