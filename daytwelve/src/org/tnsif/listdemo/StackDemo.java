package org.tnsif.listdemo;

import java.util.Stack;

//program to demonstrate on stack data structure
public class StackDemo {

	public static void main(String[] args) {
		Stack<String>obj=new Stack<>();
		obj.push("Rutuja");
		obj.push("Pratik");
		obj.push("Shubham");
		obj.push("Gauri");
		System.out.println("The elements inside the stack are:"+obj);
		obj.pop();	
		}

}
