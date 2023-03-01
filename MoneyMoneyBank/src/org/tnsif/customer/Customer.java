package org.tnsif.customer;

import org.tnsif.application.MMBankFactory;
import org.tnsif.application.MMCurrentAcc;
import org.tnsif.application.MMSavingAcc;
import org.tnsif.framework.BankFactory;

public class  Customer{

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		BankFactory f = new MMBankFactory();
		MMSavingAcc s = new MMSavingAcc(1845, "Rutuja", 40000.0f, true);
		MMCurrentAcc c = new MMCurrentAcc(4518, "Purva", 60000.0f,70000.0f);
		
		System.out.println("Savings Account:");
		System.out.println(s);
		s.withdraw(4500); 		
		
		System.out.println();
		
		System.out.println("Current Account:");
		System.out.println(c);
		c.withdraw(5000);		
		
	}

}

