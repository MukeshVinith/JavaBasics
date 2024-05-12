package com.chapter8;

public class SimpleInheritance {

	public static void main(String[] args) {
		A superObj = new A ();
		B subObj = new B ();
		superObj.i=10;
		superObj.j=20;
		System.out.println("Context of SuperClass:");
		superObj.showij();
		System.out.println();
		
		subObj.i=6;
		subObj.j=7;
		subObj.k=8;
		System.out.println("Context of SubClass:");
		subObj.showij();
		subObj.showk();
		subObj.sum();
	}

}
