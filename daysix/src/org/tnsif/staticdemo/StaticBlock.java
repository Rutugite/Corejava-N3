package org.tnsif.staticdemo;

public class StaticBlock {
	private int num;
	//static varibale
	private static String name;
	

	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public static String getName() {
		return name;
	}


	

	//static block
	//ststtic block is used to initialize static variable
	static
	{
		name="Rutuja";
	}
	public static void setName(String name) {
		StaticBlock.name = name;
	}

}
