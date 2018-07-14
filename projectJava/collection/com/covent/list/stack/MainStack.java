package com.udemy.list.stack;

import java.util.Stack;

/* LIFO
 * 
 * - push the obj on the top
 * - peek get the obj at the top of the stack and not remove it
 * - pop return the obj and remove items from the top.
 *  
 *  the top of the stack is the last item that has been inserted
 *  */

public class MainStack {

	public static void main(String[] args) {
		
		Stack<Integer>  stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50); //last insert is the top of the stack
		
		System.out.println(stack.peek()); //50
		
		System.out.println(stack.pop()); //50
		
		System.out.println(stack.size()); //50
		
		for(int i=0; i<stack.size(); i++) {
			if(!stack.empty())
				System.out.println(stack.elementAt(i));
			
		}
		

	}

}
