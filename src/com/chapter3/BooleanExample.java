package com.chapter3;

public class BooleanExample {

	public static void main(String[] args) {
		boolean a = false;
		System.out.println("a value is "+a);
		a = true;
		System.out.println("a value is "+a);
		if(a) {
			System.out.println("This is executed if a value is true");
		}
		a = false;
		if(a) {
			System.out.println("This is executed if a value is true in second condition");
		}
		
		System.out.println("10>9 is "+ (10>9));//relation operator defines true and false
		System.out.println("Mukesh testing git ");

	}

}
