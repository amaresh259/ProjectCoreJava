/**
 * 
 */
package com.core.designpatternpractice.abstractfactorypattern;

/**
 * @author amaresh.samal
 *
 */
public abstract class AbstractBankFactory {

	public abstract Bank getBankName();
	public abstract Loan getLoan();
	
}
