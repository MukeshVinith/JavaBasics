package com.chapter7;

public class Overload {

	public static void main(String[] args) {
		OverloadDemo ob = new OverloadDemo();
		double result;
		int i = 88;
		
		ob.test();
		ob.test(10);
		ob.test(10,20);
		result= ob.test(5.0);
		System.out.println("Result for ob.test double parameter : "+result);
		
		System.out.println("Result for ob.test double parameter while passing i: "+ ob.test(88));//auto conversion will occur and calls both int and double parameters
	}

}
