package org.tnsif.stringdemo;
//program to demonstrate the example on string creation
import java.util.Scanner;

public class SampleStringDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//using string literal
		System.out.println("Enter the first string:");
		String str1=s.nextLine();
		System.out.println("First string is:"+str1);
		
		//using new keyword
		System.out.println("Enter the second string:");
		String str2=new String(s.nextLine());
		System.out.println("second string is:"+str2);
		s.close();
		if(str1.equals(str2))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("different");
		}
		char c[]= {'H','e','l','l','o'};
		String str3=new String(c);
		System.out.println(str3);
		
	}

}
