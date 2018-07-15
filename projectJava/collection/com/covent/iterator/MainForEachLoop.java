package com.covent.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainForEachLoop {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Adam");
		lista.add("Nick");
		lista.add("Patrick");
		
		for(String name: lista) {
			System.out.println(name);
		}

	}

}
