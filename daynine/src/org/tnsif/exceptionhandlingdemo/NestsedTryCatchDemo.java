package org.tnsif.exceptionhandlingdemo;
//program to demonstrate nested try catch block
import java.util.Scanner;

public class NestsedTryCatchDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x and y:");
		int x=s.nextInt();
		int y=s.nextInt();
		int arr[]=new int[] {11,22,33};
		s.close();
		
		try {
			try {
				System.out.println(arr[3]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Exception Handled"+e);
			}
			try {
				int res=x/y;
				System.out.println(res);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Exception Handled"+e);
			}
		}
		finally
		{
			System.out.println("Finally Block");
		}

	}

}
