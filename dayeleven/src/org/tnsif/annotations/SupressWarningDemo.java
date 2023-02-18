package org.tnsif.annotations;

import java.util.Scanner;

public class SupressWarningDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		//this annotation is used to remove the warning which occur at the compile time
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		System.out.println(x);

	}

}
