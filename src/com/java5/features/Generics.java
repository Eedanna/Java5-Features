package com.java5.features;

import java.util.ArrayList;
import java.util.Iterator;

public class Generics {

	public Generics() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// without generics

		ArrayList withoutGeneric = new ArrayList();
		withoutGeneric.add(new String("FirstName"));
		withoutGeneric.add(new String("Last Name"));
		withoutGeneric.add(new String("Address"));

		for (Iterator i = withoutGeneric.iterator(); i.hasNext();) {
			System.out.println("Value = " + (String) i.next()); // explicit type
																// casting
		}

		// with Generics

		ArrayList<String> withGeneric = new ArrayList<String>();
		withGeneric.add(new String("FirstName"));
		withGeneric.add(new String("Last Name"));
		withGeneric.add(new String("Address"));

		for (Iterator<String> i = withGeneric.iterator(); i.hasNext();) {
			System.out.println("Value = " + i.next()); // No explicit type
														// casting
		}

		// Before Generics
		ArrayList beforeGeneric = new ArrayList();
		beforeGeneric.add(new String("FirstName"));
		beforeGeneric.add(new String("Last Name"));
		beforeGeneric.add(new String("Address"));
		beforeGeneric.add(new Integer(25));

		for (Iterator i = beforeGeneric.iterator(); i.hasNext();) {
			System.out.println("Value = " + (String) i.next()); // explicit type
																// casting
		}

		/*
		 * 0utput
		 * 
		 * Value = FirstName Value = Last Name Exception in thread "main"
		 * java.lang.ClassCastException: java.lang.Integer at
		 * com.java.features.Generics.main(Generics.java:21)
		 */

		// Before Generics
		ArrayList<String> afterGeneric = new ArrayList<String>();
		afterGeneric.add(new String("FirstName"));
		afterGeneric.add(new String("Last Name"));
		afterGeneric.add(new String("Address"));
		afterGeneric.add(new Integer(25)); // compilation error

		for (Iterator i = afterGeneric.iterator(); i.hasNext();) {
			System.out.println("Value = " + (String) i.next()); // no explicit
																// type casting
		}

	}

}
