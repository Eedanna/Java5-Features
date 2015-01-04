/**
 * 
 */
package com.java5.features.enums;

/**
 * @author Eedanna
 * 
 * The Class Enum
 */
public class Enum {

	/**
	 * 
	 */
	public Enum() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(UserStatus.ACTIVE.getStatusCode());
		System.out.println(UserStatus.PENDING.getStatusCode());
		System.out.println(UserStatus.INACTIVE.getStatusCode());
		System.out.println(UserStatus.DELETED.getStatusCode());
	}

}
