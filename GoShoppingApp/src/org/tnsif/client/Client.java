package org.tnsif.client;

import org.tnsif.application.GSNormalAcc;
import org.tnsif.application.GSShopFactory;
import org.tnsif.application.GsPrimeAcc;
import org.tnsif.framework.ShopFactory;

@SuppressWarnings("unused")
public class Client {
	public static void main(String args[])
	{
		GSShopFactory s= new GSShopFactory();
		GsPrimeAcc g=new GsPrimeAcc(123, "Rasika waghchoure ", 908f, true);
		GSNormalAcc n=new GSNormalAcc(124,"sayali",8956f,90f);
		//prime acc
		System.out.println("Prime Acc");
		System.out.println(g);
		g.bookProduct(g.getCharges());
		
		//normal acc
		System.out.print("Normal Acc");
		System.out.print(n);
		n.bookProduct(n.getCharges());
		
	}

}