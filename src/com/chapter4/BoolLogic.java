package com.chapter4;

public class BoolLogic {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c = a & b;
		boolean d = a | b ;
		boolean e = (a ^ b);
		boolean f = !a;
		System.out.println("Value of a = "+a);//true
		System.out.println("Value of b = "+b);//false
		System.out.println("Value of c = "+c);//false
		System.out.println("Value of d = "+d);//true
		System.out.println("Value of e = "+e);//true
		System.out.println("Value of f = "+f);//false

	}

}
