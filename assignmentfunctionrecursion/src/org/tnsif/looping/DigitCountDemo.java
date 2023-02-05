package org.tnsif.looping;

public class DigitCountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count = 0, num = 456;
		
		while (num != 0) 
	    {
	      // number = number/10
	      num /= 10;
	      ++count;
	    }

	    System.out.println("Number of digits: " + count);
	    
	    /*for (; num != 0; num /= 10, ++count) 
	    {
	    }

	    System.out.println("Number of digits: " + count);*/
	}

}
