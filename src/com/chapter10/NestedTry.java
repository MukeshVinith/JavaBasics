package com.chapter10;

public class NestedTry {

	public static void main(String[] ar) {
		try {
			// need to pass arguments in eclipse
			int a =ar.length;
			int b = 10/a;
			try {
				if(a==1) {
					int result = a/(a-a);
				}
				if(a==2) {
					int[] c = {1};
					c[42]=10;
				}
			}catch(ArithmeticException e) {
				System.out.println("ArithmeticException at inner try-catch");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException at inner try-catch");
			}
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException at outer try-catch");
		}

	}

}
