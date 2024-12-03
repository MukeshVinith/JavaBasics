package com.lambda;

public class TestClass {

	public static void main(String[] args) {
		TestInterface square = n -> (n*n);
		System.out.println("Square of int is :"+square.test(3));
	}
 
	
}
