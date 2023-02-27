package org.tnsif.genericsdemo;
import java.awt.List;
import java.util.ArrayList;
//program to demonstrate on Advantages of generics

@SuppressWarnings("unused")
public class GenericsAdvantagesExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//1.Type-safety
				//without Generics
				@SuppressWarnings("rawtypes")
				ArrayList obj=new ArrayList<>();
				obj.add(15);
				obj.add("15");
				System.out.println("Without Generics "+obj);
				//with Genrics
				ArrayList<Integer> obj1=new ArrayList<>();
				obj1.add(15);
				//obj1.add("15");
				System.out.println("With Generics "+obj1);

				//2.Typecasting is allowed before generics
				@SuppressWarnings("rawtypes")
				ArrayList obj2=new ArrayList<>();
				obj2.add("MET");
				//type casting
				String str=(String)obj2.get(0);
				System.out.println(str);
				
				//with generics,Typecasting is not allowed 
				ArrayList<String> obj3=new ArrayList<>();
				obj3.add("MET");
				String str1=obj3.get(0);
				System.out.println(obj3);


	}

}
