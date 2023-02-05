package org.tnsif.looping;
import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=n;i>=1;i--)
		{
			System.out.print(i+" ");
		}
	}

}
