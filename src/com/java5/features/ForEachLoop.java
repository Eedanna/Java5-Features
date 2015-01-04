/**
 * 
 */
package com.java5.features;

/**
 * @author Eedanna
 *
 * The Class ForEachLoop
 */
public class ForEachLoop {

	/**
	 * 
	 */
	public ForEachLoop() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String[] beforeEnhanceLoop = new String[5];
		beforeEnhanceLoop[0] = "Java";
		beforeEnhanceLoop[1] = "JEE";
		beforeEnhanceLoop[2] = "Servlets";
		beforeEnhanceLoop[3] = "JSP";
		beforeEnhanceLoop[4] = "Struts";
		beforeEnhanceLoop[5] = "Spring";
		for (int i = 0; i < beforeEnhanceLoop.length; i++) {
			System.out.println("Before Enhance Loop is " + beforeEnhanceLoop[i]);
		}
		
		/* 0utput
		 *
		 Before Enhance Loop is Winklemann
		 Before Enhance Loop is Ruiz
		 Before Enhance Loop is Gandhi
		 Before Enhance Loop is Yakazuki
		 Before Enhance Loop is Jones
		 */
		
		final String[] afterEnhanceLoop = new String[5];
		afterEnhanceLoop[0] = "Java";
		afterEnhanceLoop[1] = "JEE";
		afterEnhanceLoop[2] = "Servlets";
		afterEnhanceLoop[3] = "JSP";
		afterEnhanceLoop[4] = "Struts";
		afterEnhanceLoop[5] = "Spring";
		for (final String thisName : afterEnhanceLoop) { // Enhnaced For Loop - For Each loop
			System.out.println("After Enhance Loop is " + thisName);
		}
		
		/*0utput
		 * 
		 *After Enhance Loop is Winklemann
		  After Enhance Loop is Ruiz
		  After Enhance Loop is Gandhi
		  After Enhance Loop is Yakazuki
		  After Enhance Loop is Jones
		 */
	}

}
