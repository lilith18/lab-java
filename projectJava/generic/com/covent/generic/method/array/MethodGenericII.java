package com.udemy.generic.method.array;

public class MethodGenericII {
	
	/** Generic method with array */
	public <T> void gestisceArray(T[] array) {
		for(T t: array)
			System.out.println("Item from array ==> "+t.toString());
	}
	
	public <T> T showItem(T t) {
		System.out.println("The item is: "+ t.toString());
		return t;
	}
	
	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,5};
		MethodGenericII methodGeneric1 =new MethodGenericII();
		System.out.println("The returned item is= " );
		methodGeneric1.gestisceArray(arr);
		
		String[] name = {"Adam","Nick","Patric","Dybian","Rai"};
		MethodGenericII methodGeneric2 =new MethodGenericII();
		System.out.println("The returned item is= " );
		methodGeneric2.gestisceArray(name);

	}

}
