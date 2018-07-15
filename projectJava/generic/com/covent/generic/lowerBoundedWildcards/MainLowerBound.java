package com.covent.generic.lowerBoundedWildcards;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
 * Lower bound of the Wildcards
 * List<? super Number> 
 * - we can write number
 * - we cannot read in it
 * 
 * we are able to add subtitle of number
 * Integer, Double, Float
 * 
 */

class SumGeneriUpperBoundWildcards{
	public static <T> void sum(List<? super Number> lista) {
		//we are able to add sotto class
		lista.add(new Float(1.9f));
		lista.add(new Double(3.8d));
		lista.add(new Integer(4));
		
		//no se puo aggiungere sopra class
//		lista.add(new Object());
		for(Object num: lista) {
			System.out.println(num);
		}
		
	}
}
public class MainLowerBound {

	public static void main(String[] args) {
		List<Serializable> lista = new ArrayList<>();
		lista.add("Adam");
		lista.add("Joe");
		lista.add("Joel");
		lista.add("Nick");
		SumGeneriUpperBoundWildcards.sum(lista);
	}

}
