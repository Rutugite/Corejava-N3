package org.tnsif.exceptionhandlingdemo;
//program to demonstrate on arithmetic exception
import java.util.Scanner;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x and y:");
		int x=s.nextInt();
		int y=s.nextInt();
		s.close();
		//try block contains the exception code
		try {
			int res=x/y;
			System.out.println(res);
		}
		//
		catch(Exception e)
		{
			System.out.println("Exception handled using catch"+e);
		}
		finally 
		{
			System.out.println("Finally Block");
		}

	}

}
