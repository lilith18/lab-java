package com.udemy.generic.method.voids;

public class MethodGeneric {
	
	
	
	public <T> void gestisceGeneric(T t) {
		System.out.println("The item is: "+t.toString());
	}
	
	
	public static void main(String[] args) {
		MethodGeneric prova1 = new MethodGeneric();
		prova1.gestisceGeneric("ciao");
		
		
	}

}
