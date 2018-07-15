package com.covent.generic.singleGeneric;

public class SingleGeneric<T> {
	
	private T t;
	
	public SingleGeneric(T t) {
		this.t = t;
	}
	
	@Override
	public String toString() {
		return "Single Generic " + t;
	}

	public static void main(String[] args) {
		SingleGeneric<String> prova1 = new SingleGeneric<>("is working for string");
		System.out.println(prova1);
		
		SingleGeneric<Integer> prova2 = new SingleGeneric<>(55);
		System.out.println(prova2);
		
		SingleGeneric<Double> prova3 = new SingleGeneric<>(25.7);
		System.out.println(prova3);
	}

}
