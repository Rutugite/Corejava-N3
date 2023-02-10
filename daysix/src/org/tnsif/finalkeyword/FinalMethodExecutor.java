package org.tnsif.finalkeyword;

public class FinalMethodExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pineapple p=new Pineapple();
		p.Flavour="MixedFruit";
		p.display();
		p.setPrice(250);
		p.display(p.getPrice());

	}

}
