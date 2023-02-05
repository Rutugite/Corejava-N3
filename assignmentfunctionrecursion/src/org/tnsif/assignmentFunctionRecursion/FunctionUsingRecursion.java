package org.tnsif.assignmentFunctionRecursion;

import java.util.Scanner;

//example on factorial of a number using recursion
public class FunctionUsingRecursion {
	//function definition
	static int factorial(int num)
	{
		if(num!=0)
			return num*factorial(num-1);
		
		return 1;
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
