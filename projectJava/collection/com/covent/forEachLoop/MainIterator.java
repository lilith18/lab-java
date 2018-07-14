package com.udemy.forEachLoop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainIterator {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Adam");
		lista.add("Nick");
		lista.add("Patrick");
		
		Iterator<String> iteratorList = lista.iterator();
		
		while(iteratorList.hasNext()) {
			System.out.println(iteratorList.next());
		}

	}

}
