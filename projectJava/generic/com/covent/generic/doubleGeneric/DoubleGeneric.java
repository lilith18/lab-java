package com.covent.generic.doubleGeneric;

public class DoubleGeneric<K,V> {
	
	private K key;
	private V value;
	
	public DoubleGeneric(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Double Generic - key " + key + " - value "+value;
	}

	public static void main(String[] args) {
		DoubleGeneric<String, Integer> prova1 = new DoubleGeneric<>(" is working for string", 55);
		System.out.println(prova1);
		
		DoubleGeneric<Integer, Integer> prova2 = new DoubleGeneric<>(55, 18);
		System.out.println(prova2);
		
		DoubleGeneric<Double, String> prova3 = new DoubleGeneric<>(25.7, " is a double");
		System.out.println(prova3);
	}

}
