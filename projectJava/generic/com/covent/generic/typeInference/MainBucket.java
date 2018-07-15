package com.covent.generic.typeInference;

import java.util.ArrayList;
import java.util.List;

class Bucket<T>{
	
	T t;
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t= t;
	}
	
	public static <T> void addBucket(T t, List<Bucket <T>> list) {
		//don't need to put <T> on the right because if TypeInterference
		Bucket<T> bucket = new Bucket<>();
		bucket.setT(t);
		list.add(bucket);
		System.out.println(t.toString()+ "has been added to the list.");
		
	}
	
}
public class MainBucket {

	public static void main(String[] args) {
		List<Bucket<String>> lista = new ArrayList<>();
		String name = "Adam";
		//it should be work but it doesn't
//		MainBucket.addBucket(name, lista);
	}

	

	

}
