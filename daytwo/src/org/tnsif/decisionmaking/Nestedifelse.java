package org.tnsif.decisionmaking;
import java.util.Scanner;

public class Nestedifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age and weight of a person");
		int age=sc.nextInt();
		int weight=sc.nextInt();

		if(age>=12)
		{
		if(weight>=40)
		{
		if(weight<=120)
		{
		System.out.println(" Eligible for Bunjee Jumping");
		}
		else
		{
		System.out.println(" Extra Ropes Will be Added");
		}
		}
		else
		{
		System.out.println(" You are not Eligible for Bunjee Jumping");
		}
		}
		else
		{
		System.out.println(" You are not Eligible for Buje Jumping");
		}
		sc.close();


	}

}
