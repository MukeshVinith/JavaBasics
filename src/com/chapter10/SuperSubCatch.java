package com.chapter10;

public class SuperSubCatch {

	public static void main(String[] args) {
		try {
			// need to pass arguments in eclipse
			int len = args.length;
			int a = 10/len;
			int[] b = {1};
			b[42] = 10;
		}catch(Exception e) {
			System.out.println("Super class Exception"+e);
		} /*
			 * catch(ArithmeticException e) {
			 * System.out.println("Exception at ArithmeticException");
			 * }catch(ArrayIndexOutOfBoundsException e) {
			 * System.out.println("Exception at ArrayIndexOutOfBoundsException"); }
			 *///unreachable catch block because above superclass Exception is declared
		System.out.println("After try/catch block");
	}

}
