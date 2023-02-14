package org.tnsif.exceptionhandlingdemo;
//program to demonstrate multiple catch block
import java.util.Scanner;

public class MultiCatchBlockDemo {

	public static void main(String[] args) {
		int arr[]=new int[] {11,22,33};
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x and y:");
		int x=s.nextInt();
		int y=s.nextInt();
		s.close();
			try {
				int res=x/y;
				System.out.println(res);
				System.out.println(arr[3]);
			}
			/*catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			catch(ArrayIndexOutOfBoundsException e) 
			{
				System.out.println(e);
		    }*/
			catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Exception Handled");
			}

	}

}
