package com.covent.generic.comparables;

public class CalculateMinComparable {

	/* CalculateMinComparable
	 * 
	 * String implements Comparable interface
	 * and Serializable
	 * and CharSequence
	 * 
	 * Integer implements Comparable interface
	 * and Serializable
	 * but extends Number and Object
	 */
	public static <T extends Comparable<T>> T calculateMin(T t1, T t2) {
		if(t1.compareTo(t2) < 0)
			return t1;
		return t2;
	}
	public static void main(String[] args) {
		System.out.println(calculateMin(100, 23));
		System.out.println(calculateMin("Joe", "Adam"));
		System.out.println(calculateMin('v', 'h'));

	}

}
