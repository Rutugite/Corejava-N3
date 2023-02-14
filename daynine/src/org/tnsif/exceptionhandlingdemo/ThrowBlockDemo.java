package org.tnsif.exceptionhandlingdemo;
//program to demonstarte throw and throws keyword
import java.io.IOException;
public class ThrowBlockDemo {
	public static void donate(int age,int weight)throws Exception
	{
		if(age>18 && weight>50) 
		{
			System.out.println("Eligible to donate the blood");
		}
		else
		{
			throw new IOException("not eligible");
		}
			
	}

	public static void main(String[] args) throws Exception{
		try
		{
			//method call
			donate(17,55);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		

	}

}
