package com.chapter7;

public class AccessTest {

	public static void main(String[] args) {
		
		Test1 test = new Test1();
		test.a=100;
		test.b=200;
		//test.c=300; Error because it is a private field
		test.setC(300);
		
		System.out.println("Value of a: "+test.a);
		System.out.println("Value of b: "+test.b);
		//System.out.println("Value of c: "+test.c); Cannot access directly because it is private field
		
		System.out.println("Value of c: "+test.getC());//this set and get concept is called encapuslation
		
		/* Wrapping of data or protected private field or property with public methods is called encapuslation  */
		

	}

}
