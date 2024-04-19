package com.chapter4;

public class OpEquals {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		a +=5; //a=a+5-->a=1+5-->a=6
		b -=6; //b=b-6-->b=2-6-->b=-4
		c *= a+b;//c=c*(a+b)-->c=c*(-2)-->c=3*(-2)-->c=-6
		c %=3;//c=c%3-->c=-6%3-->c=0
		System.out.println("Value of a="+a);//1-->6
		System.out.println("Value of b="+b);//2-->-4
		System.out.println("Value of c="+c);//3-->-6-->0
	}

}
