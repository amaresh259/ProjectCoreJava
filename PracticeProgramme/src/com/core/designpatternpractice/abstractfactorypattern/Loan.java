package com.core.designpatternpractice.abstractfactorypattern;

public abstract class Loan {

	protected double rate;
	abstract void getInterestRate(double rate);
	public void calculateLoanPayment() {
		
	}
}
