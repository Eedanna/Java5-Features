package com.java5.featutes.annotation;

public @interface Annotation {
	String message() default "List is not valid";
}

/*
   Some of the Annotations listed here :

	@Override - Checks that the method is an override. Causes a compile error if the method is not found in one of the parent classes or implemented interfaces.
	@Deprecated - Marks the method as obsolete. Causes a compile warning if the method is used.
	@SuppressWarnings - Instructs the compiler to suppress the compile time warnings specified in the annotation parameters.
	@SafeVarargs - Suppress warnings for all callers of a method or constructor with a generics varargs parameter, since Java 7.
	@FunctionalInterface - Specifies that the type declaration is intended to be a functional interface, since Java 8.
 
 */
