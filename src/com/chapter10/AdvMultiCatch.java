package com.chapter10;

public class AdvMultiCatch {

	public static void main(String[] args) {
		try {
			int len = args.length;
			int a = 10/len; //need to add Arguments to test ArrayIndexOutOfBoundsException
			int[] b = {1};
			b[43]=10;
			
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught: "+e);
		}
	}

}
