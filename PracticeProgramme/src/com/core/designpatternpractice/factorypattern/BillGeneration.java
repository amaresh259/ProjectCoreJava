/**
 * 
 */
package com.core.designpatternpractice.factorypattern;

import java.util.Scanner;

/**
 * @author amaresh.samal
 *
 */
public class BillGeneration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sInput = new Scanner(System.in);
		
		String planType = sInput.nextLine();
		int units = sInput.nextInt();
		
		Plan p = PlanFactoryClass.getPlan(planType);
		p.getRate();
		double bill = p.calculateBill(units);
		System.out.println(bill);
		
		
		

}
}
