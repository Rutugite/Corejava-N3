package org.tnsif.application;

import org.tnsif.framework.PrimeAcc;
public class GsPrimeAcc extends PrimeAcc {
	
	

	public GsPrimeAcc(int accno, String accnm, float charges, boolean isPrime) {
		super(accno, accnm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GsPrimeAcc [toString()=" + super.toString() + "]";
	}

	
}
