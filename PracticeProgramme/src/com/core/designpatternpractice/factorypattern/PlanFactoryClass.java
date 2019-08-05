/**
 * 
 */
package com.core.designpatternpractice.factorypattern;

/**
 * @author amaresh.samal
 *
 */
public class PlanFactoryClass {

	public static Plan getPlan(String planType) {
		
		if(planType == null) {
			return null;
		}else if(planType.equalsIgnoreCase("DOMESTIC_PLAN")) {
			return new DomesticPlan();
		}else if(planType.equalsIgnoreCase("COMERCIALL_PLAN")) {
			return new ComercialPlan();
		}
		return null;
	}
}
