package org.tnsif.encapsulation;

import java.util.Scanner;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the pin: ");
		HDFC h=new HDFC();
		h.setPin(s.nextInt());
		System.out.println(h.getPin());
		h.accept();
        s.close();

	}

}
