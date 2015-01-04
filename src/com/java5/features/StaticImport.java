/**
 * 
 */
package com.java5.features;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

/**
 * @author Eedanna
 * 
 * The Class StaticImport
 * 
 */
public class StaticImport {

	/**
	 * 
	 */
	public StaticImport() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Example -1
		//Before Java-5
        System.out.println("Maximum value of int variable in Java without " + Integer.MAX_VALUE);
        System.out.println("Minimum value of int variable in Java without " + Integer.MIN_VALUE);
      
        //Java 5
        System.out.println("Maximum value of int variable using " +  MAX_VALUE);
        System.out.println("Minimum value of int variable using" +  MIN_VALUE);

        // Example -2
		String intValue = "123";
		String dblValue = "567.89";
		double resultValue = 0;
		try {
			resultValue = parseInt(intValue) + parseDouble(dblValue);
			System.out.println("result is " + resultValue);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
