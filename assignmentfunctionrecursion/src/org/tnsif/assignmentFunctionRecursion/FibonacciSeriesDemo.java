package org.tnsif.assignmentFunctionRecursion;

import java.util.Scanner;
//example on fibonacci series of a number using recursion

public class FibonacciSeriesDemo {
	static int fibonacci(int num)
    {
        if (num <= 1)
            return num;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the number: ");
		int num=s.nextInt();
		//fuction call
		System.out.println("Fibonacci number is: "+fibonacci(num));
		s.close();
		

	}

}
