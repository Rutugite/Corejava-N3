package org.tnsif.application;

import org.tnsif.framework.BankFactory;
import org.tnsif.framework.CurrentAcc;
import org.tnsif.framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAcc(int accno, String accnm, float accbal, boolean isSalaried) {
		MMSavingAcc s=new MMSavingAcc(accno,accnm,accbal,isSalaried);
		return s;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accno, String accnm, float accbal, float creditLimit) {
		MMCurrentAcc c=new MMCurrentAcc(accno, accnm, accbal, creditLimit);
		return c;
	}

}