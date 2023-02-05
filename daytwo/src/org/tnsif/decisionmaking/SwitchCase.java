package org.tnsif.decisionmaking;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the song Number");
		int song=sc.nextInt();
		switch(song)
		{
		case 1:
		System.out.println(" Kesariya ");
		break;
		case 2:
		System.out.println(" Ved ");
		break;
		case 3:
		System.out.println(" calm down ");
		break;
		default:
		System.out.println(" invalid input ");

		}
		sc.close();

		

	}

}
