package com.udemy.list.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainList {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		lista.add("Adam");
		lista.add("Nick");
		lista.add("Patrick");
		lista.add("Rei");
		lista.add("Miklos");
		lista.add("Dybian");
		
		for(String name: lista)
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
