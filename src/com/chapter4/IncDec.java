package com.chapter4;

public class IncDec {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c;
		int d;
		c=++b;
		d=a++;
		c++;
		System.out.println("Value of a="+a);//1-->2
		System.out.println("Value of b="+b);//2-->3
		System.out.println("Value of c="+c);//3-->4
		System.out.println("Value of d="+d);//1
	}

}
