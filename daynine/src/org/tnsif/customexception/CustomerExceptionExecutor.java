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
			if(id!="rutujagite307@gmail.com" &&
					password!="abc@123")
				throw new LoginCredential("Invalid Credential");
			   
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
