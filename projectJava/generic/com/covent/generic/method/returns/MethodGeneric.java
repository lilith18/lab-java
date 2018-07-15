package com.covent.generic.method.returns;

public class MethodGeneric {
	
	
		
	public <T> T gestisceGenericReturn(T t) {
		return  t;
	}
	
	

	public static void main(String[] args) {
		
		MethodGeneric prova2 = new MethodGeneric();
		System.out.println(prova2.gestisceGenericReturn(55));
		
		MethodGeneric prova3 = new MethodGeneric();
		System.out.println(prova3.gestisceGenericReturn(1.3));
	}

}
