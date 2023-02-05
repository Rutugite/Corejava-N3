package org.tnsif.operator;
import java.util.Scanner;

public class OperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x & Y: ");
		int x=sc.nextInt();
		int y=sc.nextInt();

		// Arithmetic Operators
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);

		//Relational Operator
		/*boolean res=x>y;
		System.out.println(res);*/

		//Assignment 
		/*x*=y;
		System.out.println(x);*/

		// logical
		/*boolean res2=(5==5)&&(5>3);
		System.out.println(res2);    //true
		boolean res3=(5==5)&&(5<3);
		System.out.println(res3); //false*/

		//bitwise
		/*int a=12 & 5;
		int b=12|5;
		int c=12^5; 

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);*/

		//ternary 
		/*String res=(12%2==0)?"True":"False";
		System.out.println(res);

		String res3=(13%2==0)?"Even":"odd";
		System.out.println(res3);*/

		/*Increment & Decrement
		int p=++x;
		int q=--x;
		//System.out.print(p);
		System.out.print(q);*/
		sc.close();


	}

}
