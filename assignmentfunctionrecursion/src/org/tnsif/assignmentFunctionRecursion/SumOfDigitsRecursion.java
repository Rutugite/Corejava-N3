package org.tnsif.assignmentFunctionRecursion;
//example on sum of digits of a number using recursion
import java.util.Scanner;

public class SumOfDigitsRecursion {
	// Function to check sum of digit using recursion
    static int sumofdigit(int num)
    {
        if (num == 0)
            return 0;
        return (num % 10 + sumofdigit(num / 10));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the number: ");
		int num=s.nextInt();
		int res=sumofdigit(num);
        System.out.println("Sum of digits is:" +res);
        s.close();
		
		

	}

}
