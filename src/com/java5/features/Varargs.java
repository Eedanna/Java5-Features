/**
 * 
 */
package com.java5.features;

/**
 * @author Eedanna
 * 
 */
public class Varargs {

	/**
	 * 
	 */
	public Varargs() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final int sum = sumArrays(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 },
				new int[] { 100, 200 });
		System.out.println("Sum of the numbers is: " + sum);
	}

	static int sumArrays(final int[]... intArrays) {
		int sum, i, j;
		sum = 0;
		for (i = 0; i < intArrays.length; i++) {
			for (j = 0; j < intArrays[i].length; j++) {
				sum += intArrays[i][j];
			}
		}
		return (sum);
	}

}
