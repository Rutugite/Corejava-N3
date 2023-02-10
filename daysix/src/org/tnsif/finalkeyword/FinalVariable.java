package org.tnsif.finalkeyword;
//program to demonstrate the program on final keyword
public class FinalVariable {
	
	//final variable
	final static int x=15;
	public static void print()
	{
		/*we cant change the value of x here as x is declare as final
		System.out.println("The value of x is:"+x);
		x=17*/
		System.out.println("The value of x is:"+x);
	}
	public static void main(String args[])
	{
		FinalVariable.print();
	}

}
