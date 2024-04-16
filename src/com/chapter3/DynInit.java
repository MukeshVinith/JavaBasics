package com.chapter3;

public class DynInit {

	public static void main(String[] args) {
		double a = 3.0 , b = 4.0;
		//here c is dynamically initialized
		
		double c = Math.sqrt(a*a+b*b);
		System.out.println("Hypotenuse is "+c);

	}

}
