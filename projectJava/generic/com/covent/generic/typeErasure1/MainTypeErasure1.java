package com.covent.generic.typeErasure1;

//class Store<T> {
//	
//	private T t;
//	
//	public T getT() {
//		return t;
//	}
//	private void setT(T t) {
//		this.t = t;
//	}
//}

//java bycode replace the code in
class Store {
	
	/** the T has been sostituided by Object */
	private Object t;
	
	public Object getT() {
		return t;
	}
	public void setT(Object t) {
		this.t = t;
	}
}

public class MainTypeErasure1 {

	public static void main(String[] args) {
		Store fs1 = new Store();
		fs1.setT(new Integer(4));
		System.out.println(fs1.getT());
		
		Store fs2 = new Store();
		fs2.setT(new Double(4.4d));
		System.out.println(fs2.getT());
		
		Store fs3 = new Store();
		fs3.setT(new String("ok"));
		System.out.println(fs3.getT());

	}

}
