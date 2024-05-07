package com.chapter7;

public class UseStatic {
	static int a = 10; //first static block will initialize
	static int b;
	
	static void meth(int x) {
		System.out.println("Value of x :"+x);
		System.out.println("Value of a :"+a);
		System.out.println("Value of b :"+b);
	}
	static { //second static block will be called
		System.out.println("Static block called...");
		b=a*4;
	}
	
	public static void main(String[] args) { //main static method will be called
		meth(20);

	}

}
