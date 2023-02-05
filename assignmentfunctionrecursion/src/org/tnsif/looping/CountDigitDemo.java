package org.tnsif.looping;

public class CountDigitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count = 0, num = 3;
        for (; num != 0; num /= 10, ++count) 
	    {
	    }

	    System.out.println("Number of digits: " + count);
		
		/*while (num != 0) 
	    {
	      // number = number/10
	      num /= 10;
	      ++count;
	    }

	    System.out.println("Number of digits: " + count);*/
	    

	}

}
