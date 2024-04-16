package com.chapter3;

public class CastingRules {

	public static void main(String[] args) {
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = 0.1234;
		double result = (f*b)+(i/c)+(d*s);
		System.out.println((f*b)+"+"+(i/c)+"+"+(d*s));
		System.out.println(result);
		
		/*
		 * we have two rules 
		 * 1. when byte,char,short perform operation with int the result will be int.
		 *  2. priority order is double,float,long,int.
		 */
	}

}
