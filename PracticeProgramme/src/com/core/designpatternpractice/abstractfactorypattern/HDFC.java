package com.core.designpatternpractice.abstractfactorypattern;

public class HDFC implements Bank {

	public final String BNAME;
	public HDFC() {
		BNAME = "HDFC";
	}

	@Override
	public String getBankName() {
		return null;
	}

}
