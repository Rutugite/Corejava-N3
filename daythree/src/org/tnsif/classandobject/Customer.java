package org.tnsif.classandobject;

public class Customer {

	
	int id;
	String custname;
	String city;

	public Customer()
	{

	}
	public Customer(int id,String custname,String city)
	{
	this.id=id;
	this.custname=custname;
	this.city=city;
	}
	void display()
	{
	System.out.println(id+" "+" "+custname+" "+city);


	}

}
