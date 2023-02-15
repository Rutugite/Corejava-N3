package org.tnsif.customexception;
import java.util.Scanner;

public class CustomerExceptionExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String id=s.nextLine();
		String password=s.nextLine();
		s.close();
		try
		{
			if(id.equals("rutujagite307@gmail.com") && password.equals("abc@123"))
			{
				throw new LoginCredential("Invalid Credential");
			}
			else
			{
				throw new LoginCredential("Credential matched");
			}
			   
		} 
		catch(LoginCredential e)
		{
			System.out.println("Exception Handled"+e);
		}
		finally
		{
			System.out.println("Finally Block");
		}

	}

}
