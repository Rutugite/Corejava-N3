package org.tnsif.interfacedemo;
//program to demonstrate on interface
//driver class
public class InterfaceExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we can't instantiate the interface
		//Bike b=new Bike();
		Avenger a=new Avenger();
		a.engine();
		a.milage(45);

	}

}
