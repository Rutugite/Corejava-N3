package org.tnsif.annotations;

//demo on override annotation

class parent
{
	public void print()
	{
		System.out.println("Parent class method");
	}
}
class child extends parent{
	@Override
	public void print()
	{
		super.print();
		System.out.println("Child class method");
	}
}
public class OverrideAnnotationDemo {

	public static void main(String[] args) {
		child p=new child();
		p.print();
		
	}

}
