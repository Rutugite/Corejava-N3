package org.tnsif.assignmentFunctionRecursion;

import java.util.Scanner;

//to demonstrate example on factorial of a number using function
public class FactorialUsingFunction {
	
	//function definition
	static int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=i*fact;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the number: ");
		int num=s.nextInt();
		//fuction call
		System.out.println("Factorial of the number is: "+factorial(num));
		s.close();

	}

}
