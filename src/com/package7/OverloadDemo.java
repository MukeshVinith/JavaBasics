package com.package7;

public class OverloadDemo {
	void test() {
		System.out.println("No paramaters");
	}

	/*
	 * void test(int a) { System.out.println("a:"+a); }
	 */ //commenting for auto conversion
	void test(int a , int b ) {
		System.out.println("a and b :"+a+" "+b);
	}
	double test(double a) {
		System.out.println("double a :"+a);
		return a*a;
	}

}
