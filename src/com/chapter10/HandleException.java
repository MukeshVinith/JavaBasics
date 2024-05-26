package com.chapter10;

import java.util.Random;

public class HandleException {

	public static void main(String[] args) {
		int a ;
		int b ;
		int c ;
		Random r = new Random();
		for(int i =0;i<10;i++) {
			try {
				b=r.nextInt();
				c=r.nextInt();
				a=12345/(b/c);
			}catch(Exception e) {
				System.out.println("Divided by zero");
				System.out.println("Exception "+e);
				a=0;
			}
			System.out.println("Value of a : "+a);
		}

	}

}
