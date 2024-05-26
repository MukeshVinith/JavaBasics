package com.chapter10;

public class Except1 {

	public static void main(String[] args) {
		int a ,d;
		try {
			a =10;
			d = 0;
			int b  = a/d;
			System.out.println("B="+b);
		}catch(Exception e ) {
			System.out.println("Division by zero");
		}
		System.out.println("After the catch block");

	}

}
