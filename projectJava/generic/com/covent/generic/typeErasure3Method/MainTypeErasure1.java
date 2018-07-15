package com.covent.generic.typeErasure3Method;

import java.io.Serializable;

//class Node<T> {
//	
//	private T t;
//	
//	public Node(T t) {
//		this.t = t;
//	}
//	private void setT(T t) {
//		this.t = t;
//	}
//}

//java bycode replace the code T by Object
class Node {
	
	/** the T has been sostituided by Object */
	private Object t;
	
	public Node(Object t) {
		this.t =  t;
	}
	public void setT(Object t) {
		this.t = t;
	}
}

//class MyNode extends Node<Integer>{
//
//	public MyNode(Integer t) {
//		super(t);
//	}
//	public void setT(Integer t) {
//		super.setT(t);
//	}
//	
//}

class MyNode extends Node{

	public MyNode(Object t) {
		super(t);
	}
	public void setT(Object t) {
		super.setT(t);
	}
	
	//java created a switch method
	public void setData(Object t) {
		setT((Integer)t);
	}
	
}
public class MainTypeErasure1 {

	public static void main(String[] args) {
		

	}

}
