package com.chapter10;

public class MultipleCatches {

	public static void main(String[] args) {
		try {
			// need to pass arguments in eclipse
			int len = args.length;
			int a = 10/len;
			int[] b = {1};
			b[42] = 10;
		}catch(ArithmeticException e) {
			System.out.println("Exception at ArithmeticException");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception at ArrayIndexOutOfBoundsException");
		}
		System.out.println("After try/catch block");
	}
		

}
