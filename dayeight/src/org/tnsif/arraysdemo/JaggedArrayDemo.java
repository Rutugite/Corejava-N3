package org.tnsif.arraysdemo;
import java.util.Scanner;
//program to demonstrate Jagged array
public class JaggedArrayDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[][]=new int[2][];
		//First array has 3 columns
		arr[0]=new int[3];
		//Second array has 2 columns
		arr[1]=new int[2];
		System.out.println("Enter the array elements:");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
		s.close();
	}

}
